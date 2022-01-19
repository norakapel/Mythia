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

public class Stage2S implements ActionListener {
	Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize();
	int h = DimMax.height;
	int w = DimMax.width;
	JTextField tf1;
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();

	String [] sQuestions = new String[5];

	JLabel label,label2;

	JButton b;

	Random rand = new Random();
	JLabel resultMessage1 = new JLabel();
	JLabel ql = new JLabel();
	JLabel result = new JLabel();
	Color buttonColor = new Color(153,102,0);
	Color LabelColor = new Color(170,102,0);
	PreferedSettings pf = new PreferedSettings();
	JFrame f1 = new JFrame();
	int points;
	int r,kp,lp,z;
	int numOfQ;
	int[] pn = new int[5];
	double answer;
	int[] answers = new int[5];
	String [] questions = new String[5];
	String [] st = new String[5];




	public void singleStage2(int k, int l,int p) {

		if (numOfQ == 0){
			kp = k;
			lp = l;
			Heroes heroes = new Heroes();
			heroes.makeHeroes(k, l);
			questions = heroes.getq1();
			st = heroes.geta1();
		}


		points = p;
		JLabel la = new JLabel("STAGE 2: THE FAITH");
		la.setBounds(w/2 - 220, h/8, 500,50);
		la.setForeground(LabelColor);
		la.setFont(new Font("Courier", Font.BOLD, 40));
		pf.setFrame(f1);
		f1.add(la);
		f1.setLayout(null);


		for (int i = 0 ; i<5; i++) {
			answers[i] = Integer.parseInt(st[i]);
		}

		label2 = new JLabel("YOUR POINTS : " + points);
		label2.setBounds(w/2-170,2*h/3,500,200);
		label2.setForeground(LabelColor);
		label2.setFont(new Font("Courier", Font.BOLD, 30));
		f1.add(label2);

		if (numOfQ == 0){
			int check [] = new int[10];
			for (int j = 0; j < check.length; j++) {
				check[j] = 0;
			}

			for (int i = 0; i < 5; i++ ) {
				do {
					r = rand.nextInt(5);
				} while (check[r] != 0);
				sQuestions[i] = questions[r];
				pn[i] = r;
				check[r]++;
			}
		}
		z=pn[numOfQ];
		ShowQuestion(z);



	}

	public void ShowQuestion(int k) {
		p1.removeAll();
		p1.revalidate();
		p1.repaint();
		p2.removeAll();
		p2.revalidate();
		p2.repaint();
		label = new JLabel(sQuestions[numOfQ]);
		label.setBounds(w/2 - (sQuestions[numOfQ].length() / 2) * 16, h / 4, sQuestions[numOfQ].length() * 16, 200);
		label.setForeground(LabelColor);
		label.setFont(new Font("Courier", Font.BOLD, 25));
		f1.add(label);

		ql = new JLabel("QUESTION "+ (numOfQ+1) +"/5");
		ql.setBounds(w/2-110, h/5,220,200);
		ql.setForeground(LabelColor);
		ql.setFont(new Font("Courier", Font.BOLD, 27));
		ql.setVisible(true);
		f1.add(ql);

		Font font1 = new Font("Courier", Font.BOLD, 20 );
		tf1=new JTextField();
        tf1.setBounds(w /2 -60, h / 2 , 120, 80);
        tf1.setFont(font1);
        tf1.setBackground(new Color(195,155,119));
        tf1.setHorizontalAlignment(JTextField.CENTER);

		tf1.setVisible(true);
        f1.add(tf1);


       b = new JButton("Check My Answer");
       b.setBackground(buttonColor);
       b.setBounds(w/2-100, h/2 + 120 , 200, 80);
       b.addActionListener(this);
       b.setEnabled(true);
       f1.add(b);

       f1.revalidate();
       f1.pack();
       f1.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		ql.setVisible(false);
		if(e.getActionCommand().equals("Check My Answer")){
			b.setEnabled(false);
			String s1 = tf1.getText();
			result = new JLabel(st[z]);
			String str2= st[z];
			answer = Double.parseDouble(s1);
			String str;
			if (answer == answers[z]) {
				points = points + 10;
				str = "Congrats! You got it right!";
			} else if ((answer >= answers[z] - 2 ) && (answer <= answers[z] + 2 )) {
				points = points + 5;
				str = "Congrats! You reached really close!";
			} else {
				str = "Oh no! You have to study History again!";
			}

			result.setBounds(w/2- 40 ,h/4+ h/18,str2.length()*21,200);
	 		result.setForeground(LabelColor);
	 		result.setFont(new Font("Courier", Font.BOLD, 40));
	 		result.setVisible(true);

			//tf1.setBackground(ButtonColor);
	 		tf1.setVisible(false);

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
					if (numOfQ < 5) {
						singleStage2(kp,lp,points);
					}
					else {
						f1.setVisible(false);
						FinalStageSingle fs = new FinalStageSingle();
						fs.StageThreeSingle(kp,lp,points);
					}
				}
			},3000);
		}
	}
}

