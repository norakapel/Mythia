import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.*;

public class Odiseas {

	ImageIcon card = new ImageIcon("OdysseusCard.png");
	String [] Questions1 = new String [10];
	String [] Rights1 = new String [10];
	String [] Wrongs1 = new String [10];
	String [] Mname = new String [] {"Polyphemus Punch", "Cyclops Tornado", "The Return"};
<<<<<<< HEAD
	int [] Mdamage = new int [] {20, 30, 30};
	String [] Questions2 = new String [5];
	String [] Answers = new String [5];
=======
	int [] Mdamage = new int [] { 20, 30, 30};
>>>>>>> c0b1035c7fcc3e467089b5a06529d35bc0750e03
	public Odiseas() {

		String [] Insert1 = new String [3];
		int j =0;
		String file = "Odisseas.part1.csv";
		BufferedReader reader = null;
		String line = "";
		try {
			reader = new BufferedReader(new FileReader(file));
			while ((line = reader.readLine()) != null) {

				int k =0;
				String[] row = line.split(";");
				for (String index : row ) {

					Insert1[k] =index ;
					k++;
				}

				Questions1[j] = Insert1[0];
				Rights1[j] = Insert1[1];
				Wrongs1[j] = Insert1[2];
				j++;
			}
		}catch(Exception e){

			e.printStackTrace();

		}finally {
			try {
				reader.close();
			}catch(Exception e) {
				e.printStackTrace();
			}

		}

		String [] Insert2 = new String [2];
		int j2 =0;
		String file2 = "Odisseas2.csv";
		BufferedReader reader2 = null;
		String line2 = "";
		try {
			reader2 = new BufferedReader(new FileReader(file2));
			while ((line2 = reader2.readLine()) != null) {

				int k2 =0;
				String[] row2 = line2.split(";");
				for (String index2 : row2 ) {

					Insert2[k2] =index2 ;
					k2++;
				}

				Questions2[j2] = Insert2[0];
				Answers[j2] = Insert2[1];
				j2++;
			}
		}catch(Exception e){

			e.printStackTrace();

		}finally {
			try {
				reader2.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

	public String[] getQ1Stage1() {
		return Questions1;
	}

	public String[] getR1Stage1() {
		return Rights1;
	}

	public String[] getW1Stage1() {
		return Wrongs1;
	}

	public int[] getDamage() {
		return Mdamage;
	}

	public String[] getMname() {
		return Mname;
	}

	public ImageIcon getCard(){
		return card;
	}
	public int[] getDamage() {
		return Mdamage.clone();
	}
	public String[] getMname() {
		return Mname.clone();
	}
	public ImageIcon getCard(){
		return card;
	}
	public String[] getQuestions2() {
		return Questions2.clone();
	}
	public String[] getAnswers() {
		return Answers.clone();
	}
}

