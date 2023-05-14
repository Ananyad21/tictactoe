import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Tictactoe implements ActionListener{
	
	Random random=new Random();
	JFrame frame=new JFrame();
	JPanel title=new JPanel();
	JPanel button=new JPanel();
	JLabel text=new JLabel();
	JButton[] buttons=new JButton[9];
	boolean playerone_turn;
	Tictactoe() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.getContentPane().setBackground(new Color(255,153,0));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		text.setBackground(new Color(255,255,255));
		text.setForeground(new Color(255,153,0));
		text.setFont(new Font("Ink Free",Font.BOLD,75));
		text.setHorizontalAlignment(JLabel.CENTER);
		text.setText("Tic-Tac-Toe");
		text.setOpaque(true);
		
		title.setLayout(new BorderLayout());
		title.setBounds(0,0,800,100);
		
		button.setLayout(new GridLayout(3,3));
		button.setBackground(new Color(120,120,120));
		
		for(int i=0;i<9;i++) {
			buttons[i]=new JButton();
			button.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boli",Font.BOLD,255));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
		}
		
		
		title.add(text);
		frame.add(title,BorderLayout.NORTH);
		frame.add(button);
		
		firstturn();
		
	} 

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<9;i++) {
			if(e.getSource()==buttons[i]) {
				if(playerone_turn) {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(255,0,0));
						buttons[i].setText("X");
						playerone_turn=false;
						text.setText("O turn");
						check();
					}
				}
				else {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(0,0,255));
						buttons[i].setText("O");
						playerone_turn=true;
						text.setText("X turn");
						check();
				
			}
			
				}
		}
		}
	}
		
	
	 
	public void firstturn() {
		try {
		Thread.sleep(2000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		if(random.nextInt(2)==0) {
			playerone_turn=true;
			text.setText("x turn");
		}
		else {
			playerone_turn=false;
			text.setText("o turn");
		}
		
		 
		
	}
	public void check() {
		if(
				(buttons[0].getText()=="X") &&
				(buttons[1].getText()=="X") &&
				(buttons[2].getText()=="X")
				) {
			xwin(0,1,2);
		}
		if(
				(buttons[3].getText()=="X") &&
				(buttons[4].getText()=="X") &&
				(buttons[5].getText()=="X")
				) {
			xwin(3,4,5);
		}
		if(
				(buttons[6].getText()=="X") &&
				(buttons[7].getText()=="X") &&
				(buttons[8].getText()=="X")
				) {
			xwin(6,7,8);
		}
		if(
				(buttons[0].getText()=="X") &&
				(buttons[3].getText()=="X") &&
				(buttons[6].getText()=="X")
				) {
			xwin(0,3,6);
		}
		if(
				(buttons[1].getText()=="X") &&
				(buttons[4].getText()=="X") &&
				(buttons[7].getText()=="X")
				) {
			xwin(1,4,7);
		}
		if(
				(buttons[2].getText()=="X") &&
				(buttons[5].getText()=="X") &&
				(buttons[8].getText()=="X")
				) {
			xwin(2,5,8);
		}
		if(
				(buttons[0].getText()=="X") &&
				(buttons[4].getText()=="X") &&
				(buttons[8].getText()=="X")
				) {
			xwin(0,4,8);
		}
		if(
				(buttons[2].getText()=="X") &&
				(buttons[4].getText()=="X") &&
				(buttons[6].getText()=="X")
				) {
			xwin(2,4,6);
		}
		if(
				(buttons[0].getText()=="O") &&
				(buttons[1].getText()=="O") &&
				(buttons[2].getText()=="O")
				) {
			owin(0,1,2);
		}
		if(
				(buttons[3].getText()=="O") &&
				(buttons[4].getText()=="O") &&
				(buttons[5].getText()=="O")
				) {
			owin(3,4,5);
		}
		if(
				(buttons[6].getText()=="O") &&
				(buttons[7].getText()=="O") &&
				(buttons[8].getText()=="O")
				) {
			owin(6,7,8);
		}
		if(
				(buttons[0].getText()=="O") &&
				(buttons[3].getText()=="O") &&
				(buttons[6].getText()=="O")
				) {
			owin(0,3,6);
		}
		if(
				(buttons[1].getText()=="O") &&
				(buttons[4].getText()=="O") &&
				(buttons[7].getText()=="O")
				) {
			owin(1,4,7);
		}
		if(
				(buttons[2].getText()=="O") &&
				(buttons[5].getText()=="O") &&
				(buttons[8].getText()=="O")
				) {
			owin(2,5,8);
		}
		if(
				(buttons[0].getText()=="O") &&
				(buttons[4].getText()=="O") &&
				(buttons[8].getText()=="O")
				) {
			owin(0,4,8);
		}
		if(
				(buttons[2].getText()=="O") &&
				(buttons[4].getText()=="O") &&
				(buttons[6].getText()=="O")
				) {
			owin(2,4,6);
		}
	}
		
		
	
	public void xwin(int a,int b,int c) {
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		for(int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
			
		}
		text.setText("X wins");


		
		
	}
public void owin(int a,int b,int c) {
	buttons[a].setBackground(Color.GREEN);
	buttons[b].setBackground(Color.GREEN);
	buttons[c].setBackground(Color.GREEN);
	for(int i=0;i<9;i++) {
		buttons[i].setEnabled(false);
		
	}
	text.setText("O wins");

		
	}
	
	

}
