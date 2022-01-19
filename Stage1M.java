import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Image.*;
import javax.swing.JDialog.*;
import java.awt.Color.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Stage1M implements ActionListener{

	PreferedSettings pf = new PreferedSettings();
	Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize();
	int h = DimMax.height;
	int w = DimMax.width;

	int m, q=0,y;
	JFrame f = new JFrame();
	Color buttonColor = new Color(153,102,0);

	int c,y1, y2, kr, lr;
	int g=0;

	JLabel label;
	JLabel label21;
	JLabel label22;
	JLabel label3;
	JLabel label4;
	JLabel label5;
	JButton b1 ;
	JButton b2 ;

	boolean buttonPressed[] = new boolean[5];
	boolean flag = false;
	int [] Previous1 = new int [5];

	int num=0;

	int points1, points2;//counts the points of the players

	Stage2M s2 = new Stage2M();

	public Stage1M(int kp, int lp) {
		kr=kp;
		lr=lp;
	}


	String [] totalQuestions = new String[20];
	String [] totalRights = new String[20];
	String [] totalWrongs = new String[20];

	public void stageOneMulti() {
		pf.setFrame(f);
		Random rand = new Random();
		int p1 = 0;
		int nxt;
		Multi characters = new Multi(kr,lr);

		for (int i = 0 ; i < 10 ; i++) {
			totalQuestions[i] = characters.Questions1_1[i];
			totalQuestions[i+10] = characters.Questions1_2[i];
			totalRights[i] = characters.Rights1_1[i];
			totalRights[i+10] = characters.Rights1_2[i];
			totalWrongs[i] = characters.Wrongs1_1[i];
			totalWrongs[i+10] = characters.Wrongs1_2[i];
		}


		if (g==0){
			for (int i = 0; i < 5; i++) {
				boolean t = false;
				do {
					t = false;
					nxt = rand.nextInt(10);
					for (int z = 0; z < 5; z++) {
						if (nxt == Previous1[z]) {
							t = true;
							break;
						}
					}
				}while(t == true);
				Previous1[p1]= nxt;
				p1++;
			}
		}
		g++;
		if (y<10) {
			y1 = Previous1[num];
			y2 = Previous1[num] + 10;
			y = y2;
		}else {
			y = y1;
			num++;
		}
		new java.util.Timer().schedule(
							new java.util.TimerTask() {
								@Override
								public void run() {
									ShowQuestions(y);
								}
							},
							500
			);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		b1.setEnabled(false);
		b2.setEnabled(false);
		Multi characters = new Multi(kr,lr);
		if (e.getActionCommand().equals(totalRights[y]) ){
			if (y < 10) {
				points1 += 10;//for each correct answer, the player wins 10 points
			}else {
				points2 +=10;
			}
			if (c == 0) {
				b2.setBackground(Color.GREEN);
			}else if ( c == 1 ) {
				b1.setBackground(Color.GREEN);
			}
			q++;
			if (q == 10){
				new java.util.Timer().schedule(
				new java.util.TimerTask() {
					@Override
					public void run() {
						s2.multiStage2(kr,lr, points1 ,points2);
						f.setVisible(false);
			        }
				},500);

			}else{
				new java.util.Timer().schedule(
					new java.util.TimerTask() {
					    	@Override
					        public void run() {
					            stageOneMulti();

					        }
					},500);
			}
		}else if (e.getActionCommand().equals(totalWrongs[y])){
			if (c == 0){
				b1.setBackground(Color.RED);
			}else if ( c == 1 ) {
				b2.setBackground(Color.RED);
			}
			q++;
			if (q == 10){
				new java.util.Timer().schedule(
					new java.util.TimerTask() {
					@Override
					public void run() {
						s2.multiStage2(kr,lr, points1 ,points2);
						f.setVisible(false);
							        }
				},1000);
			}else{
				new java.util.Timer().schedule(
					new java.util.TimerTask() {
				    	@Override
				        public void run() {

				            stageOneMulti();

				        }
				    },
				    2000
           		);
			}
	   }
	}

	public void ShowQuestions(int k) {

		String a = null, b = null;

		Multi characters = new Multi(kr,lr);

		Random r = new Random();//×ÑÇÓÇ RANDOM ÃÉÁ ÔÕ×ÁÉÁ ÅÐÉËÏÃÇ ÔÙÍ ÁÐÁÍÔÇÓÅÙÍ ÓÔÁ 2 ÊÏÕÌÐÉÁ B1,B2
		 c = r.nextInt(2);
		if (c  == 0 ) {
			a = totalWrongs[k];
			b = totalRights[k];
		} else if (c == 1) {
			b = totalWrongs[k];
			a = totalRights[k];
		}

		pf.setFrame(f);
		label = new JLabel(totalQuestions[k]);

		label.setBounds(w/2- (totalQuestions[k].length()/2)*16,h/3,totalQuestions[k].length()*16,200);
		label.setForeground(buttonColor);
		label.setFont(new Font("Courier", Font.BOLD, 25));
		f.add(label);


		b1 = new JButton(a);
		b1.setBounds(w/3+w/18-150,h/2,300,100);
		b1.setBackground(buttonColor);
		b1.setFont(new Font("Courier", Font.BOLD, 25));

		b2 = new JButton(b);
		b2.setBounds(w-w/3-w/18-150,h/2,300,100);
		b2.setBackground(buttonColor);
		b2.setFont(new Font("Courier", Font.BOLD, 25));


		label21 = new JLabel("PLAYER 1 POINTS : " + points1);
		label21.setBounds(w/3-170,2*h/3,500,200);
		label21.setForeground(buttonColor);
		label21.setFont(new Font("Courier", Font.BOLD, 30));

		label22 = new JLabel("PLAYER 2 POINTS : " + points2);
		label22.setBounds(2*w/3-170,2*h/3,500,200);
		label22.setForeground(buttonColor);
		label22.setFont(new Font("Courier", Font.BOLD, 30));

		label3 = new JLabel("QUESTION " + (q/2 +1) + " / 5");//ÄÅÉ×ÍÅÉ ÔÏÍ ÁÑÉÈÌÏ ÔÇÓ ÅÑÙÔÇÓÇÓ ÓÔÏÍ ÏÐÏÉÏ ÂÑÉÓÊÅÔÁÉ Ï ×ÑÇÓÔÇÓ
		label3.setBounds(w/2-130,h/4,260,200);
		label3.setForeground(buttonColor);
		label3.setFont(new Font("Courier", Font.BOLD, 25));

		label4 = new JLabel("STAGE 1: QUIZ GAME");
		label4.setBounds(w/2-200,h/20,500,200);
		label4.setForeground(buttonColor);
		label4.setFont(new Font("Courier", Font.BOLD, 35));

		JLabel youPlay = new JLabel();
		if (k>9) {
			youPlay = new JLabel("Player 2, is your turn!");
		}else {
			youPlay = new JLabel("Player 1, is your turn!");
		}
		youPlay.setBounds(w / 2 - 150, h/4, 290, 100);
		youPlay.setForeground(Color.BLACK);
		youPlay.setFont(new Font("Courier", Font.BOLD, 20));


		b1.addActionListener(this);
		b2.addActionListener(this);
		f.add(b1);
		f.add(b2);
		f.add(label21);
		f.add(label22);
		f.add(label3);
		f.add(label4);
		f.add(youPlay);
		f.pack();
		f.setVisible(true);
	}





}




