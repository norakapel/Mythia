
import java.util.Scanner;

public class Mythia {

	public static void main(String[] args) {
		
		Info three = new Info();
		Leaderboard two = new Leaderboard();
		Single one1 = new Single();
		Multi one2 = new Multi();
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
					
					one1.soloPlay();
					
				}else {
					
					one2.doublePlay();
					
				}
			}else if(k == 2) {
				
				two.printNames();
				
			}else if (k ==3) {
				
				three.showInfo();
				
			}
		}while(k != 4);
		
	}

}
