import java.util.Random;
import java.util.Scanner;

public class SingleStage1 {

	int m;

	public SingleStage1(int k) {

		m=k;

	}

	public void stageOneSingle() {

		Single characters = new Single(m);
		int a1;
		Scanner i = new Scanner(System.in);
		Random rand = new Random();
		int [] Previous1 = new int [5];
		int p1 = 0;
		int nxt;
		for (int o =0;o<5;o++) {
			boolean t = false;
			do {
				nxt = rand.nextInt(10);
				for (int z=0;z<5;z++) {
					if (nxt != Previous1[z]) {
						t = true;
					}
				}
			}while(t == false);
			Previous1[p1]= nxt;
			p1++;
			System.out.println(characters.Questions1_1[nxt]);
			System.out.println("1." + characters.Rights1_1[nxt]);
			System.out.println("2." + characters.Wrongs1_1[nxt]);
			a1=i.nextInt();
			if(a1 == 1) {
				characters.Points1 = characters.Points1+10;
			}
			System.out.println("YOUR POINTS SO FAR:" + characters.Points1);

		}
	}
}




