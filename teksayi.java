import java.util.Scanner;

public class dördünKatlari {

	public static void main(String[] args) {
		// Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen 
		//değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

		System.out.println("Bir Sayi Giriniz");
		Scanner scn = new Scanner(System.in);
		int sayi, sonuc = 0 ;
	
		
	while (true) {
		
		sayi =scn.nextInt();
		
		if (sayi %4 == 0 && sayi % 2 == 0) {
			sonuc +=sayi;
		}
		else {
			System.out.println("4 ün katı olan bir sayi girmediniz ");
			break;
		}
	}
		
	System.out.println("4 ün katı olan bir sayi girmediniz ");
	}

}
