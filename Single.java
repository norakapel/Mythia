public class Single {

	int Points1;
	String [] Questions1_1 = new String [10];
	String [] Rights1_1 = new String [10];
	String [] Wrongs1_1 = new String [10];

	public Single(int k) {

		if(k == 1) {
			Adis player1 = new Adis();
			Questions1_1 =player1.getQ1Stage1();
			Rights1_1 =player1.getR1Stage1();
			Wrongs1_1 = player1.getW1Stage1();
		} else if(k == 2) {
			Athina player1 = new Athina ();
			Questions1_1 =player1.getQ1Stage1();
			Rights1_1 =player1.getR1Stage1();
			Wrongs1_1 = player1.getW1Stage1();
		} else if(k == 3) {
			Dias player1 = new Dias();
			Questions1_1 =player1.getQ1Stage1();
			Rights1_1 =player1.getR1Stage1();
			Wrongs1_1 = player1.getW1Stage1();
		} else if(k == 4) {
			Eleni player1 = new Eleni();
			Questions1_1 =player1.getQ1Stage1();
			Rights1_1 =player1.getR1Stage1();
			Wrongs1_1 = player1.getW1Stage1();
		} else if(k == 5) {
			Hra player1 = new Hra();
			Questions1_1 =player1.getQ1Stage1();
			Rights1_1 =player1.getR1Stage1();
			Wrongs1_1 = player1.getW1Stage1();
		} else if(k == 6) {
			Hraklis player1 = new Hraklis();
			Questions1_1 =player1.getQ1Stage1();
			Rights1_1 =player1.getR1Stage1();
			Wrongs1_1 = player1.getW1Stage1();
		} else if(k == 7) {
			Odiseas player1 = new Odiseas();
			Questions1_1 =player1.getQ1Stage1();
			Rights1_1 =player1.getR1Stage1();
			Wrongs1_1 = player1.getW1Stage1();
		} else if(k == 8) {
			Persefoni player1 = new Persefoni();
			Questions1_1 =player1.getQ1Stage1();
			Rights1_1 =player1.getR1Stage1();
			Wrongs1_1 = player1.getW1Stage1();
		} else if(k == 9) {
			Poseidwnas player1 = new Poseidwnas();
			Questions1_1 =player1.getQ1Stage1();
			Rights1_1 =player1.getR1Stage1();
			Wrongs1_1 = player1.getW1Stage1();
		} else if(k == 10) {
			Thiseas player1 = new Thiseas();
			Questions1_1 =player1.getQ1Stage1();
			Rights1_1 =player1.getR1Stage1();
			Wrongs1_1 = player1.getW1Stage1();
		}
	}
}
