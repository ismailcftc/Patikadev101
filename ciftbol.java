package çiftSayılar;

import java.util.Scanner;

public class çiftSayilar {

	public static void main(String[] args) {
		// çift sayılar
		
	int girilenSayi, i=0, sayac=0, topla=0, ortalama;

    Scanner sc=new Scanner(System.in);
    System.out.println("Bir sayı Giriniz");
    girilenSayi=sc.nextInt();

    while (i<=girilenSayi){
            if (i%3==0 && i%4==0 ){
                topla+=i;
                sayac++;
            }
        i++;
    }
    ortalama=topla/sayac;
    System.out.println("3'e ve 4'e Tam Bölünen Sayiların Ortalaması: " +ortalama);
	
	}

}
