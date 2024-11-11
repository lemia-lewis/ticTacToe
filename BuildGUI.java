package tikTakToe;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BuildGUI {
	JFrame window;
	JPanel gameArea;
	JPanel buttonPanel;
	JPanel panel;
	JButton PB1,PB2,PB3,PB4,PB5,PB6,PB7,PB8,PB9;//Play button number 1-9;
	JButton playableSlots[][]=new JButton [3][3];
	JButton restartButton;
	JButton quitButton;
	String[][] labelTrack= new String[3][3];//Keep track of what is on buttons
	int winCountP1=0,winCountP2=0;//Track amount of wins for player one and two
	String playerTurn="X";//Keep track of rather X or O turn

	public BuildGUI() {
		window= new JFrame();
		window.setTitle("TicTacToe");
		window.setSize(400,500);
		
		buildPanel();
		window.add(panel);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		}
	private void buildPanel() {
		panel=new JPanel();
		panel.setLayout(new BorderLayout());
		
		gameArea= new JPanel();
		gameArea.setLayout(new GridLayout(3,3));
		
		createGameButtons();
		
		panel.add(gameArea, BorderLayout.CENTER);
	}
	private void createGameButtons() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				playableSlots[i][j]=new JButton("");
				playableSlots[i][j].setBackground(new Color(78, 64, 84));
				playableSlots[i][j].setForeground(new Color(250,250 , 250));
				playableSlots[i][j].addActionListener(new selectButtonListener());
				gameArea.add(playableSlots[i][j]);
			}
		}
//		PB1=new JButton("");
//		PB1.setBackground(new Color(78, 64, 84));
//		PB1.setForeground(new Color(250,250 , 250));
//		PB1.addActionListener(new selectButtonListener());
//		gameArea.add(PB1);
//		PB2=new JButton("");
//		PB2.setBackground(new Color(78, 64, 84));
//		PB2.setForeground(new Color(250,250 , 250));
//		PB2.addActionListener(new selectButtonListener());
//		gameArea.add(PB2);
//		PB3=new JButton("");
//		PB3.setBackground(new Color(78, 64, 84));
//		PB3.setForeground(new Color(250,250 , 250));
//		PB3.addActionListener(new selectButtonListener());
//		gameArea.add(PB3);
//		PB4=new JButton("");
//		PB4.setBackground(new Color(78, 64, 84));
//		PB4.setForeground(new Color(250,250 , 250));
//		PB4.addActionListener(new selectButtonListener());
//		gameArea.add(PB4);
//		PB5=new JButton("");
//		PB5.setBackground(new Color(78, 64, 84));
//		PB5.setForeground(new Color(250,250 , 250));
//		PB5.addActionListener(new selectButtonListener());
//		gameArea.add(PB5);
//		PB6=new JButton("");
//		PB6.setBackground(new Color(78, 64, 84));
//		PB6.setForeground(new Color(250,250 , 250));
//		PB6.addActionListener(new selectButtonListener());
//		gameArea.add(PB6);
//		PB7=new JButton("");
//		PB7.setBackground(new Color(78, 64, 84));
//		PB7.setForeground(new Color(250,250 , 250));
//		PB7.addActionListener(new selectButtonListener());
//		gameArea.add(PB7);
//		PB8=new JButton("");
//		PB8.setBackground(new Color(78, 64, 84));
//		PB8.setForeground(new Color(250,250 , 250));
//		PB8.addActionListener(new selectButtonListener());
//		gameArea.add(PB8);
//		PB9=new JButton("");
//		PB9.setBackground(new Color(78, 64, 84));
//		PB9.setForeground(new Color(250,250 , 250));
//		PB9.addActionListener(new selectButtonListener());
//		gameArea.add(PB9);
	}
	
	
	private class selectButtonListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e)//What the button does when clicked
		{
			String labelOnButton=e.getActionCommand();
			if(labelOnButton.isEmpty()) {//Only update logic if spot is not taken
				if(e.getSource()==PB1) {
					PB1.setText(playerTurn);
					labelTrack[0][0]=playerTurn;
				}
			}
			
		}
	}
	
}
