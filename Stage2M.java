import java.util.Scanner;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Image.*;
import java.awt.Color.*;
import java.util.Random;
import java.lang.Math.*;

public class Stage2M implements ActionListener {

	Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize();
	int h = DimMax.height;//screen height
	int w = DimMax.width;//screen width
	JTextField tf1,tf2;// JtextFields for the players' asnwers
	Color buttonColor = new Color(153,102,0);
	Color LabelColor = new Color(170,102,0);
	PreferedSettings pf = new PreferedSettings();
	JFrame f1 = new JFrame();

	//player1's questions
	String [] questions1 = new String[5];
	//player1's answers as String
	String [] tAnswers1 = new String[5];
	//player2's questions
	String [] questions2 = new String[5];
	//player2's answers as String
	String [] tAnswers2 = new String[5];
	//both players' answers as String
	String [] tAnswers = new String[10];
	//player1's answers as int
	int [] answers1 = new int[5];
	//player2's answers as int
	int [] answers2 = new int[5];
	//both players' questions
	String questions[] = new String[10];
	// both players' caracters answers as int
	int answers[] = new int[10];
	//number of player1's character
	int kp;
	//number of player2's character
	int lp;
	// shows the number Of question
	int numOfQ;
	// shows the position on table questions according to the number Of Question
	int z;
	//players' answers
	double answer1, answer2;
	//players' total points
	int points1, points2;
	//shows all the random positions for the questions of the table questions
	int [] pn = new int [10];
	//shows all the random positions for the questions of the table questions


	String[] sQuestions = new String[10];

	//labels for points and results
	JLabel label,result,resultMessage1,lpoints1,lpoints2, ltf1,ltf2;

	//panels for showing the correct answer and the winner of each round
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();

	//for connection with the stage 3
	FinalStageMulti fs = new FinalStageMulti();

	public void multiStage2(int k,int l,int p1, int p2) {
		//initializing f1
		pf.setFrame(f1);
		if (numOfQ == 0) {
			Random rand = new Random();
			Heroes heroes = new Heroes();
			heroes.makeHeroes(k, l);
			kp = k;
			lp = l;
			points1 = p1;
			points2 = p2;
			questions1 = heroes.getq1();
			tAnswers1 = heroes.geta1();
			questions2 = heroes.getq2();
			tAnswers2 = heroes.geta2();

			for (int i = 0 ; i<5; i++) {
				answers1[i] = Integer.parseInt(tAnswers1[i]);
				answers2[i] = Integer.parseInt(tAnswers2[i]);
			}
			for (int t = 0; t < 5; t++) {
				questions[t] = questions1[t];
				answers[t] = answers1[t];
				questions[t+5] = questions2[t];
				answers[t+5] = answers2[t];
		    }

			int check [] = new int[10];
			for (int j = 0; j < check.length; j++) {
				check[j] = 0;
			}
			//checking for non-double values so as to have sifferent questions in every round
			for (int i = 0; i < 10; i++ ) {
				int r=0;
				do {
					if (i == 0) {
						r = rand.nextInt(5);
						} else if ((i != 0) && (i % 2 == 0)) {
							r = rand.nextInt(5);
						} else if ((i != 0) && (i % 2 != 0)) {
							r = rand.nextInt(5) + 5;
						}
				} while (check[r] != 0);
				sQuestions[i] = questions[r];
				pn[i]= r;
				check[r]++;
			}
		}

		JLabel la = new JLabel("STAGE 2: THE FAITH");
		la.setBounds(w/2 - 220, h/8, 500,50);
		la.setForeground(LabelColor);
		la.setFont(new Font("Courier", Font.BOLD, 40));
		pf.setFrame(f1);
		f1.add(la);
		f1.setLayout(null);


		lpoints1 = new JLabel("PLAYER 1 POINTS : " + points1);
		lpoints1.setBounds(w/3 - 135, 3*h / 4 , 270, 80);
		lpoints1.setForeground(LabelColor);
		lpoints1.setFont(new Font("Courier", Font.BOLD, 20));

		f1.add(lpoints1);

		lpoints2 = new JLabel("PLAYER 2 POINTS : " + points2);
		lpoints2.setBounds(w- w/3 - 135, 3*h / 4 , 270, 80);
		lpoints2.setForeground(LabelColor);
		lpoints2.setFont(new Font("Courier", Font.BOLD, 20));
		f1.add(lpoints2);
		f1.setVisible(true);
		z = pn[numOfQ];
		ShowQuestion(z);
		System.out.println(z);
	}


	public void ShowQuestion(int k) {
			p1.removeAll();
			p1.revalidate();
			p1.repaint();
			p2.removeAll();
			p2.revalidate();
			p2.repaint();


			JLabel ql = new JLabel("QUESTION "+ (numOfQ+1) +"/10");
			ql.setBounds(w/2-120, h/5,240,200);
			ql.setForeground(LabelColor);
			ql.setFont(new Font("Courier", Font.BOLD, 27));
			f1.add(ql);

			label = new JLabel(sQuestions[numOfQ]);
			label.setBounds(w/2 - (sQuestions[numOfQ].length() / 2) * 16, h / 4, sQuestions[numOfQ].length() * 16, 200);
			label.setForeground(LabelColor);
			label.setFont(new Font("Courier", Font.BOLD, 25));
			f1.add(label);

			Font font1 = new Font("Courier", Font.BOLD, 20 );
			ltf1 = new JLabel ("Player 1, answer here:");
			ltf2 = new JLabel ("Player 2, answer here:");

			ltf1.setBounds(w/3 - 75, h / 2 - h/15  , 150, 80);
			ltf2.setBounds(w- w/3- 75, h / 2 - h/15  , 150, 80);

			ltf1.setForeground(LabelColor);
			ltf1.setFont(new Font("Courier", Font.BOLD, 10));

			ltf1.setVisible(true);
			f1.add(ltf1);


			ltf2.setForeground(LabelColor);
			ltf2.setFont(new Font("Courier", Font.BOLD, 10));
			ltf2.setVisible(true);
			f1.add(ltf2);

			f1.revalidate();



			tf1=new JTextField();
			tf1.setBounds( w / 3  - 60, h / 2 , 120,80);
			tf1.setFont(font1);
			tf1.setBackground(new Color(195,155,119));
			tf1.setHorizontalAlignment(JTextField.CENTER);

			tf2 = new JTextField();
			tf2.setBounds(w- w/3 - 60, h / 2  , 120, 80);
			tf2.setFont(font1);
			tf2.setBackground(new Color(195,155,119));
			tf2.setHorizontalAlignment(JTextField.CENTER);


			tf1.setVisible(true);
			tf2.setVisible(true);
			f1.add(tf1);
			f1.add(tf2);

		JButton b = new JButton("Check Our Answers");
		   b.setBackground(buttonColor);
		   b.setBounds(w/2-100, h/2 + 120 , 200, 80);
		   b.addActionListener(this);
		   f1.add(b);

		   f1.revalidate();
		   f1.pack();
		   f1.setVisible(true);

		}

		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("Check Our Answers")){
				 //b.setEnabled(false);
				 String s1 = tf1.getText();
				 String s2 = tf2.getText();
				 String str2,answer;

					ltf1.setVisible(false);
					ltf2.setVisible(false);

					 if (z < 5) {
					 	str2 = tAnswers1[z];
					}else {
					 	str2 = tAnswers2[z-5];
					}

					result = new JLabel(str2);

					answer1 = Double.parseDouble(s1);
					answer2 = Double.parseDouble(s2);
					String str="";
					double adx1= Math.abs(answers[z]-answer1);
					double adx2= Math.abs(answers[z]-answer2);

					if (answer1 == answer2 && answer1 == answers[z]) {
						points1 = points1 + 15;
						points2 = points2 + 15;
						str = "Congrats! You both found it!";
					}else if (answer2 ==answers[z]) {
						points2 = points2 + 20;
						str = "Congrats Player 2, you found it!";
					 }else if (answer1 ==answers[z]) {
						points1 = points1 + 20;
						str = "Congrats Player 1, you found it!";
					}else if (adx1 == adx2) {
						points1 = points1 + 5;
						points2 = points2 + 5;
						str = "Nice try! It's a draw!";
					} else if (adx1 < adx2) {
						points1 = points1 + 10;
						str = "Congrats Player 1, you won this round!";
					} else if (adx1 > adx2) {
						points2 = points2 + 10;
						str = "Congrats Player 2, you won this round!";
					}

					result.setBounds(w/2- 40 ,h/4+ h/18,str2.length()*21,200);
			 		result.setForeground(LabelColor);
			 		result.setFont(new Font("Courier", Font.BOLD, 40));
			 		result.setVisible(true);

			 		tf1.setVisible(false);
			 		tf2.setVisible(false);


					p2.setBounds(w/2- 40 ,h/2 - h/15, str2.length()*16,200);
					p2.setOpaque(false);
					resultMessage1 = new JLabel(str);
					resultMessage1.setBounds(w/2- (str.length()/2)*16 ,h/2 - h/15, str2.length()*16,200);
					resultMessage1.setForeground(LabelColor);
					resultMessage1.setFont(new Font("Courier", Font.BOLD, 25));
					resultMessage1.setVisible(true);

					p1.setBounds(w/2- (str2.length()+1/2)*16 ,h/2,str2.length()*25,200);
			 		p1.setOpaque(false);

					p2.setBounds(w/2- (str.length()/2)*16 ,h/2 - h/15, str.length()*16,200);
					p2.setOpaque(false);
					p2.add(resultMessage1);

					p1.add(result);
					f1.add(p2);
					f1.add(p1);

					f1.revalidate();
					f1.pack();
					f1.setVisible(true);
					numOfQ++;

					 new java.util.Timer().schedule(new java.util.TimerTask(){
						@Override
						public void run(){
							if (numOfQ < 10) {
								multiStage2(kp,lp,points1,points2);
							}
							else {
									new java.util.Timer().schedule(new java.util.TimerTask(){
									@Override
										public void run(){
											f1.setVisible(false);
											fs.StageThreeMulti(kp,lp,points1,points2);
																																																									}
									},3000);
							}
						}
					},3000);
			}
	    }
	}

