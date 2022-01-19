import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;

public class ChooseCharacters implements ActionListener{
	PreferedSettings pf = new PreferedSettings();
	//Choosed character number
	public int charnum;
	boolean next;
	public boolean buttonClicked = false;
	JFrame f1 = new JFrame();
	//Table with character names
	String[] Names = {"ADIS", "ATHINA" , "DIAS", "ELENI", "HRA", "HRAKLIS", "ODISSEAS", "PERSEFONI", "POSEIDWNAS", "THISEAS"};
	JLabel showWhoHasToChoose = new JLabel();
	Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize();
	int h = DimMax.height;
	int w = DimMax.width;
	//create label and button default colors
	Color LabelColor = new Color(170, 102, 0);
	Color buttonColor = new Color(153,102,0);
	JButton[] b = new JButton[10];
	//in case of two players
	int previousplayer;

	public void ChooseCharacters1(int k,String s, int players){
		if (players==2 && k >-1) {
			next = true;
		}
		previousplayer = k;
        //set the backgroup to the frame and the right size
	f1.setSize(DimMax);
			try {
				ImageIcon backgroundImage = new ImageIcon("photos/background2.png");
				Image timage1 = backgroundImage.getImage();
				Image timage2 = timage1.getScaledInstance(DimMax.width, DimMax.height, Image.SCALE_SMOOTH);
				backgroundImage = new ImageIcon(timage2);
				JLabel background = new JLabel(backgroundImage);
				background.setMaximumSize(DimMax);
				f1.setContentPane(background);
			} catch (Exception e) {
				e.printStackTrace();
			}
			f1.pack();

	        //create Label to choose character and add it to frame
			JLabel choose = new JLabel( s + "Choose your Character");
			choose.setForeground(LabelColor);
			choose.setFont(new Font("Courier", Font.BOLD,20));
			choose.setSize(400, 70);
			choose.setBounds( w /2 - 200, 60 , 400, 70);
			f1.add(choose);

	        //create buttons for the characters
			for (int i = 0; i < 10; i++) {
				b[i] = new JButton(Names[i]);
				pf.setMenuButtons1(b[i], i, 10, DimMax);
				b[i].setFont(new Font("Courier", Font.BOLD, 20));
				b[i].setVisible(true);
				f1.add(b[i]);
				if (i == (k - 1)){
					b[i].setForeground(Color.RED);
				}else{
					b[i].addActionListener(this);
				}
			}
			f1.revalidate();
			f1.pack();
	        f1.setVisible(true);
	}

 	@Override
 	 public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < Names.length; i++) {
			if (e.getActionCommand().equals(Names[i])) {
				if(previousplayer == -1) {
					b[i].setForeground(Color.RED);
				}else{
					b[i].setForeground(Color.GREEN);

				}
				for (int j = 0 ; j < 10 ; j++) {
					if (j != i) {
						b[j].setEnabled(false);
					}
				}
				charnum = i + 1;
				buttonClicked = true;

				 //if there is two player calling multi
				if (next) {
					Stage1M sm = new Stage1M(previousplayer,charnum);
					sm.stageOneMulti();
					f1.setVisible(false);
				}
			}

		}
	}
}