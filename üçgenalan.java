import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a, b, c, u, d;
        System.out.print("a kenarını giriniz: ");
        a = input.nextInt();
        System.out.print("b kenarını giriniz: ");
        b = input.nextInt();
        System.out.print("c kenarını giriniz: ");
        c = input.nextInt();
        u = (a+b+c)/2;
        d = u*(u-a)*(u-b)*(u-c);
        double alan = Math.sqrt(d);
        System.out.print("Üçgenin Alanı= "+ alan);





    }
}
