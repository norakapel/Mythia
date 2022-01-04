import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Image.*;
import javax.swing.JDialog.*;
import java.awt.Color.*;

public class ActionListenerTest implements ActionListener{
	ChooseCharacters c = new ChooseCharacters();
	JFrame f1 = new JFrame();
	JFrame f2 = new JFrame();
	Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize();
	Color buttonColor = new Color(153,102,0);

	public ActionListenerTest() {
		setFrame(f1);
		setFrame(f2);

		JButton [] menuButtons = new JButton[7];
		String[] menuButtonLabels = {"1. New Game", "2. Leaderboard", "3. Info","4. Exit","1 vs 1","solo", "Back to Menu"};
		JPanel menuPanel = new JPanel();
		for (int i = 0; i <7; i++) {
			menuButtons[i] = new JButton(menuButtonLabels[i]);
			if(i<4){
				setMenuButtons(menuButtons[i],i,4);
				f1.add(menuButtons[i]);
			}else{
				setMenuButtons(menuButtons[i],i-4,3);
				f2.add(menuButtons[i]);
			}
		}
		f1.setVisible(true);//making the frame visible

		JLabel t1 = new JLabel("Please choose your way of playing:");
		t1.setBounds(180,50,300,40);
		f2.add(t1);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("1. New Game")){
			f1.setVisible(false);
			f2.setVisible(true);//making the frame visible
		}else if (e.getActionCommand().equals("2. Leaderboard")){

		}else if (e.getActionCommand().equals("3. Info")){
			f1.setVisible(false);
			JFrame f = new JFrame();
			setFrame(f);
			JButton b = new JButton("Back to Menu");
			setMenuButtons(b,1,1);
			f.setVisible(true);//making the frame visible
			JLabel a = new JLabel("Mythia game is a multi quiz game to have fun");
			a.setBounds(100,80,300,200);
			f.add(a);
			f.add(b);

		}else if (e.getActionCommand().equals("Back to Menu")){
			f1.setVisible(true);
			f2.setVisible(false);
		}else if (e.getActionCommand().equals("1 vs 1")){
			c.ChooseCharacters1(2);
			f1.setVisible(false);
			f2.setVisible(false);
		}else if (e.getActionCommand().equals("solo")){
			c.ChooseCharacters1(1);
			f1.setVisible(false);
			f2.setVisible(false);
		}else if (e.getActionCommand().equals("4. Exit")){
			System.exit(0);//successfull termination of the game
		}
	}

	public static void main(String[]args) {
		ActionListenerTest test = new ActionListenerTest();
	}

	public void setFrame(JFrame f) {
				f.setSize(DimMax);
				f.setLayout(null);//using no layout managers
				try {
					ImageIcon backgroundImage = new ImageIcon("background1.jpg");
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

	public void setMenuButtons( JButton b, int NumberOfButton, int TotalButtons ) {
		b.setBounds((DimMax.width/2)-200,(DimMax.height/2)-(TotalButtons/2)*100+100*NumberOfButton,400, 40);
		b.setBackground(buttonColor);
		b.addActionListener(this);
	}
}
