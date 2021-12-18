import java.util.Random;
import java.util.Scanner;

public class MultiStage1 {

    int m;
    int n;
    
	public MultiStage1(int k, int l) {
	
		m=k;
		n=l;
		
	}

	public void stageOneMulti() {
		
		Multi characters =new Multi(m,n);
		int a1;
		int a2;
		Scanner i = new Scanner(System.in);
		Random rand = new Random();
		int [] Previous1 = new int [5];
		int [] Previous2 = new int [5];
		int p1 = 0;
		int p2 =0;
		int nxt;
		for (int o=0;o<5;o++) {
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
			boolean b = false;
			do {
				nxt = rand.nextInt(10);
				for (int w=0;w<5;w++) {
					if (nxt != Previous1[w]) {
						b = true;
					}
				}
			}while(b == false);
			Previous2[p2]= nxt;
			p2++;
			System.out.println(characters.Questions1_2[nxt]);
			System.out.println("1." + characters.Rights1_2[nxt]);
			System.out.println("2." + characters.Wrongs1_2[nxt]);
			a2=i.nextInt();
			if(a2 == 1) {
				characters.Points2 = characters.Points2+10;
			}
			System.out.println("YOUR POINTS SO FAR:" + characters.Points2);
		}
		
	}

}
