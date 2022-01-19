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

public class Stage1S implements ActionListener{
	//public static void main(String[]args){
	//SingleStage1 s = new SingleStage1(5);
	//s.stageOneSingle();
	//}
	PreferedSettings pf = new PreferedSettings();
	Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize();
	int h = DimMax.height;
	int w = DimMax.width;

	int m, q=0,y;
	JFrame f = new JFrame();
	Color buttonColor = new Color(153,102,0);

	JButton b1, b2;
	int c;
	int g=0;

	JLabel label;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;


	boolean buttonPressed[] = new boolean[5];
	boolean flag = false;
	int [] Previous1 = new int [5];

	int points;//counts the points of the player

	Stage2S s2 = new Stage2S();

	public Stage1S(int k) {

		m=k;

	}

	Single characters = new Single(m);

	public void Stage1S() {
		pf.setFrame(f);
		Random rand = new Random();
		int p1 = 0;
		int nxt;
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

		y = Previous1[q];
		new java.util.Timer().schedule(
							new java.util.TimerTask() {
								@Override
								public void run() {
									ShowQuestions(y);
								}
							},100

			);







	}

	@Override
	public void actionPerformed(ActionEvent e) {
		b1.setEnabled(false);
		b2.setEnabled(false);
		Single characters = new Single(m);
		if (e.getActionCommand().equals(characters.Rights1_1[y]) ){
			points += 10;//for each correct answer, the player wins 10 points
			if (c == 0) {
				b2.setBackground(Color.GREEN);
			}else if ( c == 1 ) {
				b1.setBackground(Color.GREEN);
			}
			q++;
			if (q == 5){
				Random r = new Random();
				int p;
				do {
					p = r.nextInt(10);
				}while(p == m);
				s2.singleStage2(m, p ,points);
				f.setVisible(false);
			}else{
				new java.util.Timer().schedule(
					new java.util.TimerTask() {
					    	@Override
					        public void run() {
					            Stage1S();
					        }
				    	},
						500
			    );
			}
		}else if (e.getActionCommand().equals(characters.Wrongs1_1[y]) ){
			if (c == 0){
				b1.setBackground(Color.RED);
			}else if ( c == 1 ) {
				b2.setBackground(Color.RED);
			}
			q++;

			if (q == 5){
				Random r = new Random();
				int p;
				do {
					p = r.nextInt(10);
				}while(p == m);

				try {
					Thread.sleep(500);
					f.setVisible(false);
					s2.singleStage2(m, p ,points);
				}catch (InterruptedException ex) {
				}

			}else{
				new java.util.Timer().schedule(
					new java.util.TimerTask() {
				    	@Override
				        public void run() {

				            Stage1S();

				        }
				    },
				    500
           		);
			}
	   }
	}

	public void ShowQuestions(int k) {

		String a = null, b = null;

		Single characters = new Single(m);

		Random r = new Random();//×ÑÇÓÇ RANDOM ÃÉÁ ÔÕ×ÁÉÁ ÅÐÉËÏÃÇ ÔÙÍ ÁÐÁÍÔÇÓÅÙÍ ÓÔÁ 2 ÊÏÕÌÐÉÁ B1,B2
		 c = r.nextInt(2);
		if (c  == 0 ) {
			a = characters.Wrongs1_1[k];
			b = characters.Rights1_1[k];
		} else if (c == 1) {
			b = characters.Wrongs1_1[k];
			a = characters.Rights1_1[k];
		}

		pf.setFrame(f);
		label = new JLabel(characters.Questions1_1[k]);
		label.setBounds(w/2- (characters.Questions1_1[k].length()/2)*16,h/3,characters.Questions1_1[k].length()*16,200);
		label.setForeground(buttonColor);
		label.setFont(new Font("Courier", Font.BOLD, 25));
		f.add(label);


		b1 = new JButton(a);
		b1.setBounds(w/3-200,h/2,400,100);
		b1.setBackground(buttonColor);
		b1.setFont(new Font("Courier", Font.BOLD, 22));

		b2 = new JButton(b);
		b2.setBounds(w-w/3-200,h/2,400,100);
		b2.setBackground(buttonColor);
		b2.setFont(new Font("Courier", Font.BOLD, 22));

		label2 = new JLabel("YOUR POINTS : " + points);
		label2.setBounds(w/2-170,2*h/3,500,200);
		label2.setForeground(buttonColor);
		label2.setFont(new Font("Courier", Font.BOLD, 30));

		label3 = new JLabel("QUESTION " + (q+1) + " / 5");//ÄÅÉ×ÍÅÉ ÔÏÍ ÁÑÉÈÌÏ ÔÇÓ ÅÑÙÔÇÓÇÓ ÓÔÏÍ ÏÐÏÉÏ ÂÑÉÓÊÅÔÁÉ Ï ×ÑÇÓÔÇÓ
		label3.setBounds(w/2-100,h/4,500,200);
		label3.setForeground(buttonColor);
		label3.setFont(new Font("Courier", Font.BOLD, 25));

		label4 = new JLabel("STAGE 1: QUIZ GAME");
		label4.setBounds(w/2-150,h/20,500,200);
		label4.setForeground(buttonColor);
		label4.setFont(new Font("Courier", Font.BOLD, 35));

		b1.addActionListener(this);
		b2.addActionListener(this);
		f.add(b1);
		f.add(b2);
		f.add(label2);
		f.add(label3);
		f.add(label4);
		f.pack();
		f.setVisible(true);
	}



}




