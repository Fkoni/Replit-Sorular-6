package _00Replit;

import java.util.Scanner;

public class _00ReplitOdevlerim {

	public static void main(String[] args) {
		// Kullanıcıdan bir Float değer girmesini isteyin, 
		//bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.

		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Dikdörtgenin bir kenarını giriniz");
		int kenar1=scan.nextInt();
		System.out.println("Dikdörtgenin diger kenarını giriniz");
		int kenar2=scan.nextInt();
		   
	   	  
    System.out.println("Alan: "+(kenar1*kenar2));
		
    System.out.println("Cevre: "+2*(kenar1+kenar2));
		
	}
	
	}


