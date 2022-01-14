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
	Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize();
	ChooseCharacters c = new ChooseCharacters();
	FinalStageMulti fs = new FinalStageMulti();
	JFrame f1 = new JFrame();
	JFrame f2 = new JFrame();
	PreferedSettings pf = new PreferedSettings();

	public ActionListenerTest() {
		pf.setFrame(f1);
		pf.setFrame(f2);

		JButton [] menuButtons = new JButton[7];
		String[] menuButtonLabels = {"1. New Game", "2. Leaderboard", "3. Info","4. Exit","1 vs 1","solo", "Back to Menu"};
		JPanel menuPanel = new JPanel();
		for (int i = 0; i <7; i++) {
			menuButtons[i] = new JButton(menuButtonLabels[i]);
			menuButtons[i].addActionListener(this);
			if(i<4){
				pf.setMenuButtons(menuButtons[i],i,4);
				f1.add(menuButtons[i]);
			}else{
				pf.setMenuButtons(menuButtons[i],i-4,3);
				f2.add(menuButtons[i]);
			}
		}
		f1.setVisible(true);//making the frame visible
		JLabel t1 = new JLabel("Please choose your way of playing:");
		t1.setBounds((DimMax.width / 2)-90,200,300,40);
		f2.add(t1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("1. New Game")){
			f1.setVisible(false);
			f2.setVisible(true);//making the frame visible
		}else if (e.getActionCommand().equals("2. Leaderboard")){
			fs.StageThreeMulti(3 , 7 , 20, 20);
		}else if (e.getActionCommand().equals("3. Info")){
			f1.setVisible(false);
			JFrame f = new JFrame();
			pf.setFrame(f);
			JButton b = new JButton("Back to Menu");
			pf.setMenuButtons(b, 1, 1);
			b.addActionListener(this);
			f.setVisible(true);//making the frame visible
			JLabel a = new JLabel("Mythia game is a multi quiz game to have fun");
			a.setBounds(100, 80, 300, 200);
			f.add(a);
			f.add(b);

		}else if (e.getActionCommand().equals("Back to Menu")){
			f1.setVisible(true);
			f2.setVisible(false);
		}else if (e.getActionCommand().equals("1 vs 1")){
			/*c.ChooseCharacters1();
			int p1 = 0;
			int p2=0;
			new java.util.Timer().schedule(
			new java.util.TimerTask(){
							@Override
							public void run(){
								p1 = c.charnum;
								c.f1.setVisible(false);
								f1.setVisible(false);
								f2.setVisible(false);

							}
			},5000);

			f1.setVisible(true);
			f2.setVisible(true);
			c.ChooseCharacters1();

						new java.util.Timer().schedule(
						new java.util.TimerTask(){
										@Override
										public void run(){
											p2 = c.charnum;
											c.f1.setVisible(false);
											f1.setVisible(false);
											f2.setVisible(false);

										}
						},5000);
						*/

		}else if (e.getActionCommand().equals("solo")){
			c.ChooseCharacters1();
			new java.util.Timer().schedule(
				new java.util.TimerTask(){
				@Override
				public void run(){
					int i = c.charnum;
					c.f1.setVisible(false);
					f1.setVisible(false);
					f2.setVisible(false);
					fs.StageThreeMulti(1, 9 , 20, 20);

				}
			},5000);
		}else if (e.getActionCommand().equals("4. Exit")){
			System.exit(0);//successfull termination of the game
		}
	}
	public static void main(String[]args) {
		ActionListenerTest test = new ActionListenerTest();
	}
}
