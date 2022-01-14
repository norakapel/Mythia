import java.util.Random;
import java.util.Scanner;
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

public class MultiStage1 implements ActionListener {

 	public static void main(String[]args) {
		MultiStage1 m = new MultiStage1(2,6);
		m.stageOneMulti();
	}

    int m;
    int n;

    PreferedSettings pf = new PreferedSettings();
	Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize();//get full size of screen
	int h = DimMax.height;
	int w = DimMax.width;

	JFrame f = new JFrame();
	Color buttonColor = new Color(153,102,0);

	public MultiStage1(int k, int l) {

		m=k;
		n=l;

	}

	public void stageOneMulti() {

		pf.setFrame(f);
		f.setVisible(true);

		Multi characters =new Multi(m,n);
		int a1;
		int a2;
		Scanner i = new Scanner(System.in);
		Random rand = new Random();
		int [] Previous1 = new int [5];
		int [] Previous2 = new int [5];
		int p1 = 0;
		int p2 =0;
		int nxt;
		for (int o=0;o<5;o++) {
			boolean t = false;
			do {
				nxt = rand.nextInt(10);
				for (int z=0;z<5;z++) {
					if (nxt != Previous1[z]) {
						t = true;
					}
				}
			}while(t == false);
			Previous1[p1]= nxt;
			p1++;
			System.out.println(characters.Questions1_1[nxt]);
			System.out.println("1." + characters.Rights1_1[nxt]);
			System.out.println("2." + characters.Wrongs1_1[nxt]);
			a1=i.nextInt();
			if(a1 == 1) {
				characters.Points1 = characters.Points1+10;
			}
			System.out.println("YOUR POINTS SO FAR:" + characters.Points1);
			boolean b = false;
			do {
				nxt = rand.nextInt(10);
				for (int w=0;w<5;w++) {
					if (nxt != Previous2[w]) {
						b = true;
					}
				}
			}while(b == false);
			Previous2[p2]= nxt;
			p2++;
			System.out.println(characters.Questions1_2[nxt]);
			System.out.println("1." + characters.Rights1_2[nxt]);
			System.out.println("2." + characters.Wrongs1_2[nxt]);
			a2=i.nextInt();
			if(a2 == 1) {
				characters.Points2 = characters.Points2+10;
			}
			System.out.println("YOUR POINTS SO FAR:" + characters.Points2);
		}

		ShowQuestions(0,0);

	}//end of stageOneMulti

	@Override
	public void actionPerformed(ActionEvent e) {

	}//end of actionPerformed

	public void ShowQuestions(int k, int m) {

		pf.setFrame(f);

	}//end of ShowQuestions

}//end of class
