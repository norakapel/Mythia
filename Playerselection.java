import java.util.Scanner;

public class Playerselection {

	public int cplayer() {
		
		Scanner i = new Scanner(System.in);
		System.out.println("Who is your player?");
		System.out.println("1.Eleni");
		System.out.println("2.Hraklis");
		System.out.println("3.Odiseas");
		System.out.println("4.Persefoni");
		System.out.println("5.Thiseas");
		System.out.println("6.Adis");
		System.out.println("7.Athina");
		System.out.println("8.Dias");
		System.out.println("9.Poseidwnas");
		System.out.println("10.Hra");
		System.out.println("CHOOSE");
		return i.nextInt();
		
	}
	
}
