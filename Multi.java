import java.util.Random;
import java.util.Scanner;

public class Multi {

	int Points1;
	int Points2;
	String [] Questions1_1 = new String [10];
	String [] Rights1_1 = new String [10];
	String [] Wrongs1_1 = new String [10];
	String [] Questions1_2 = new String [10];
	String [] Rights1_2 = new String [10];
	String [] Wrongs1_2 = new String [10];
	public Multi(int k, int l) {
		
		if(k == 1) {
			Eleni player1 = new Eleni();
			Questions1_1 =player1.getQ1Stage1();
			Rights1_1 =player1.getR1Stage1();
			Wrongs1_1 = player1.getW1Stage1();
		} else if(k == 2) {
			Hraklis player1 = new Hraklis();
			Questions1_1 =player1.getQ1Stage1();
			Rights1_1 =player1.getR1Stage1();
			Wrongs1_1 = player1.getW1Stage1();
		} else if(k == 3) {
			Odiseas player1 = new Odiseas();
			Questions1_1 =player1.getQ1Stage1();
			Rights1_1 =player1.getR1Stage1();
			Wrongs1_1 = player1.getW1Stage1();
		} else if(k == 4) {
			Persefoni player1 = new Persefoni();
			Questions1_1 =player1.getQ1Stage1();
			Rights1_1 =player1.getR1Stage1();
			Wrongs1_1 = player1.getW1Stage1();
		} else if(k == 5) {
			Thiseas player1 = new Thiseas();
			Questions1_1 =player1.getQ1Stage1();
			Rights1_1 =player1.getR1Stage1();
			Wrongs1_1 = player1.getW1Stage1();
		} else if(k == 6) {
			Adis player1 = new Adis();
			Questions1_1 =player1.getQ1Stage1();
			Rights1_1 =player1.getR1Stage1();
			Wrongs1_1 = player1.getW1Stage1();
		} else if(k == 7) {
			Athina player1 = new Athina ();
			Questions1_1 =player1.getQ1Stage1();
			Rights1_1 =player1.getR1Stage1();
			Wrongs1_1 = player1.getW1Stage1();
		} else if(k == 8) { 
			Dias player1 = new Dias();
			Questions1_1 =player1.getQ1Stage1();
			Rights1_1 =player1.getR1Stage1();
			Wrongs1_1 = player1.getW1Stage1();
		} else if(k == 9) {
			Poseidwnas player1 = new Poseidwnas();
			Questions1_1 =player1.getQ1Stage1();
			Rights1_1 =player1.getR1Stage1();
			Wrongs1_1 = player1.getW1Stage1();
		} else if(k == 10) {
			Hra player1 = new Hra();
			Questions1_1 =player1.getQ1Stage1();
			Rights1_1 =player1.getR1Stage1();
			Wrongs1_1 = player1.getW1Stage1();
		}
		
		if(l == 1) {
			Eleni player2 = new Eleni();
			Questions1_2 =player2.getQ1Stage1();
			Rights1_2 =player2.getR1Stage1();
			Wrongs1_2 = player2.getW1Stage1();
		} else if(l == 2) {
			Hraklis player2 = new Hraklis();
			Questions1_2 =player2.getQ1Stage1();
			Rights1_2 =player2.getR1Stage1();
			Wrongs1_2 = player2.getW1Stage1();
		} else if(l == 3) {
			Odiseas player2 = new Odiseas();
			Questions1_2 =player2.getQ1Stage1();
			Rights1_2 =player2.getR1Stage1();
			Wrongs1_2 = player2.getW1Stage1();
		} else if(l == 4) {
			Persefoni player2 = new Persefoni();
			Questions1_2 =player2.getQ1Stage1();
			Rights1_2 =player2.getR1Stage1();
			Wrongs1_2 = player2.getW1Stage1();
		} else if(l == 5) {
			Thiseas player2 = new Thiseas();
			Questions1_2 =player2.getQ1Stage1();
			Rights1_2 =player2.getR1Stage1();
			Wrongs1_2 = player2.getW1Stage1();
		} else if(l == 6) {
			Adis player2 = new Adis();
			Questions1_2 =player2.getQ1Stage1();
			Rights1_2 =player2.getR1Stage1();
			Wrongs1_2 = player2.getW1Stage1();
		} else if(l == 7) {
			Athina player2 = new Athina ();
			Questions1_2 =player2.getQ1Stage1();
			Rights1_2 =player2.getR1Stage1();
			Wrongs1_2 = player2.getW1Stage1();
		} else if(l == 8) { 
			Dias player2 = new Dias();
			Questions1_2 =player2.getQ1Stage1();
			Rights1_2 =player2.getR1Stage1();
			Wrongs1_2 = player2.getW1Stage1();
		} else if(l == 9) {
			Poseidwnas player2 = new Poseidwnas();
			Questions1_2 =player2.getQ1Stage1();
			Rights1_2 =player2.getR1Stage1();
			Wrongs1_2 = player2.getW1Stage1();
		} else if(l == 10) {
			Hra player2 = new Hra();
			Questions1_2 =player2.getQ1Stage1();
			Rights1_2 =player2.getR1Stage1();
			Wrongs1_2 = player2.getW1Stage1();
		}
		
	}

}
