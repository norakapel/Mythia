
import java.util.Scanner;

public class Mythia {

	public static void main(String[] args) {
		
		Playerselection sel = new Playerselection();
		Info three = new Info();
		Leaderboard two = new Leaderboard();
		Single one1 = new Single();
		Scanner n = new Scanner(System.in);
		int k;
		do {
			System.out.println("1. New game");
			System.out.println("2. Leaderboard");
			System.out.println("3. Info");
			System.out.println("4. Exit");
			System.out.println("Whats your option?");
			k = n.nextInt();
			if(k == 1) {
				
				int l ;
				System.out.println("1. Singleplayer");
				System.out.println("2. Multiplayer");
				System.out.println("Whats your option?");
				l = n.nextInt();
				if(l == 1) {
					
					int p1 =sel.cplayer();
					one1.soloPlay(p1);
					
				}else {
					
					int p1 =sel.cplayer();
					int p2 =sel.cplayer();
					MultiStage1 one2 = new MultiStage1(p1, p2);
					one2.stageOneMulti();
					
				}
			}else if(k == 2) {
				
				two.printNames();
				
			}else if (k ==3) {
				
				three.showInfo();
				
			}
		}while(k != 4);
		
	}

}
