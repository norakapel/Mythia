import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChooseCharacters implements ActionListener{
	PreferedSettings pf = new PreferedSettings();
	public int charnum;
	public boolean ButtonClicked = false;
	public int ChooseCharacters1(){
		String[] Names = {"ADIS", "ATHINA" , "DIAS", "ELENI", "HRA", "HRAKLIS", "ODISSEAS", "PERSEFONI", "POSEIDWNAS", "THISEAS"};
		JFrame f1 = new JFrame();
		pf.setFrame(f1);
		JButton[] b = new JButton[10];
		for (int i = 0; i < 10; i++) {
			b[i] = new JButton(Names[i]);
			pf.setMenuButtons1(b[i], i, 10);
			f1.add(b[i]);
			b[i].addActionListener(this);
		}
		f1.setVisible(true);
		return charnum;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("ADIS")){
			charnum = 1;
		}else if(e.getActionCommand().equals("ATHINA")){
			charnum = 2;
		}else if(e.getActionCommand().equals("DIAS")){
			charnum = 3;
		}else if(e.getActionCommand().equals("ELENI")){
			charnum = 4;
		}else if(e.getActionCommand().equals("HRA")){
			charnum = 5;
		}else if(e.getActionCommand().equals("HRAKLIS")){
			charnum = 6;
		}else if(e.getActionCommand().equals("ODISSEAS")){
			charnum = 7;
		}else if(e.getActionCommand().equals("PERSEFONI")){
			charnum = 8;
		}else if(e.getActionCommand().equals("POSEIDWNAS")){
			charnum = 9;
		}else if(e.getActionCommand().equals("THISEAS")){
			charnum = 10;
		}
	}
}