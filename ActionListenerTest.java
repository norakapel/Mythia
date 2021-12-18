import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionListenerTest implements ActionListener {

		ChooseCharacters c = new ChooseCharacters();

		JFrame f1 = new JFrame();

		JFrame f2 = new JFrame();

		Example ex = new Example();

	public ActionListenerTest() {
		JButton b1 = new JButton("1. New Game");
		JButton b2 = new JButton("2. Leaderboard");
		JButton b3 = new JButton("3. Info");
		JButton b4 = new JButton("4. Exit");

		b1.setBounds(130,100,300, 40);
		b2.setBounds(130,200,300, 40);
		b3.setBounds(130,300,300, 40);
		b4.setBounds(130,400,300, 40);

		f1.add(b1);//adding button in JFrame
		f1.add(b2);//adding button in JFrame
		f1.add(b3);//adding button in JFrame
		f1.add(b4);//adding button in JFrame
		f1.setSize(600,600);//600 width and 600 height
		f1.setLayout(null);//using no layout managers
		f1.setVisible(true);//making the frame visible

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		f2.setSize(600,600);//600 width and 600 height
		f2.setLayout(null);//using no layout managers

		JLabel t1 = new JLabel("Please choose your way of playing:");
		t1.setBounds(180,50,300,40);
		f2.add(t1);
		JButton b5 = new JButton("1 vs 1");
		JButton b6 = new JButton("solo");
		b5.setBounds(130,100,300, 40);
		b6.setBounds(130,200,300,40);
		f2.add(b5);
		f2.add(b6);
		JButton b7 = new JButton("Back to Menu");
		b7.setBounds(130,400,300,40);
		f2.add(b7);
		b7.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);

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
			JButton b = new JButton("Back to Menu");
			b.setBounds(130,400,300,40);
			b.addActionListener(this);
			f.setSize(600,600);//600 width and 600 height
			f.setLayout(null);//using no layout managers
			f.setVisible(true);//making the frame visible
			JLabel a = new JLabel("Mythia game is a multi quiz game to have fun");
			a.setBounds(100,80,300,200);
			f.add(a);
			f.add(b);






		}else if (e.getActionCommand().equals("Back to Menu")){

			f1.setVisible(true);
			f2.setVisible(false);
		}else if (e.getActionCommand().equals("1 vs 1")){

			c.ChooseCharacters1();
			f1.setVisible(false);
			f2.setVisible(false);

		}else if (e.getActionCommand().equals("solo")){

			c.ChooseCharacters1();
			f1.setVisible(false);
			f2.setVisible(false);

		}else if (e.getActionCommand().equals("4. Exit")){

			System.exit(0);//successfull termination of the game
		}
	}

	public static void main(String[]args) {
		ActionListenerTest test = new ActionListenerTest();
	}

}