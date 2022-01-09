import java.util.Scanner;
import java.util.Random;

public class Mythia {
   public static void main (String [] args){
	   Random rand = new Random();
	   Scanner sc = new Scanner(System.in);
	   int k, l; //NA PAROUME TIS TIMES APO CHOOSE CHARACTER
	   Heroes h = new Heroes(k, l);
	   /*System.out.println("CHOOSE FIGHTER");
	   System.out.println("1.HRAKLIS\n2.THISEAS");
	   int p1, p2;
	   int c =0;
	   do {
		   if (c!=0){
			   System.out.println("CHOOSE CORRECT FIGHTER");
		   }
		   p1 = sc.nextInt();
		   c=c+1;
		   if ((p1 == 1 || p1==2)){
			   break;
		   }
	   } while((p1!=1 && p1!=2));
	   do {
		   p2 = rand.nextInt(2) + 1;
	   } while (p2 == p1);
	   System.out.println("GIVE POINTS");
	   int pont1 = sc.nextInt();
	   int pont2 = sc.nextInt();*/
	   if (pont1 == pont2) {
		   int x, y;
		   do {
			   System.out.println("EQUAL POINTS, PLAYER 1 CHOOSE: HEADS(1) OR TAILS(2)?"); //KOUMPI
			   x = sc.nextInt();
		   } while (x > 2 || x < 1);
		   y = rand.nextInt(2);
		   if (x == y + 1) {
			   pont1++;
		   } else {
			   pont2++;
		   }
	   }
	   int r;
	   double Z1= 100;
	   double Z2= 100;
	   int DH1= h.m1;
	   int DH2= h.m2;
	   int RH3= h.m3;
	   int DT1= h.k1;
	   int DT2= h.k2;
	   int RT3= h.k3;
	   String M1 = h.M1, M2 = h.M2, M3 = h.M3;
	   String K1 = h.K1, K2 = h.K2, K3 = h.K3;
	   int move1 = 0;
	   int move2 = 0;
	   while (Z1 > 0 && Z2 > 0){
		   System.out.printf("Player 1 Health: %d\n", Z1);
		   System.out.printf("Player 2 Health: %d\n", Z2);
		   if (pont1 > pont2){
			   do{
				   System.out.print("Player 1 Choose your move:\n"); //
				   System.out.printf("Press 1 for klotsa(damage = %d)\n", DH1);
				   System.out.printf("Press 2 for mpounia(damage = %d)\n", DH2);
				   System.out.print("Press 3 for Special Attack\n");
				   move1 = sc.nextInt();
			   }while(move1 > 3 || move1 < 1);
			   do{
				   //System.out.print("Player 2 Choose your move:\n");
				   //System.out.printf("Press 1 for klotsa(damage = %d)\n", DT1);
				   //System.out.printf("Press 2 for mpounia(damage = %d)\n", DT2);
				   //System.out.print("Press 3 for Special Attack\n");
				   //move2 = sc.nextInt();
				   move2 = rand.nextInt(3) + 1;
			   }while(move2 > 3 || move2 < 1);
			   if (move1 == 1){
				   Z2 = Z2-DH1;
			   }else if (move1 == 2) {
				   Z2 = Z2-DH2;
				   Z1 = Z1 - (DH2 * 0.3);
			   }else{
				   r = rand.nextInt(3);
				   if (r != 1) {
					   if (Z1 <= 0) {
						   break;
					   }else if (Z1 < 100 - RH3) {
						   Z1 = Z1 + RH3;
					   } else {
						   Z1 = 100;
					   }
				   }
			   }
			   if (move2 == 1){
				   Z1 = Z1-DT1;
			   }else if (move2 == 2) {
				   Z1 = Z1-DT2;
				   Z2 = Z2 - (DT2 * 0.3);
			   }else{
				   r = rand.nextInt(3);
				   if (r != 1) {
					   if (Z2 <= 0) {
						   break;
					   }else if (Z2 < 100 - RT3) {
						   Z2 = Z2 + RT3;
					   } else {
						   Z2 = 100;
					   }
				   }
			   }
		   }else{
			   do{
				   System.out.print("Player 2 Choose your move:\n");
				   System.out.printf("Press 1 for klotsa(damage = %d)\n", DT1);
				   System.out.printf("Press 2 for mpounia(damage = %d)\n", DT2);
				   System.out.print("Press 3 for Special Attack\n");
				   move2 = sc.nextInt();
			   }while(move2 > 3 || move2 < 1);
			   do{
				   System.out.print("Player 1 Choose your move:\n");
				   System.out.printf("Press 1 for klotsa(damage = %d)\n", DH1);
				   System.out.printf("Press 2 for mpounia(damage = %d)\n", DH2);
				   System.out.print("Press 3 for Special Attack\n");
				   move1 = sc.nextInt();
			   }while(move1 > 3 || move1 < 1);
			   if (move2 == 1){
				   Z1 = Z1-DT1;
			   }else if (move2 == 2) {
				   Z1 = Z1-DT2;
				   Z2 = Z2 - (DT2 * 0.3);
			   }else{
				   r = rand.nextInt(3);
				   if (r != 1) {
					   if (Z2 <= 0) {
						   break;
					   }else if (Z2 < 100 - RT3) {
						   Z2 = Z2 + RT3;
					   } else {
						   Z2 = 100;
					   }
				   }
			   }
			   if (move1 == 1){
				   Z2 = Z2-DH1;
			   }else if (move1 == 2) {
				   Z2 = Z2-DH2;
				   Z1 = Z1 - (DH2 * 0.3);
			   }else{
				   r = rand.nextInt(3);
				   if (r != 1) {
					   if (Z1 <= 0) {
						   break;
					   }else if (Z1 < 100 - RH3) {
						   Z1 = Z1 + RH3;
					   } else {
						   Z1 = 100;
					   }
				   }
			   }	    
		   }
	   if (Z1<= 0 && Z2<= 0) {
		   if (pont1 > pont2) {
			   System.out.print("GAME OVER\nPlayer 1 wins!!!");
		   } else {
			   System.out.print("GAME OVER\nPlayer 2 wins!!!");
		   }
	   } else if (Z1 <= 0) {
		   System.out.print("GAME OVER\nPlayer 2 wins!!!");
	   } else if (Z2 <= 0) {
		   System.out.print("GAME OVER\nPlayer 1 wins!!!");
	   }
   }
   }
}


	