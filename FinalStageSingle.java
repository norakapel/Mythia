	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.io.IOException;
	import javax.imageio.ImageIO;
	import java.awt.Image.*;
	import java.awt.Color.*;
	import java.util.Random;
	import java.lang.Math.*;

	public class FinalStageSingle implements ActionListener{
		Random rand = new Random();
		// in case of a draw, k variable will be used to show who is playing first
		int ko = rand.nextInt(2);

		Color LabelColor = new Color(170,102,0);
		Color buttonColor = new Color(153,102,0);
		PreferedSettings pf = new PreferedSettings();
		// dimensions to fit perfectly in every screen
		Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize();
		int h = DimMax.height;
		int w = DimMax.width;


		JLabel pointsLabel1 = new JLabel();
		JLabel pointsLabel2 = new JLabel();
		JLabel [] Live = new JLabel[2];
		JLabel playingFirst = new JLabel();
		JLabel [][] showMoves = new JLabel[2][5];

		//caharcters' photos
		ImageIcon headsIcon = new ImageIcon("photos/HeadsImage.png");
		ImageIcon tailsIcon = new ImageIcon("photos/TailsImage.png");

		//buttons for Heads or Tails
		JButton heads = new JButton("Heads");
		JButton tails = new JButton("Tails");

		// players' buttons
		JButton [] [] PlayerButtons = new JButton[2][3];

		// basic frame
		JFrame f1 = new JFrame();

		//panels for characters' card photos
		JPanel [] p = new JPanel[2];

		//panels for characters' lives
		JPanel [] plives = new JPanel[2];
		JPanel p3 = new JPanel();

		//first shows which player is playing first
		int first;
		int points;

		//characters' lives
		double[] lives = {100,100};

		//every move's damage
		int[][] Damages = new int[2][3];

		// every move's names
		String [][] Moves = new String[2][3];


		public void StageThreeSingle(int k, int l, int points1){

			Heroes he = new Heroes();
			he.makeHeroes(k,l);
			points = points1;
			// player 1 moves
			String[] ButtonsInserts1 = he.M1;
			//Computer moves
			String[] ButtonsInserts2 = he.K1;
			//player 1 damages
			int [] Damage1 = he.m1;
			//Computer damages
			int[] Damage2 = he.k1;

			pointsLabel1 = new JLabel("Your points so far are: "+ points);

			for (int j = 0; j < 3; j++) {
				Damages[0][j] = Damage1[j];
				Damages[1][j] = Damage2[j];
				Moves[0][j] = ButtonsInserts1[j];
				Moves[1][j] = ButtonsInserts2[j];
			}

			for (int i = 0 ; i < 2 ; i++) {
				showMoves[i][0] = new JLabel("Player " + (i+1) + " Choose your move: ");
				showMoves[i][1] = new JLabel(Moves[i][0] + ": opponent's life = -" + Damages[i][0]);
				showMoves[i][2] = new JLabel(Moves[i][1] + ": opponent's life = -" + Damages[i][1]);
				double d2 = Damages[i][1] * 0.3;
				showMoves[i][3] = new JLabel("		        	    	: your life = -" +d2);
				showMoves[i][4] = new JLabel(Moves[i][2] + ": your life = +" +Damages[i][2]);
			}
			pf.setFrame(f1);
			JLabel la = new JLabel("STAGE 3: THE BATTLE");
			la.setBounds(w/2 - 250, h/8, 500,50);
			la.setForeground(LabelColor);
			la.setFont(new Font("Courier", Font.BOLD, 40));
			f1.add(la);
			f1.setLayout(null);

			p3.setSize(500,500);
			p3.setOpaque(false);
			p3.setBounds(w /2-180, h/3 + 90, 360, 600);
			p3.setVisible(true);

			for (int i = 0; i<2; i++) {
				Live[i]= new JLabel("Your Life = " +lives[i]);
				Live[i].setForeground(LabelColor);
				Live[i].setFont(new Font("Courier", Font.BOLD, 16));
			}
			Live[0].setBounds(w/6 +w/5 - 170, h/4 - 30 , 170 , 30);
			Live[1].setBounds(w - w/6  - w/5, h/4 - 30 , 170 , 30);
			f1.add(Live[0]);
			f1.add(Live[1]);


			try {
				ImageIcon cardsImage = he.CharacterCard1;
				Image cimage1 = cardsImage.getImage();
				Image cimage2 = cimage1.getScaledInstance(w/5, 4*h/7, Image.SCALE_SMOOTH);
				cardsImage = new ImageIcon(cimage2);
				JLabel cards = new JLabel(cardsImage);
				cards.setSize(DimMax);
				p[0]= new JPanel();
				p[0].setVisible(true);
				p[0].setSize(400,580);
				p[0].setBounds(w/6 ,h/4, w/5 , 4*h/7);
				p[0].add(cards);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				ImageIcon cardsImage = he.CharacterCard2;
				Image cimage1 = cardsImage.getImage();
				Image cimage2 = cimage1.getScaledInstance(w/5, 4*h/7, Image.SCALE_SMOOTH);
				cardsImage = new ImageIcon(cimage2);
				JLabel cards = new JLabel(cardsImage);
				cards.setSize(DimMax);
				p[1]= new JPanel();
				p[1].setVisible(true);
				p[1].setSize(400,580);
				p[1].setBounds(w - w/6 - w/5 , h / 4, w / 5 , 4 * h / 7);
				p[1].add(cards);
			} catch (Exception e) {
				e.printStackTrace();
			}
			for (int i = 0; i < 2; i++) {
				for (int j = 0 ; j < 3; j++) {
					if (i==0) {
						PlayerButtons[i][j] = new JButton(ButtonsInserts1[j]);
						PlayerButtons[i][j].setBounds( w / 6 + w / 10 - w/16,  3* h / 5 + (h/14)*j,w/8, h/17);
					}else {
						PlayerButtons[i][j] = new JButton(ButtonsInserts2[j]);
						PlayerButtons[i][j].setBounds(w - w / 6 - w / 10 - w / 16,  3* h / 5 + (h/14)*j, w/8, h/17);
					}
					PlayerButtons[i][j].setFont(new Font("Courier", Font.BOLD, 14));
					PlayerButtons[i][j].setBackground(buttonColor);
					PlayerButtons[i][j].addActionListener(this);
					PlayerButtons[i][j].setEnabled(false);
					f1.add(PlayerButtons[i][j]);
				}
			}

			f1.add(p[0]);
			f1.add(p[1]);

			String whosfirst;
			if (points < 50) {
				whosfirst = "so Computer is playing first";
			}else if (points > 50) {
				whosfirst = "so you are playing first";
			}else{
				whosfirst = "so you have to choose:";
			}
			pointsLabel2 = new JLabel(whosfirst);
			pointsLabel2.setBounds(w / 2 - 140, h / 3, 400,30);
			pointsLabel1.setBounds(w / 2 - 160, h / 3 - h / 20, 320 , 30);
			pointsLabel1.setForeground(LabelColor);
			pointsLabel2.setForeground(LabelColor);
			pointsLabel1.setFont(new Font("Courier", Font.BOLD, 20));
			pointsLabel2.setFont(new Font("Courier", Font.BOLD, 20));
			f1.add(pointsLabel1);
			f1.add(pointsLabel2);


			new java.util.Timer().schedule(
						new java.util.TimerTask(){
							@Override
							public void run(){
								Game();
						}
			},500);
			f1.pack();
		}


		public void Game(){
			if (points==50) {
				heads.setBackground(LabelColor);
				tails.setBackground(LabelColor);
				heads.setBounds(w/2 - 100, h/3 + 90, 200, 50);
				tails.setBounds(w/2-100, h/3 + 170, 200, 50);
				f1.add(heads);
				f1.add(tails);
				heads.addActionListener(this);
				tails.addActionListener(this);

				f1.revalidate();
				f1.setVisible(true);

			} else if(points > 50) {
				f1.setVisible(true);
				Battle(1);
			}else{
				f1.setVisible(true);
				int m;
				if (lives[1]< 85){
					m = rand.nextInt(3);
				}else {
					m = rand.nextInt(2);
				}
				Battle(2);
				new java.util.Timer().schedule(new java.util.TimerTask(){
									@Override
									public void run(){
									MovePressed(1,m);
								}
				},3000);
			}

			f1.pack();



		}

		public static ImageIcon HeadsOrTails(ImageIcon icon) {
			ImageIcon resultImage = icon;
			Image rimage1 = resultImage.getImage();
			Image rimage2 = rimage1.getScaledInstance(250, 200, Image.SCALE_SMOOTH);
			resultImage = new ImageIcon(rimage2);
			return resultImage;
		}

		public void ShowHeadsOrTails(){
			ImageIcon result = new ImageIcon();

			if(ko==0) {
				result = HeadsOrTails(headsIcon);
			}else{
				result = HeadsOrTails(tailsIcon);
			}
			JLabel showResults = new JLabel(result);
			showResults.setBounds(w / 2 - 100, 2*h/3 - h/40, 200, 200);
			p3.add(showResults);
			playingFirst.setForeground(LabelColor);
			playingFirst.setFont(new Font("Courier", Font.BOLD, 14));
			playingFirst.setBounds(w/2 - 150, h/3 + 350 , 300 , 100);
			p3.add(playingFirst);
			f1.add(p3);
			f1.setVisible(true);
		}

		public void Battle (int i){
			pointsLabel1.setVisible(false);
			pointsLabel2.setVisible(false);
			//.setVisible(false);
			p3.removeAll();
			p3.revalidate();
			p3.repaint();
			if (lives[0] > 0 && lives[1] > 0) {
				int isplaying = i -1;
				int notplaying = Math.abs(isplaying-1);
				for (int j=0; j < 3 ; j++){
					PlayerButtons[isplaying][j].setEnabled(true);
					PlayerButtons[notplaying][j].setEnabled(false);
				}
				for (int j = 0 ; j < 5; j++ ) {
					showMoves[isplaying][j].setBounds(w/2-180, h/3 + j*30, 380 , 30);
					showMoves[isplaying][j].setForeground(LabelColor);
					showMoves[isplaying][j].setFont(new Font("Courier", Font.BOLD, 15));
					showMoves[isplaying][j].setOpaque(false);
					p3.add(showMoves[isplaying][j]);

				}
				JLabel failureRate = new JLabel("with failure rate 40%");
				failureRate.setForeground(LabelColor);
				failureRate.setFont(new Font("Courier", Font.BOLD, 15));
				failureRate.setOpaque(false);
				failureRate.setBounds(w/2-100, h/3 + 200, 200 , 30);
				p3.add(failureRate);
				p3.setVisible(true);
				p3.revalidate();
				f1.add(p3);
				f1.pack();
				f1.setVisible(true);
			}else {
				JLabel winnerLabel = new JLabel();
				if (lives[0] > lives[1]) {
					winnerLabel = new JLabel("Player 1 won");
				}else if (lives[0] < lives[1]) {
					winnerLabel = new JLabel("Computer won");
				}else {
					winnerLabel = new JLabel("Both players lost");
				}
				winnerLabel.setBounds(w/2-200, h/3, 400 , 30);
				winnerLabel.setForeground(LabelColor);
				winnerLabel.setFont(new Font("Courier", Font.BOLD, 30));
				winnerLabel.setOpaque(false);
				p3.add(winnerLabel);
				p3.setVisible(true);
				f1.add(p3);
				f1.pack();
				f1.setVisible(true);
			}
		}

		public void MovePressed(int k, int l) {
			p3.removeAll();
			p3.revalidate();
			p3.repaint();
			String st="" ;
			//System.out.print(k +" " +l);
			if (l==1){
				lives[k] -= Damages[k][l] * 0.3;
				lives[Math.abs(k-1)]-= Damages[k][l];
			}else if (l==2) {
				int r=rand.nextInt(5);
				if (r!=1 && r!=4){
					st = " Done";
					if (lives[k] < 100 - Damages[k][l]) {
						lives[k] += Damages[k][l];
					} else {
						lives[k] = 100 ;
					}
				}else {
						st = " Failed";
				}
			}else {
				lives[Math.abs(k-1)]-= Damages[k][l];
			}
			for (int i = 0 ; i < 2 ; i++) {
				if (lives[i] < 0) {
					lives[i] = 0;
				}
			}

			JLabel moveDone = new JLabel((Moves[k][l]+st));
			moveDone.setBounds(w/2-170, h/2, 400 , 30);
			moveDone.setForeground(LabelColor);
			moveDone.setFont(new Font("Courier", Font.BOLD, 28));
			moveDone.setOpaque(false);
			p3.add(moveDone);
			p3.revalidate();



			SetLives();
			if (k==1) {
				new java.util.Timer().schedule(
					new java.util.TimerTask(){
						@Override
						public void run(){
						Battle(1);
				}
			},3000);
		}
	}
	public void SetLives(){
		for (int i = 0; i<2; i++) {
					Live[i].setText("Your Life = " +lives[i]);
					Live[i].setForeground(LabelColor);
					Live[i].setFont(new Font("Courier", Font.BOLD, 16));
		}
		Live[0].setBounds(w/6 +w/5 - 170, h/4 - 30 , 170 , 30);
		Live[1].setBounds(w - w/6  - w/5, h/4 - 30 , 170 , 30);
		f1.add(Live[0]);
		f1.add(Live[1]);
	}

	public void ComputerPlay(){
		if (lives[0] > 0 && lives[1] > 0) {
			new java.util.Timer().schedule(new java.util.TimerTask(){
										@Override
										public void run(){
											Battle(2);
										}
			},3000);
			new java.util.Timer().schedule(new java.util.TimerTask(){
				@Override
				public void run(){
					int m;
					if (lives[1] < 20 && lives[0] > 20) {
						m = 2;
					}else if (lives[0]<20 && lives[1]> Damages[1][1]*0.3) {
						m = 1;
					}else if (lives[1]< 85){
						m = rand.nextInt(3);
					}else {
						m = rand.nextInt(2);
					}
					MovePressed(1,m);
				}
			},4500);
		}else {
			new java.util.Timer().schedule(new java.util.TimerTask(){
				@Override
				public void run(){
					p3.removeAll();
					p3.revalidate();
					p3.repaint();
					JLabel winnerLabel = new JLabel();
					if (lives[0] > lives[1]) {
						winnerLabel = new JLabel("Player 1 won");
					}else if (lives[0] < lives[1]) {
						winnerLabel = new JLabel("Player 2 won");
					}else {
						winnerLabel = new JLabel("Both players lost");
					}
					winnerLabel.setBounds(w/2-200, h/3, 400 , 30);
					winnerLabel.setForeground(LabelColor);
					winnerLabel.setFont(new Font("Courier", Font.BOLD, 30));
					winnerLabel.setOpaque(false);
					p3.add(winnerLabel);
					p3.setVisible(true);
					f1.add(p3);
					f1.pack();
					f1.setVisible(true);

					new java.util.Timer().schedule(
									new java.util.TimerTask(){
									@Override
									public void run(){
										System.exit(0);
										f1.removeAll();
										f1.setVisible(false);
								}
					},3000);


				}
			},2500);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Heads")){
			heads.setVisible(false);
			heads.setEnabled(false);
			tails.setVisible(false);
			tails.setEnabled(false);
			if (ko==0){
				playingFirst = new JLabel ("HEADS. Player 1 is playing first!");
				first = 1;
			}else{
				playingFirst = new JLabel ("TAILS. Computer is playing first!");
				first = 2;
			}
			ShowHeadsOrTails();
			new java.util.Timer().schedule(
				new java.util.TimerTask(){
				@Override
				public void run(){
				Battle(first);
				if (first==2) {
					ComputerPlay();
				}
				ko=rand.nextInt(2);
				}
			},3000);
		}else if (e.getActionCommand().equals("Tails")){
			heads.setVisible(false);
			heads.setEnabled(false);
			tails.setVisible(false);
			tails.setEnabled(false);
			if (ko==0){
				playingFirst = new JLabel ("HEADS. Player 2 is playing first!");
				first=2;
			}else{
				playingFirst = new JLabel ("TAILS. Computer is playing first!");
				first=1;
			}
			ShowHeadsOrTails();
			new java.util.Timer().schedule(new java.util.TimerTask(){
				@Override
				public void run(){
					Battle(first);
					if (first==2) {
						ComputerPlay();
					}
					ko=rand.nextInt(2);																	}
				},3000);
		}else if (e.getActionCommand().equals(Moves[0][0])){
				for (int j=0; j < 3; j++){
					PlayerButtons[0][j].setEnabled(false);
				}
				MovePressed(0,0);
				ComputerPlay();
		}else if (e.getActionCommand().equals(Moves[0][1])){
				for (int j=0; j < 3; j++){
					PlayerButtons[0][j].setEnabled(false);
				}
				MovePressed(0,1);
				ComputerPlay();
		}else if (e.getActionCommand().equals(Moves[0][2])){
				MovePressed(0,2);
				for (int j=0; j < 3; j++){
					PlayerButtons[0][j].setEnabled(false);
				}
				ComputerPlay();
		}
	}
}