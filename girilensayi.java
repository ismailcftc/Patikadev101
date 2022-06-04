import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int a = input.nextInt();
        int d=4, b=5;
        for (int i = 1; i<=a; i++) {
            if (i == d){
                System.out.println("4' ün kuvvetleri= " + d);
                d*=4;

            }
            if (i==b) {
                System.out.println("5' in kuvvetleri= " + b);
                b*=5;


            }

        }

    }
}
