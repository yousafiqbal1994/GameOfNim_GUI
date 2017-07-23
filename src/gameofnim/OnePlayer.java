package gameofnim;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class OnePlayer extends JFrame {

	private JPanel contentPane;
	String player_Name="";
	String Computer_Name="Computer";
	JButton P1_BA = new JButton("A");
	JButton P1_BB = new JButton("B");
	JButton P1_BC = new JButton("C");
	JButton P1_btn_3 = new JButton("3");
	JButton P1_btn_2 = new JButton("2");
	JButton P1_btn_1 = new JButton("1");	
	JLabel count_A = new JLabel("<html><font color='Black'>" + "5" + "</font></html>");
	JLabel count_B = new JLabel("<html><font color='White'>" + "5" + "</font></html>");
	JLabel count_C = new JLabel("<html><font color='Red'>" + "5" + "</font></html>");
	JLabel P_tick = new JLabel("");
	JLabel PC_tick = new JLabel("");
	JLabel label_PC = new JLabel("");
	char pick; int number; boolean again=false;
	JLabel labels_Black_1;
	JLabel labels_Black_2;
	JLabel labels_Black_3;
	JLabel labels_Black_4;
	JLabel labels_Black_5;
	JLabel labels_White_1;
	JLabel labels_White_2;
	JLabel labels_White_3;
	JLabel labels_White_4;
	JLabel labels_White_5;
	JLabel labels_Red_1;
	JLabel labels_Red_2;
	JLabel labels_Red_3;
	JLabel labels_Red_4;
	JLabel labels_Red_5;
	int remain_A = 5;
	int remain_B = 5;
	int remain_C = 5;
	int intValue;
	String curPlayer, strValue;
	String turn, selected;

	/**
	 * Create the frame.
	 */
	public OnePlayer() {
		
		player_Name=JOptionPane.showInputDialog(null,"Enter Player Name: ", "Player 1");
		if(player_Name==null){
			return;
		}
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1102, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		P_tick.setIcon(new ImageIcon("C:\\Users\\YouCaf Iqbal\\Desktop\\Files\\tick.png"));
		P_tick.setBounds(15, 57, 100, 98);
		contentPane.add(P_tick);
		P_tick.setVisible(true);
		PC_tick.setIcon(new ImageIcon("C:\\Users\\YouCaf Iqbal\\Desktop\\Files\\tick.png"));
		PC_tick.setBounds(945, 57, 100, 98);
		contentPane.add(PC_tick);
		PC_tick.setVisible(false);

		JLabel TwoPlayerLabel = new JLabel("<html><font color='blue'>One Player Game</font></html>");
		TwoPlayerLabel.setBounds(381, 29, 396, 65);
		TwoPlayerLabel.setFont(new Font("Serif", 0, 50));
		contentPane.add(TwoPlayerLabel);

		JLabel labelA = new JLabel("<html><font color='Black'>" + "A" + "</font></html>");
		labelA.setBounds(285, 102, 54, 41);
		labelA.setFont(new Font("Serif", 0, 30));
		contentPane.add(labelA);


		labels_Black_1 = new JLabel("");
		labels_Black_1.setBounds(270, 162, 54, 41);
		labels_Black_1.setIcon(new ImageIcon("C:\\Users\\YouCaf Iqbal\\Desktop\\Files\\Capture.PNG"));
		contentPane.add(labels_Black_1);

		labels_Black_2 = new JLabel("");
		labels_Black_2.setBounds(270, 262, 54, 41);
		labels_Black_2.setIcon(new ImageIcon("C:\\Users\\YouCaf Iqbal\\Desktop\\Files\\Capture.PNG"));
		contentPane.add(labels_Black_2);

		labels_Black_3 = new JLabel("");
		labels_Black_3.setBounds(270, 362, 54, 41);
		labels_Black_3.setIcon(new ImageIcon("C:\\Users\\YouCaf Iqbal\\Desktop\\Files\\Capture.PNG"));
		contentPane.add(labels_Black_3);

		labels_Black_4 = new JLabel("");
		labels_Black_4.setBounds(270, 462, 54, 41);
		labels_Black_4.setIcon(new ImageIcon("C:\\Users\\YouCaf Iqbal\\Desktop\\Files\\Capture.PNG"));
		contentPane.add(labels_Black_4);

		labels_Black_5 = new JLabel("");
		labels_Black_5.setBounds(270, 562, 54, 41);
		labels_Black_5.setIcon(new ImageIcon("C:\\Users\\YouCaf Iqbal\\Desktop\\Files\\Capture.PNG"));
		contentPane.add(labels_Black_5);

		count_A.setBounds(285, 612, 54, 41);
		count_A.setFont(new Font("Serif", 0, 30));
		contentPane.add(count_A);

		JLabel labelB = new JLabel("<html><font color='White'>" + "B" + "</font></html>");
		labelB.setBounds(533, 102, 54, 41);
		labelB.setFont(new Font("Serif", 0, 30));
		contentPane.add(labelB);

		labels_White_1 = new JLabel("");
		labels_White_1.setBounds(520, 162, 54, 41);
		labels_White_1.setIcon(new ImageIcon("C:\\Users\\YouCaf Iqbal\\Desktop\\Files\\CaptureW.PNG"));
		contentPane.add(labels_White_1);

		labels_White_2 = new JLabel("");
		labels_White_2.setBounds(520, 262, 54, 41);
		labels_White_2.setIcon(new ImageIcon("C:\\Users\\YouCaf Iqbal\\Desktop\\Files\\CaptureW.PNG"));
		contentPane.add(labels_White_2);

		labels_White_3 = new JLabel("");
		labels_White_3.setBounds(520, 362, 54, 41);
		labels_White_3.setIcon(new ImageIcon("C:\\Users\\YouCaf Iqbal\\Desktop\\Files\\CaptureW.PNG"));
		contentPane.add(labels_White_3);

		labels_White_4 = new JLabel("");
		labels_White_4.setBounds(520, 462, 54, 41);
		labels_White_4.setIcon(new ImageIcon("C:\\Users\\YouCaf Iqbal\\Desktop\\Files\\CaptureW.PNG"));
		contentPane.add(labels_White_4);

		labels_White_5 = new JLabel("");
		labels_White_5.setBounds(520, 562, 54, 41);
		labels_White_5.setIcon(new ImageIcon("C:\\Users\\YouCaf Iqbal\\Desktop\\Files\\CaptureW.PNG"));
		contentPane.add(labels_White_5);

		count_B.setBounds(535, 612, 54, 41);
		count_B.setFont(new Font("Serif", 0, 30));
		contentPane.add(count_B);

		JLabel labelC = new JLabel("<html><font color='Red'>" + "C" + "</font></html>");
		labelC.setBounds(764, 102, 54, 41);
		labelC.setFont(new Font("Serif", 0, 30));
		contentPane.add(labelC);

		labels_Red_1 = new JLabel("");
		labels_Red_1.setBounds(750, 162, 54, 41);
		labels_Red_1.setIcon(new ImageIcon("C:\\Users\\YouCaf Iqbal\\Desktop\\Files\\CaptureR.PNG"));
		contentPane.add(labels_Red_1);

		labels_Red_2 = new JLabel("");
		labels_Red_2.setBounds(750, 262, 54, 41);
		labels_Red_2.setIcon(new ImageIcon("C:\\Users\\YouCaf Iqbal\\Desktop\\Files\\CaptureR.PNG"));
		contentPane.add(labels_Red_2);

		labels_Red_3 = new JLabel("");
		labels_Red_3.setBounds(750, 362, 54, 41);
		labels_Red_3.setIcon(new ImageIcon("C:\\Users\\YouCaf Iqbal\\Desktop\\Files\\CaptureR.PNG"));
		contentPane.add(labels_Red_3);

		labels_Red_4 = new JLabel("");
		labels_Red_4.setBounds(750, 462, 54, 41);
		labels_Red_4.setIcon(new ImageIcon("C:\\Users\\YouCaf Iqbal\\Desktop\\Files\\CaptureR.PNG"));
		contentPane.add(labels_Red_4);

		labels_Red_5 = new JLabel("");
		labels_Red_5.setBounds(750, 562, 54, 41);
		labels_Red_5.setIcon(new ImageIcon("C:\\Users\\YouCaf Iqbal\\Desktop\\Files\\CaptureR.PNG"));
		contentPane.add(labels_Red_5);

		count_C.setBounds(765, 612, 54, 41);
		count_C.setFont(new Font("Serif", 0, 30));
		contentPane.add(count_C);

		JLabel P1_Name = new JLabel("<html><font color='Black'>" + player_Name + "</font></html>");
		P1_Name.setBounds(15, 490, 166, 52);
		P1_Name.setFont(new Font("Serif", 0, 30));
		contentPane.add(P1_Name);

		JLabel PC_Name = new JLabel("<html><font color='Black'>" + Computer_Name + "</font></html>");

		PC_Name.setBounds(945, 490, 166, 52);
		PC_Name.setFont(new Font("Serif", 0, 30));
		contentPane.add(PC_Name);
		
		P1_BA.setBounds(15, 250, 115, 29);
		contentPane.add(P1_BA);
		P1_BA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				turn = "player";
				curPlayer = "P";
				selected = "P_A";
				showNum();
			}
		});
		P1_BB.setBounds(15, 330, 115, 29);
		contentPane.add(P1_BB);

		P1_BB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				turn = "player";
				curPlayer = "P";
				selected = "P_B";
				showNum();
			}
		});
		P1_BC.setBounds(15, 410, 115, 29);
		contentPane.add(P1_BC);

		P1_BC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				turn = "player";
				curPlayer = "P";
				selected = "P_C";
				showNum();
			}
		});
		
		P1_btn_1.setBounds(15, 250, 115, 29);
		contentPane.add(P1_btn_1);
		P1_btn_1.setVisible(false);

		P1_btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				strValue = P1_btn_1.getText();
				intValue = Integer.parseInt(strValue);
				
				Select(intValue);
				P1_Enabled();
				 if(again==true){
					 P_tick.setVisible(true);
						PC_tick.setVisible(false);
					 JOptionPane.showMessageDialog(null,"Again " +player_Name+ " turn"); 
					 }
				 else{
					 
				ComputerTurn(); }
				

			}
		});

		P1_btn_2.setBounds(15, 330, 115, 29);
		contentPane.add(P1_btn_2);
		P1_btn_2.setVisible(false);

		P1_btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				strValue = P1_btn_2.getText();
				intValue = Integer.parseInt(strValue);
				
				Select(intValue);
				P1_Enabled();
				if(again==true){ 
					P_tick.setVisible(true);
					PC_tick.setVisible(false);
					JOptionPane.showMessageDialog(null,"Again " +player_Name+ " turn");
					}
				 else{
				ComputerTurn(); }
			}
		});

		P1_btn_3.setBounds(15, 410, 115, 29);
		contentPane.add(P1_btn_3);
		P1_btn_3.setVisible(false);

		P1_btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				
				strValue = P1_btn_3.getText();
				intValue = Integer.parseInt(strValue);
				P1_Enabled();
				
				Select(intValue);
				if(again==true){
					P_tick.setVisible(true);
					PC_tick.setVisible(false);
					JOptionPane.showMessageDialog(null,"Again " +player_Name+ " turn");
					}
				 else{
				ComputerTurn();  }
			}
		});

		
		label_PC.setBounds(930,200,200,300);
		label_PC.setIcon(new ImageIcon("C:\\Users\\YouCaf Iqbal\\Desktop\\Files\\computer.png"));
		contentPane.add(label_PC);
		
		JLabel label_Main = new JLabel("");
		label_Main.setBounds(0, -13, 1111, 853);
		label_Main.setIcon(new ImageIcon("C:\\Users\\YouCaf Iqbal\\Desktop\\Files\\abc.jpg"));
		contentPane.add(label_Main);
	}
	
	
	public void showNum() {

		if (selected == "P_A" || selected == "P_B" || selected == "P_C"  ) {

			P1_BA.setVisible(false);
			P1_btn_1.setVisible(true);
			P1_BB.setVisible(false);
			P1_btn_2.setVisible(true);
			P1_BC.setVisible(false);
			P1_btn_3.setVisible(true);
			
		
		}
	}
	public void ComputerTurn(){
		P_tick.setVisible(false);
		PC_tick.setVisible(true);
        int N = "ABC".length();
        Random rand = new Random();
        pick = "ABC".charAt(rand.nextInt(N));
        number = rand.nextInt(3) + 1;
        JOptionPane.showMessageDialog(null, "Computer turn");
        JOptionPane.showMessageDialog(null,"Computer selected "+number+ " from " +pick+"");
        curPlayer="PC";
        Select(number);
        if(again==true){
        	P_tick.setVisible(false);
			PC_tick.setVisible(true);
        	ComputerTurn();
        }
        P_tick.setVisible(true); // active the tick when computer finishes his turn
		PC_tick.setVisible(false);
	}
	
	public void Select(int x) {
		if (curPlayer == "P" && selected=="P_A") {
			Remain_A(x);
			
		}
		if (curPlayer == "P" && selected=="P_B") {
			Remain_B(x);
			
		}
		if (curPlayer == "P" && selected=="P_C") {
			Remain_C(x);
			
		}
		if(curPlayer == "PC" && pick=='A'){
			Remain_A(x);
		}
		if(curPlayer == "PC" && pick=='B'){
			Remain_B(x);
		}
		if(curPlayer == "PC" && pick=='C'){
			Remain_C(x);
		}
	}
	public void P1_Enabled() {
		P1_btn_1.setVisible(true);
		P1_btn_3.setVisible(true);
		P1_btn_2.setVisible(true);
		P1_BC.setVisible(true);
		P1_BA.setVisible(true);
		P1_BB.setVisible(true);
		
	}
	public void P1_Disabled() {
		P1_btn_1.setVisible(false);
		P1_btn_3.setVisible(false);
		P1_btn_2.setVisible(false);
		P1_BC.setVisible(false);
		P1_BA.setVisible(false);
		P1_BB.setVisible(false);
		
	}
	
	public void Remain_A(int x) {
		if (remain_A == 5) {
			if (x == 1) {
				labels_Black_1.setVisible(false);
				remain_A = 4;
				count_A.setText("4");
				again=false;
				return;
			}
			if (x == 2) {
				labels_Black_1.setVisible(false);
				labels_Black_2.setVisible(false);
				remain_A = 3;
				count_A.setText("3");
				again=false;
				return;
			}
			if (x == 3) {
				labels_Black_1.setVisible(false);
				labels_Black_2.setVisible(false);
				labels_Black_3.setVisible(false);
				remain_A = 2;
				count_A.setText("2");
				again=false;
				return;
			}
		}

		if (remain_A == 4) {
			if (x == 1) {
				labels_Black_2.setVisible(false);
				remain_A = 3;
				count_A.setText("3");
				again=false;
				return;
			}
			if (x == 2) {
				labels_Black_2.setVisible(false);
				labels_Black_3.setVisible(false);
				remain_A = 2;
				count_A.setText("2");
				again=false;
				return;
			}
			if (x == 3) {
				labels_Black_2.setVisible(false);
				labels_Black_3.setVisible(false);
				labels_Black_4.setVisible(false);
				remain_A = 1;
				count_A.setText("1");
				again=false;
				return;
			}
		}

		if (remain_A == 3) {
			if (x == 1) {
				labels_Black_3.setVisible(false);
				remain_A = 2;
				count_A.setText("2");
				again=false;
				return;
			}
			if (x == 2) {
				labels_Black_3.setVisible(false);
				labels_Black_4.setVisible(false);
				remain_A = 1;
				count_A.setText("1");
				again=false;
				return;
			}
			if (x == 3) {
				labels_Black_3.setVisible(false);
				labels_Black_4.setVisible(false);
				labels_Black_5.setVisible(false);
				remain_A = 0;
				count_A.setText("0");
				again=false;
				checkResult();
				return;
			}
		}

		if (remain_A == 2) {
			if (x == 1) {
				labels_Black_4.setVisible(false);
				remain_A = 1;
				count_A.setText("1");
				again=false;
				return;
			}
			if (x == 2) {
				labels_Black_4.setVisible(false);
				labels_Black_5.setVisible(false);
				remain_A = 0;
				count_A.setText("0");
				again=false;
				checkResult();
				return;
			}
			if (x == 3) {
				
				JOptionPane.showMessageDialog(null, "Can't Select more than present items");
				again=true;
				PlayAgain();
				return;
			}
		}

		if (remain_A == 1) {
			if (x == 1) {
				labels_Black_5.setVisible(false);
				remain_A = 0;
				count_A.setText("0");
				again=false;
				checkResult();
				return;
			}
			if (x == 2) {

				JOptionPane.showMessageDialog(null, "Can't Select more than present items");
				again=true;
				PlayAgain();
				return;
			}
			if (x == 3){
				JOptionPane.showMessageDialog(null, "Can't Select more than present items");
				again=true;
				PlayAgain();
				return;
			}
		}

		if (remain_A == 0) {	
			JOptionPane.showMessageDialog(null, "Empty Pile");
			again=true;
			PlayAgain();
		}

	}


	public void Remain_B(int x) {
		if (remain_B == 5) {
			if (x == 1) {
				labels_White_1.setVisible(false);
				remain_B = 4;
				count_B.setText("4");
				again=false;
				return;
			}
			if (x == 2) {
				labels_White_1.setVisible(false);
				labels_White_2.setVisible(false);
				remain_B = 3;
				count_B.setText("3");
				again=false;
				return;
			}
			if (x == 3) {
				labels_White_1.setVisible(false);
				labels_White_2.setVisible(false);
				labels_White_3.setVisible(false);
				remain_B = 2;
				count_B.setText("2");
				again=false;
				return;
			}
		}

		if (remain_B == 4) {
			if (x == 1) {
				labels_White_2.setVisible(false);
				remain_B = 3;
				count_B.setText("3");
				again=false;
				return;
			}
			if (x == 2) {
				labels_White_2.setVisible(false);
				labels_White_3.setVisible(false);
				remain_B = 2;
				count_B.setText("2");
				again=false;
				return;
			}
			if (x == 3) {
				labels_White_2.setVisible(false);
				labels_White_3.setVisible(false);
				labels_White_4.setVisible(false);
				remain_B = 1;
				count_B.setText("1");
				again=false;
				return;
			}
		}

		if (remain_B == 3) {
			if (x == 1) {
				labels_White_3.setVisible(false);
				remain_B = 2;
				count_B.setText("2");
				again=false;
				return;
			}
			if (x == 2) {
				labels_White_3.setVisible(false);
				labels_White_4.setVisible(false);
				remain_B = 1;
				count_B.setText("1");
				again=false;
				return;
			}
			if (x == 3) {
				labels_White_3.setVisible(false);
				labels_White_4.setVisible(false);
				labels_White_5.setVisible(false);
				remain_B = 0;
				count_B.setText("0");
				again=false;
				checkResult();
				return;
			}
		}

		if (remain_B == 2) {
			if (x == 1) {
				labels_White_4.setVisible(false);
				remain_B = 1;
				count_B.setText("1");
				again=false;
				return;
			}
			if (x == 2) {
				labels_White_4.setVisible(false);
				labels_White_5.setVisible(false);
				remain_B = 0;
				count_B.setText("0");
				again=false;
				checkResult();
				return;
			}
			if (x == 3) {

				
				JOptionPane.showMessageDialog(null, "Can't Select more than present items");
				again=true;
				PlayAgain();
				return;
			}
		}

		if (remain_B == 1) {
			if (x == 1) {
				labels_White_5.setVisible(false);
				remain_B = 0;
				count_B.setText("0");
				again=false;
				checkResult();
				return;
			}
			if (x == 2) {

				
				JOptionPane.showMessageDialog(null, "Can't Select more than present items");
				again=true;
				PlayAgain();
				return;
			}
			if (x == 3) {


				JOptionPane.showMessageDialog(null, "Can't Select more than present items");
				again=true;
				PlayAgain();
				return;
			}
		}

		if (remain_B == 0) {
		
			JOptionPane.showMessageDialog(null, "Empty Pile");
			again=true;
			PlayAgain();
		}

	}

	public void Remain_C(int x) {
		if (remain_C == 5) {
			if (x == 1) {
				labels_Red_1.setVisible(false);
				remain_C = 4;
				count_C.setText("4");
				again=false;
				return;
			}
			if (x == 2) {
				labels_Red_1.setVisible(false);
				labels_Red_2.setVisible(false);
				remain_C = 3;
				count_C.setText("3");
				again=false;
				return;
			}
			if (x == 3) {
				labels_Red_1.setVisible(false);
				labels_Red_2.setVisible(false);
				labels_Red_3.setVisible(false);
				remain_C = 2;
				count_C.setText("2");
				again=false;
				return;
			}
		}

		if (remain_C == 4) {
			if (x == 1) {
				labels_Red_2.setVisible(false);
				remain_C = 3;
				count_C.setText("3");
				again=false;
				return;
			}
			if (x == 2) {
				labels_Red_2.setVisible(false);
				labels_Red_3.setVisible(false);
				remain_C = 2;
				count_C.setText("2");
				again=false;
				return;
			}
			if (x == 3) {
				labels_Red_2.setVisible(false);
				labels_Red_3.setVisible(false);
				labels_Red_4.setVisible(false);
				remain_C = 1;
				count_C.setText("1");
				again=false;
				return;
			}
		}

		if (remain_C == 3) {
			if (x == 1) {
				labels_Red_3.setVisible(false);
				remain_C = 2;
				count_C.setText("2");
				again=false;
				return;
			}
			if (x == 2) {
				labels_Red_3.setVisible(false);
				labels_Red_4.setVisible(false);
				remain_C = 1;
				count_C.setText("1");
				again=false;
				return;
			}
			if (x == 3) {
				labels_Red_3.setVisible(false);
				labels_Red_4.setVisible(false);
				labels_Red_5.setVisible(false);
				remain_C = 0;
				count_C.setText("0");
				again=false;
				checkResult();
				return;
			}
		}

		if (remain_C == 2) {
			if (x == 1) {
				labels_Red_4.setVisible(false);
				remain_C = 1;
				count_C.setText("1");
				return;
			}
			if (x == 2) {
				labels_Red_4.setVisible(false);
				labels_Red_5.setVisible(false);
				remain_C = 0;
				count_C.setText("0");
				again=false;
				checkResult();
				return;
			}
			if (x == 3) {

				JOptionPane.showMessageDialog(null, "Can't Select more than present items");
				again=true;
				PlayAgain();
				return;
			}
		}

		if (remain_C == 1) {
			if (x == 1) {
				labels_Red_5.setVisible(false);
				remain_C = 0;
				count_C.setText("0");
				again=false;
				checkResult();
				return;
			}
			if (x == 2) {

				JOptionPane.showMessageDialog(null, "Can't Select more than present items");
				again=true;
				PlayAgain();
				return;
			}
			if (x == 3) {
				JOptionPane.showMessageDialog(null, "Can't Select more than present items");
				again=true;
				PlayAgain();
				return;
			}
		}

		if (remain_C == 0) {
		
			JOptionPane.showMessageDialog(null, "Empty Pile");
			again=true;
			PlayAgain();
		}

	}
	
	public void PlayAgain(){
		 // code goes here
	}

	public void checkResult() {

		if (count_A.getText() == "0" && count_B.getText() == "0" && count_C.getText() == "0") {

			if (curPlayer == "P") {
				P1_Disabled();
				count_A.setVisible(false);
				count_B.setVisible(false);
				count_C.setVisible(false);
				JOptionPane.showMessageDialog(null, "Yahoo Computer Wins");
				return;
				
			}
			if (curPlayer == "PC") {
				P1_Disabled();
				count_A.setVisible(false);
				count_B.setVisible(false);
				count_C.setVisible(false);
				JOptionPane.showMessageDialog(null, "Yahoo "+ player_Name + " Wins");
				return;
			
			}
		}
	}

}
