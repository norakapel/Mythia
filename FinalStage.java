import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Image.*;
import javax.swing.JDialog.*;
import java.awt.Color.*;
import java.util.Random;

public class FinalStage implements ActionListener{
	Random rand = new Random();
	Color LabelColor = new Color(153,102,0);
	PreferedSettings pf = new PreferedSettings();
	Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize();
	int h = DimMax.height;
	int w = DimMax.width;
	Color buttonColor = new Color(153,102,0);

	public void StageThree(int k, int l, int points1, int points2){

		Heroes he = new Heroes(k,l);
		String[] ButtonsInserts1 = he.K1;
		String[] ButtonsInserts2 = he.K2;
		int [] Damage1 = he.d1;
		int[] Damage2 = he.d2;

		JFrame f1 = new JFrame();
		pf.setFrame(f1);
		f1.setVisible(true);
		JLabel la = new JLabel("STAGE 3: THE BATTLE");
		la.setBounds(w/2 - 250, h/8, 500,50);
		la.setForeground(LabelColor);
		la.setFont(new Font("Courier", Font.BOLD, 40));
		f1.add(la);

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		f1.setLayout(null);
		try {
			ImageIcon cardsImage = he.CharacterCard1;
			Image cimage1 = cardsImage.getImage();
			Image cimage2 = cimage1.getScaledInstance(w/5, 4*h/7, Image.SCALE_SMOOTH);
			cardsImage = new ImageIcon(cimage2);
			JLabel cards = new JLabel(cardsImage);
			cards.setSize(DimMax);
			p1.setVisible(true);
			p1.setSize(400,580);
			p1.setBounds(w/6 ,h/4, w/5 , 4*h/7);
			p1.add(cards);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			ImageIcon cardsImage = he.CharacterCard2;
			Image cimage1 = cardsImage.getImage();
			Image cimage2 = cimage1.getScaledInstance(w/5, 4*h/7, Image.SCALE_SMOOTH);
			cardsImage = new ImageIcon(cimage2);
			JLabel cards = new JLabel(cardsImage);
			cards.setSize(DimMax);
			p2.setVisible(true);
			p2.setSize(400,580);
			p2.setBounds(w - w/6 - w/5 , h / 4, w / 5 , 4 * h / 7);
			p2.add(cards);
		} catch (Exception e) {
			e.printStackTrace();
		}


		JButton [] PlayerOneButtons = new JButton[3];
		JButton [] PlayerTwoButtons = new JButton[3];
		for (int i = 0; i < 3; i++) {
			PlayerOneButtons[i] = new JButton(ButtonsInserts1[i]);
			PlayerOneButtons[i].setFont(new Font("Courier", Font.BOLD, 14));
			PlayerOneButtons[i].setBounds( w / 6 + w / 10 - w/16,  12* h / 20 + (h/14)*i,w/8, h/17);
			PlayerOneButtons[i].setBackground(buttonColor);
			f1.add(PlayerOneButtons[i]);
		}
		f1.add(p1);

		for (int i = 0; i < 3; i++) {
			PlayerTwoButtons[i] = new JButton(ButtonsInserts2[i]);
			PlayerTwoButtons[i].setBounds(w - w / 6 - w / 10 - w / 18,  12* h / 20 + (h/14)*i, w/9, h/17);
			PlayerTwoButtons[i].setBackground(buttonColor);
			f1.add(PlayerTwoButtons[i]);
		}
		f1.add(p2);


		JLabel pointsLabel1 = new JLabel("Your points so far are: ");
		String points = (points1 + " - " + points2);
		JLabel pointsLabel2 = new JLabel(points);
		pointsLabel1.setBounds(w/2 - 145, h/4, 290,30);
		pointsLabel2.setBounds(w/2 - 70, h/4 + 30 , 140, 70);
		pointsLabel1.setForeground(LabelColor);
		pointsLabel2.setForeground(LabelColor);
		pointsLabel1.setFont(new Font("Courier", Font.BOLD, 20));
		pointsLabel2.setFont(new Font("Courier", Font.BOLD, 25));
		f1.add(pointsLabel1);
		f1.add(pointsLabel2);

		if (points1==points2) {

			JLabel draw = new JLabel ("It's a draw. Player1 Choose: heads or tails ?");
			draw.setForeground(LabelColor);
			draw.setBounds(w/2-200, h/3 + 40, 400 , 30);
			draw.setFont(new Font("Courier", Font.BOLD, 15));
			f1.add(draw);

			JButton heads = new JButton("Heads");
			JButton tails = new JButton("Tails");
			heads.setBackground(LabelColor);
			tails.setBackground(LabelColor);
			heads.setBounds(w/2 - 100, h/3 + 90, 200, 50);
			tails.setBounds(w/2-100, h/3 + 170, 200, 50);
			f1.add(heads);
			f1.add(tails);
		}

		double z1,z2;



	}
	@Override
		public void actionPerformed(ActionEvent e) {
	}
}
