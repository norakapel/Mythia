import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.*;

public class Thiseas {

	ImageIcon card = new ImageIcon("TheseusCard.png"); //card's image
	String [] Questions1 = new String [10]; //questions of stage1
	String [] Rights1 = new String [10]; //right answers for stage1's questions
	String [] Wrongs1 = new String [10]; //wrong answers for stage1's questions
	String [] Mname = new String [] {"Minotaur Punch", "King Attack", "Maze Escape"}; //array with player's moves for stage3
	int [] Mdamage = new int [] {20, 30, 30}; //array with move's damage for stage3
	String [] Questions2 = new String [5]; //questions of stage2
	String [] Answers = new String [5]; //answers of stage2
	public Thiseas() {

		//takes the questions from a csv file for stage1
		String [] Insert1 = new String [3];
		int j =0;
		String file = "Thiseas.part1.csv";
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

				//inserts values to stage1's array
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

		//takes the questions from a csv file for stage1
		String [] Insert2 = new String [2];
		int j2 =0;
		String file2 = "Thiseas2.csv";
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

				//inserts values to stage2's arrays
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


	//gets questions for stage1
	public String[] getQ1Stage1() {

		return Questions1;

	}

	//gets rights for stage1
	public String[] getR1Stage1() {

		return Rights1;

	}

	//gets wrongs for stage1
	public String[] getW1Stage1() {

		return Wrongs1;

	}
	//gets move's damage for stage3
	public int[] getDamage() {
		return Mdamage.clone();
	}
	//gets moves for stage3
	public String[] getMname() {
		return Mname.clone();
	}
	//gets image for character's card
	public ImageIcon getCard(){
		return card;
	}
	//gets questions for stage2
	public String[] getQuestions2() {
		return Questions2.clone();
	}
	//gets answers for stage2
	public String[] getAnswers() {
		return Answers.clone();
	}
}

