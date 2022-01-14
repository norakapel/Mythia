import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChooseCharacters implements ActionListener{
	PreferedSettings pf = new PreferedSettings();
	public int charnum;
	public boolean ButtonClicked = false;
	JFrame f1 = new JFrame();
	public void ChooseCharacters1(){
		String[] Names = {"ADIS", "ATHINA" , "DIAS", "ELENI", "HRA", "HRAKLIS", "ODISSEAS", "PERSEFONI", "POSEIDWNAS", "THISEAS"};
		pf.setFrame(f1);
		JButton[] b = new JButton[10];
		for (int i = 0; i < 10; i++) {
			b[i] = new JButton(Names[i]);
			pf.setMenuButtons1(b[i], i, 10);
			f1.add(b[i]);
			b[i].addActionListener(this);
		}
		f1.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("ADIS")){
			charnum = 1;
			ButtonClicked = true;
		}else if(e.getActionCommand().equals("ATHINA")){
			charnum = 2;
			ButtonClicked = true;
		}else if(e.getActionCommand().equals("DIAS")){
			charnum = 3;
			ButtonClicked = true;
		}else if(e.getActionCommand().equals("ELENI")){
			charnum = 4;
			ButtonClicked = true;
		}else if(e.getActionCommand().equals("HRA")){
			charnum = 5;
			ButtonClicked = true;
		}else if(e.getActionCommand().equals("HRAKLIS")){
			charnum = 6;
			ButtonClicked = true;
		}else if(e.getActionCommand().equals("ODISSEAS")){
			charnum = 7;
			ButtonClicked = true;
		}else if(e.getActionCommand().equals("PERSEFONI")){
			charnum = 8;
			ButtonClicked = true;
		}else if(e.getActionCommand().equals("POSEIDWNAS")){
			charnum = 9;
			ButtonClicked = true;
		}else if(e.getActionCommand().equals("THISEAS")){
			charnum = 10;
			ButtonClicked = true;
		}
	}
}