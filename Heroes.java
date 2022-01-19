import javax.swing.*;

public class Heroes {

	//int m1, m2, m3, k1, k2, k3;
	//String M1, M2, M3, K1, K2, K3;
	int[] m1 = new int[3];
	String[] M1 = new String[3];
	int[] k1 = new int[3];
	String K1[] = new String[3];
	String[] a1 = new String[5];
	String [] q1 = new String[5];
	String[] a2 = new String[5];
	String [] q2 = new String[5];
	ImageIcon CharacterCard1 = new ImageIcon();
	ImageIcon CharacterCard2 = new ImageIcon();

	public void makeHeroes(int k, int l) {

		if(k == 1) {
			Adis player1 = new Adis();
			m1 = player1.getDamage();
			M1 = player1.getMname();
			q1 = player1.getQuestions2();
			a1 = player1.getAnswers();
			CharacterCard1 = player1.getCard();
		} else if(k == 2) {
			Athina player1 = new Athina ();
			m1 = player1.getDamage();
			M1 = player1.getMname();
			q1 = player1.getQuestions2();
			a1 = player1.getAnswers();
			CharacterCard1 = player1.getCard();
		} else if(k == 3) {
			Dias player1 = new Dias();
			m1 = player1.getDamage();
			M1 = player1.getMname();
			q1 = player1.getQuestions2();
			a1 = player1.getAnswers();
			CharacterCard1 = player1.getCard();
		} else if(k == 4) {
			Eleni player1 = new Eleni();
			m1 = player1.getDamage();
			M1 = player1.getMname();
			q1 = player1.getQuestions2();
			a1 = player1.getAnswers();
			CharacterCard1 = player1.getCard();
		} else if(k == 5) {
			Hra player1 = new Hra();
			m1 = player1.getDamage();
			M1 = player1.getMname();
			q1 = player1.getQuestions2();
			a1 = player1.getAnswers();
			CharacterCard1 = player1.getCard();
		} else if(k == 6) {
			Hraklis player1 = new Hraklis();
			m1 = player1.getDamage();
			M1 = player1.getMname();
			q1 = player1.getQuestions2();
			a1 = player1.getAnswers();
			CharacterCard1 = player1.getCard();
		} else if(k == 7) {
			Odiseas player1 = new Odiseas();
			m1 = player1.getDamage();
			M1 = player1.getMname();
			q1 = player1.getQuestions2();
			a1 = player1.getAnswers();
			CharacterCard1 = player1.getCard();
		} else if(k == 8) {
			Persefoni player1 = new Persefoni();
			m1 = player1.getDamage();
			M1 = player1.getMname();
			q1 = player1.getQuestions2();
			a1 = player1.getAnswers();
			CharacterCard1 = player1.getCard();
		} else if(k == 9) {
			Poseidwnas player1 = new Poseidwnas();
			m1 = player1.getDamage();
			M1 = player1.getMname();
			q1 = player1.getQuestions2();
			a1 = player1.getAnswers();
			CharacterCard1 = player1.getCard();
		} else if(k == 10) {
			Thiseas player1 = new Thiseas();
			m1 = player1.getDamage();
			M1 = player1.getMname();
			q1 = player1.getQuestions2();
			a1 = player1.getAnswers();
			CharacterCard1 = player1.getCard();
		}

		if(l == 1) {
			Adis player2 = new Adis();
			k1 = player2.getDamage();
			K1 = player2.getMname();
			q2 = player2.getQuestions2();
			a2 = player2.getAnswers();
			CharacterCard2 = player2.getCard();
		} else if(l == 2) {
			Athina player2 = new Athina ();
			k1 = player2.getDamage();
			K1 = player2.getMname();
			q2 = player2.getQuestions2();
			a2 = player2.getAnswers();
			CharacterCard2 = player2.getCard();
		} else if(l == 3) {
			Dias player2 = new Dias();
			k1 = player2.getDamage();
			K1 = player2.getMname();
			q2 = player2.getQuestions2();
			a2 = player2.getAnswers();
			CharacterCard2 = player2.getCard();
		} else if(l == 4) {
			Eleni player2 = new Eleni();
			k1 = player2.getDamage();
			K1 = player2.getMname();
			q2 = player2.getQuestions2();
			a2 = player2.getAnswers();
			CharacterCard2 = player2.getCard();
		} else if(l == 5) {
			Hra player2 = new Hra();
			k1 = player2.getDamage();
			K1 = player2.getMname();
			q2 = player2.getQuestions2();
			a2 = player2.getAnswers();
			CharacterCard2 = player2.getCard();
		} else if(l == 6) {
			Hraklis player2 = new Hraklis();
			k1 = player2.getDamage();
			K1 = player2.getMname();
			q2 = player2.getQuestions2();
			a2 = player2.getAnswers();
			CharacterCard2 = player2.getCard();
		} else if(l == 7) {
			Odiseas player2 = new Odiseas();
			k1 = player2.getDamage();
			K1 = player2.getMname();
			q2 = player2.getQuestions2();
			a2 = player2.getAnswers();
			CharacterCard2 = player2.getCard();
		} else if(l == 8) {
			Persefoni player2 = new Persefoni();
			k1 = player2.getDamage();
			K1 = player2.getMname();
			q2 = player2.getQuestions2();
			a2 = player2.getAnswers();
			CharacterCard2 = player2.getCard();
		} else if(l == 9) {
			Poseidwnas player2 = new Poseidwnas();
			k1 = player2.getDamage();
			K1 = player2.getMname();
			q2 = player2.getQuestions2();
			a2 = player2.getAnswers();
			CharacterCard2 = player2.getCard();
		} else if(l == 10) {
			Thiseas player2 = new Thiseas();
			k1 = player2.getDamage();
			K1 = player2.getMname();
			q2 = player2.getQuestions2();
			a2 = player2.getAnswers();
			CharacterCard2 = player2.getCard();
		}
	}
	public String[] getq1() {
		return q1.clone();
	}
	public String[] geta1() {
		return a1.clone();
	}
	public String[] getq2() {
		return q2.clone();
	}
	public String[] geta2() {
		return a2.clone();
	}
	public int[] getm1() {
		return m1.clone();
	}
	public String[] getM1() {
		return M1.clone();
	}
	public int[] getk1() {
		return k1.clone();
	}
	public String[] getK1() {
		return K1.clone();
	}

}
