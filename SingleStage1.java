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

public class SingleStage1 {

	public static void main(String[]args) {
		SingleStage1 s = new SingleStage1(3);
		s.stageOneSingle();
	}

	int m;
	JFrame f = new JFrame();
	Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize();
	//Color buttonColor = new Color(153,102,0);
	JLabel label;
	JButton b1 ;
	JButton b2 ;



	public SingleStage1(int k) {

		m=k;

	}

	public void stageOneSingle() {

		setFrame(f);


		Single characters = new Single(m);
		int a1;
		Scanner i = new Scanner(System.in);
		Random rand = new Random();
		int [] Previous1 = new int [5];
		int p1 = 0;
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

			label = new JLabel(characters.Questions1_1[o]);
			label.setBounds(200,300,300,200);
			f.add(label);
			b1 = new JButton("1." + characters.Rights1_1[o]);
			b1.setBounds(100,100,200,200);
			b2 = new JButton("2." + characters.Wrongs1_1[o]);
			b2.setBounds(400,500,100,100);
			label.add(b1);
			label.add(b2);
			//System.out.println("1." + characters.Rights1_1[o]);
			//System.out.println("2." + characters.Wrongs1_1[o]);
			a1=i.nextInt();
			if(a1 == 1) {
				characters.Points1 = characters.Points1+10;
			}
			System.out.println("YOUR POINTS SO FAR:" + characters.Points1);

		}
	}

	public void setFrame(JFrame f) {
			f.setVisible(true);
			f.setSize(DimMax);
			f.setLayout(null);//using no layout managers
			try {
				ImageIcon backgroundImage = new ImageIcon("background2.jpg");
				Image timage1 = backgroundImage.getImage();
				Image timage2 = timage1.getScaledInstance(DimMax.width, DimMax.height, Image.SCALE_SMOOTH);
				backgroundImage = new ImageIcon(timage2);
				JLabel background = new JLabel(backgroundImage);
				background.setMaximumSize(DimMax);
				f.setContentPane(background);
			} catch (Exception e) {
				e.printStackTrace();
			}
				f.pack();
	}
}




