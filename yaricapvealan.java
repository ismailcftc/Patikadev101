import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner yaricap = new Scanner(System.in);
        double r, aci;
        System.out.print("Dairenin yarıçapını giriniz= ");
        r = yaricap.nextInt();
        System.out.print("Dairenin açısını giriniz= ");
        aci = yaricap.nextInt();
        double alan = (3.14*r*r)*(aci/360);
        System.out.print("Dairenin Alanı = " + alan);

    }
}
