import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // VARIABLES
        double totalPrice;
        int pearKG, appleKG, tomatoKG, bananaKG, aubergieKG;
        double pearPrice = 2.14, applePrice = 3.67, tomatoPrice = 1.11, bananaPrice = 0.95, auberginePrice = 5.00;

        // SCANNER
        Scanner sc = new Scanner(System.in);

        // USER'S VALUES
        System.out.print("Armut Kaç Kilo: ");
        pearKG = sc.nextInt();

        System.out.print("Elma Kaç Kilo: ");
        appleKG = sc.nextInt();

        System.out.print("Domates Kaç Kilo: ");
        tomatoKG = sc.nextInt();

        System.out.print("Muz Kaç Kilo: ");
        bananaKG = sc.nextInt();

        System.out.print("Patlıcan Kaç Kilo: ");
        aubergieKG = sc.nextInt();

        // TOTAL PRICE
        totalPrice = (pearKG * pearPrice) + (appleKG * applePrice) +(tomatoKG * tomatoPrice) + (bananaKG * bananaPrice) + (aubergieKG * auberginePrice);

        // PRINT
        System.out.println("Toplam Tutar: " + totalPrice);

    }
}
