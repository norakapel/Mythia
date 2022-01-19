import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Image.*;
import javax.swing.JDialog.*;
import java.awt.Color.*;

public class PreferedSettings{
	Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize();
	Color buttonColor = new Color(153,102,0);
	public void setFrame(JFrame f) {
		f.setSize(DimMax);
		f.setLayout(null);//using no layout managers
		try {
			ImageIcon backgroundImage = new ImageIcon("photos/background2.png");
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
		b.setBounds((DimMax.width / 2) - 200,(DimMax.height / 2) - (TotalButtons / 2) * 150 + 150 * NumberOfButton, 400, 80);
		b.setBackground(buttonColor);
	}

	public void setMenuButtons1( JButton b, int NumberOfButton, int TotalButtons , Dimension d) {
				b.setBounds((d.width / 2) - 150,(d.height / 2) - (TotalButtons / 2) * 60 + 60 * NumberOfButton, 300, 50);
				b.setBackground(buttonColor);
	}

}