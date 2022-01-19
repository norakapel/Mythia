import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Image.*;
import javax.swing.JDialog.*;
import java.awt.Color.*;
import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.FileReader;

public class MythiaMainMenu implements ActionListener{
	Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize();
	int h = DimMax.height;
	int w = DimMax.width;
	ChooseCharacters c = new ChooseCharacters();
	JButton [] menuButtons = new JButton[6];
	JFrame f1 = new JFrame();
	JFrame f2 = new JFrame();
	JFrame f = new JFrame();
	PreferedSettings pf = new PreferedSettings();

	public MythiaMainMenu() {
		pf.setFrame(f1);
		pf.setFrame(f2);

		JPanel pMythia = new JPanel();
		pMythia.setSize(w / 5, h / 5);
		pMythia.setBounds(w / 2 - w / 10  , h / 10, w / 5, h / 5);
		pMythia.setOpaque(false);
		JLabel logoLabel;
		try {
			ImageIcon mythiaImage = new ImageIcon("photos/logo.png");
			Image timage1 = mythiaImage.getImage();
			Image timage2 = timage1.getScaledInstance(w / 5, h / 5, Image.SCALE_SMOOTH);
			mythiaImage = new ImageIcon(timage2);
			logoLabel = new JLabel(mythiaImage);
			logoLabel.setSize(w / 5, h / 5);
			pMythia.setVisible(true);
			pMythia.add(logoLabel);

			f1.add(pMythia);
		} catch (Exception e) {
			e.printStackTrace();
		}

		String[] menuButtonLabels = {"New Game", "Info","Exit","MultiPlayer","Single Player", "Back to Menu"};
		JPanel menuPanel = new JPanel();
		for (int i = 0; i <6; i++) {
			menuButtons[i] = new JButton(menuButtonLabels[i]);
			menuButtons[i].addActionListener(this);
			menuButtons[i].setFont(new Font("Courier", Font.BOLD, 25));
			if(i<3){
				pf.setMenuButtons(menuButtons[i],i,3);
				f1.add(menuButtons[i]);
			}else{
				pf.setMenuButtons(menuButtons[i],i-3,3);
				f2.add(menuButtons[i]);
			}
		}
		f1.setVisible(true);//making the frame visible
		JLabel t1 = new JLabel("Please choose how you want to play");
		Color LabelColor = new Color(170,102,0);
		t1.setForeground(LabelColor);
		t1.setFont(new Font("Courier", Font.BOLD, 22));
		t1.setBounds((DimMax.width / 2)-235,200,500,40);
		f2.add(t1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("New Game")){
			f1.setVisible(false);
			f2.setVisible(true);//making the frame visible
		}else if (e.getActionCommand().equals("Info")){
			f1.setVisible(false);

			//Make Info frame
			//JFrame f = new JFrame();
			pf.setFrame(f);

			//Make Text Area for info text
			JTextArea textArea = new JTextArea(30, 70);
			textArea.setEditable(false);
			textArea.setOpaque(false);
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);

			//Make the textArea scrollable
			JScrollPane s = new JScrollPane(textArea);
			Color buttonColor = new Color(153,102,0);
			s.setForeground(buttonColor);
			s.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			s.setOpaque(false);
			s.getViewport().setOpaque(false);

			//Upload txt
			String file = "MYTHIA INFO.txt";

			//Read txt and append it on textArea
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String text = null;
				int lineCount = 0;
				while ((text = br.readLine()) != null && lineCount < 67) {
					   textArea.append(text + "\n");
					   lineCount++;
				}
				br.close();
			 } catch (IOException ex) {
				ex.printStackTrace();
			}

			//Create Panel for text
			JPanel p1 = new JPanel();
			p1.setBounds(w/2 - w/4 , h/8, w/2, 3*h /5);
			p1.setOpaque(false);
			p1.setVisible(true);
			p1.add(s);

			//Create Panel and Label for title


			//Create Panel for Button
			JPanel p = new JPanel();
			p.setBounds(w/4 , 3 * h / 4, w / 2, h / 2);
			p.setOpaque(false);
			p.setVisible(true);
			p.add(menuButtons[5]);

			//Add all components on frame
			f.add(p);
			f.add(p1);
			f.setVisible(true);
		}else if (e.getActionCommand().equals("Back to Menu")){
			f1.setVisible(true);
			f2.setVisible(false);
			f.setVisible(false);
		}else if (e.getActionCommand().equals("Single Player")){
			//Calling ChooseCharacters1 for single player choose character
			c.ChooseCharacters1(-1,"        ",1);
			Thread new_thread = new Thread(new Runnable(){
				@Override
				public void run(){
						while(!c.buttonClicked){
							try {
								TimeUnit.MILLISECONDS.sleep(500);
							}catch (InterruptedException interruptedException){
								interruptedException.printStackTrace();
							}
						}
						//Calling stage1 giving as parameter the number of character player choose
						Stage1S s1 = new Stage1S(c.charnum);
						s1.Stage1S();
						c.f1.setVisible(false);
				}
			});
			new_thread.start();

			f1.setVisible(false);
			f2.setVisible(false);
		}else if (e.getActionCommand().equals("MultiPlayer")){
			//Calling ChooseCharacthers1 for player 1 to choose character
			c.ChooseCharacters1(-1,"Player 1: ", 2);
			//Thread to continue for 2nd player after 1st choose
			Thread new_thread = new Thread(new Runnable(){
					@Override
					public void run(){
						while(!c.buttonClicked){
							try {
								TimeUnit.MILLISECONDS.sleep(500);
							}catch (InterruptedException interruptedException){
								interruptedException.printStackTrace();
							}
						}

					ChooseCharacters c1 = new ChooseCharacters();
					c.f1.setVisible(false);
					//Calling ChooseCharacthers1 for player 2 to choose character
					c1.ChooseCharacters1(c.charnum,"Player 2: ", 2);
					}
				});
			new_thread.start();
			f1.setVisible(false);
			f2.setVisible(false);
		}else if (e.getActionCommand().equals("Exit")){
			System.exit(0);//successfull termination of the game
		}
	}
	public static void main(String[]args) {
		MythiaMainMenu start = new MythiaMainMenu();
	}
}
