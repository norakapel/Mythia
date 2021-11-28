import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionListenerTest implements ActionListener {

		JFrame f1 = new JFrame();

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
		f1.setSize(600,600);//400 width and 500 height
		f1.setLayout(null);//using no layout managers
		f1.setVisible(true);//making the frame visible

		b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		f1.setVisible(false);
		JFrame f2 = new JFrame();
		JButton b5 = new JButton("1 vs 1");
		JButton b6 = new JButton("solo");
		b5.setBounds(130,100,300, 40);
		b6.setBounds(130,200,300,40);
		f2.add(b5);
		f2.add(b6);
		f2.setSize(600,600);//400 width and 500 height
		f2.setLayout(null);//using no layout managers
		f2.setVisible(true);//making the frame visible
	}

	public static void main(String[]args) {
		ActionListenerTest test = new ActionListenerTest();
	}

}