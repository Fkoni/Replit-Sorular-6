package _00Replit;

import java.util.Scanner;

public class _00ReplitOdevlerim2 {

	public static void main(String[] args) {
		// Kullanıcıdan bir Float değer girmesini isteyin, 
		//bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.

			
		
	@SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
	System.out.println("Bir dakika giriniz");
	int dakika=scan.nextInt();
	
	
	System.out.println(dakika + " dakika yaklasik " + ((dakika/1440)/365)+" yil "+((dakika/1440)%365)+" gündür ");	   
	   	  
  	
	}
	
	}


