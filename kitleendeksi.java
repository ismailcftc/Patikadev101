import java.util.Scanner;

public class vucutendeksi {
    public static void main(String[] args){

        //Kullanıcıdan boy ve kilo alarak vücut kitle endeksi hesaplama

        double boy, kilo, indeks;
        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu giriniz : ");
        kilo = input.nextDouble();

        indeks = kilo / (boy * boy);
        System.out.print("Vücut kitle indeksiniz : " + indeks);
    }

}
