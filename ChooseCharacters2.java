import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChooseCharacters2 extends JFrame{
	private ImageIcon image[];
	private JLabel label[];

	ChooseCharacters2(){
		setLayout(new FlowLayout());
		image[0]= new ImageIcon(getClass().getResource("hades.jfif"));
		label[0]= new JLabel(image[0]);
		add(label[0]);
		image[1]= new ImageIcon(getClass().getResource("athena.jpg"));
		label[1]= new JLabel(image[1]);
		add(label[1]);
	}

	public static void main (String args[]){
		ImageIcon image[]= new ImageIcon[2];
		JLabel label[]= new JLabel[2];
		ChooseCharacters2 c = new ChooseCharacters2();
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setVisible(true);
		c.pack();
		c.setTitle("CHOOSE CHARACTER");
	}



}