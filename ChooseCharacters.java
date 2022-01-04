import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChooseCharacters implements ActionListener{
	Multi m = new Multi();
	ActionListenerTest a = new ActionListenerTest();
	public int[] charnum;
	int l=-1;
	public void ChooseCharacters1(){
			JFrame f1 = new JFrame();
			Button b1 = new Button("ADIS");
			Button b2 = new Button("ATHINA");
			Button b3 = new Button("DIAS");
			Button b4 = new Button("ELENI");
			Button b5 = new Button("HRA");
			Button b6 = new Button("HRAKLIS");
			Button b7 = new Button("ODISSEAS");
			Button b8 = new Button("PERSEFONI");
			Button b9 = new Button("POSEIDWNAS");
			Button b10 = new Button("THISEAS");

			f1.setSize(600,600);//600 width and 600 height
			f1.setLayout(null);//using no layout managers
			f1.setVisible(true);//making the frame visible

			b1.setBounds(130,100,300, 40);
			b2.setBounds(130,150,300, 40);
			b3.setBounds(130,200,300, 40);
			b4.setBounds(130,250,300, 40);
			b5.setBounds(130,300,300, 40);
			b6.setBounds(130,350,300, 40);
			b7.setBounds(130,400,300, 40);
			b8.setBounds(130,450,300, 40);
			b9.setBounds(130,500,300, 40);
			b10.setBounds(130,550,300, 40);
			f1.add(b1);//adding button in JFrame
			f1.add(b2);//adding button in JFrame
			f1.add(b3);//adding button in JFrame
			f1.add(b4);//adding button in JFrame
			f1.add(b5);//adding button in JFrame
			f1.add(b6);//adding button in JFrame
			f1.add(b7);//adding button in JFrame
			f1.add(b8);//adding button in JFrame
			f1.add(b9);//adding button in JFrame
			f1.add(b10);//adding button in JFrame

			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			b6.addActionListener(this);
			b7.addActionListener(this);
			b8.addActionListener(this);
			b9.addActionListener(this);
			b10.addActionListener(this);
		}





	}


	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getActionCommand().equals("ADIS")){
			charnum[i] = 1;
		}else if(e.getActionCommand().equals("ATHINA")){
			charnum[i] = 2;
		}else if(e.getActionCommand().equals("DIAS")){
			charnum[i] = 3;
		}else if(e.getActionCommand().equals("ELENI")){
			charnum[i] = 4;
		}else if(e.getActionCommand().equals("HRA")){
			charnum[i] = 5;
		}else if(e.getActionCommand().equals("HRAKLIS")){
			charnum[i] = 6;
		}else if(e.getActionCommand().equals("ODISSEAS")){
			charnum[i] = 7;
		}else if(e.getActionCommand().equals("PERSEFONI")){
			charnum[i] = 8;
		}else if(e.getActionCommand().equals("POSEIDWNAS")){
			charnum[i] = 9;
		}else if(e.getActionCommand().equals("THISEAS")){
			charnum[i] = 10;
		}

	}

}