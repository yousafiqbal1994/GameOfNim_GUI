package gameofnim;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Game extends JFrame {

	private JPanel contentPane;
	String player_Name="";
	public static void main(String[] args) {
					Game frame = new Game();
					frame.setVisible(true);
					frame.setResizable(false);
	}
	public Game() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1102, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSinglePlayer = new JButton("Single Player");
		btnSinglePlayer.setBounds(452, 219, 208, 70);
		contentPane.add(btnSinglePlayer);
		
		btnSinglePlayer.addActionListener(new ActionListener()
		    {
		      public void actionPerformed(ActionEvent arg0)
		      {
		        OnePlayer SinglePlayer = new OnePlayer();
		        SinglePlayer.setVisible(true);
		        SinglePlayer.setResizable(false);
		      }
		    });
		JButton btnTwoPlayer = new JButton("Two Player");
		btnTwoPlayer.setBounds(452, 342, 208, 70);
		contentPane.add(btnTwoPlayer);
		btnTwoPlayer.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent arg0)
	      {
	        TwoPlayer MultiPlayer = new TwoPlayer();
	        MultiPlayer.setVisible(true);
	        MultiPlayer.setResizable(false);
	      }
	    });
		
		JButton btnQuitGame = new JButton("Quit Game");
		btnQuitGame.setBounds(452, 463, 208, 70);
		contentPane.add(btnQuitGame);
		
		JLabel lblWelcomeToGame = new JLabel("<html><font color='blue'>Welcome to Game of NIM</font></html>");
		lblWelcomeToGame.setBounds(294, 57, 553, 116);
		lblWelcomeToGame.setFont(new Font("Serif", 0, 50));
		contentPane.add(lblWelcomeToGame);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\YouCaf Iqbal\\Desktop\\Files\\183621-mathematics.jpg"));
		label.setBounds(0, 0, 1111, 840);
		contentPane.add(label);
		
		 btnQuitGame.addActionListener(new ActionListener()
		    {
		      public void actionPerformed(ActionEvent arg0)
		      {
		        System.exit(0);
		      }
		    });
	}
	
	
}
