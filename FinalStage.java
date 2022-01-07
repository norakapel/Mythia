import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Image.*;
import javax.swing.JDialog.*;
import java.awt.Color.*;

public class FinalStage implements ActionListener{
	Color LabelColor = new Color(153,102,0);
	PreferedSettings pf = new PreferedSettings();
	Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize();
	int h = DimMax.height;
	int w = DimMax.width;
	Color buttonColor = new Color(153,102,0);

	public void StageThree(int k, int l, int points1, int points2){
		JFrame f1 = new JFrame();
		pf.setFrame(f1);
		f1.setVisible(true);
		JLabel la = new JLabel("STAGE 3: THE BATTLE");
		la.setBounds(w/2 - 250, h/8, 500,50);
		la.setForeground(LabelColor);
		la.setFont(new Font("Courier", Font.BOLD, 40));
		f1.add(la);
		Heroes he = new Heroes(k,l);

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

		String[] ButtonsInserts = {"Kick","Punch","Special Power"};
		String[] ButtonsInsert = {"Kick","Punch","Special Power"};
		JButton [] PlayerOneButtons = new JButton[3];
		JButton [] PlayerTwoButtons = new JButton[3];
		for (int i = 0; i < 3; i++) {
			PlayerOneButtons[i] = new JButton(ButtonsInsert[i]);
			PlayerOneButtons[i].setBounds( w / 6 + w / 10 - w/16,  4* h / 7 + (h/13)*i, w/8, h/16);
			PlayerOneButtons[i].setBackground(buttonColor);
			f1.add(PlayerOneButtons[i]);
		}
		f1.add(p1);

		for (int i = 0; i < 3; i++) {
			PlayerTwoButtons[i] = new JButton(ButtonsInserts[i]);
			PlayerTwoButtons[i].setBounds(w - w / 6 - w / 10 - w / 16,  4* h / 7 + (h/13)*i, w/8, h/16);
			PlayerTwoButtons[i].setBackground(buttonColor);
			f1.add(PlayerTwoButtons[i]);
		}
		f1.add(p2);
	}
	@Override
		public void actionPerformed(ActionEvent e) {
	}
}
