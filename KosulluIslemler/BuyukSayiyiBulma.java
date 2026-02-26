import java.util.Scanner;

public class BuyukSayiyiBulma {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int sayi1, sayi2;

        System.out.print("Sayi gir:");
        sayi1 = girdi.nextInt();
        System.out.print("Sayi gir:");
        sayi2 = girdi.nextInt();

        if (sayi1 > sayi2) {
            System.out.println("büyük sayi: " + sayi1);
        } else {
            System.out.println("büyük sayi: " + sayi2);
        }
        girdi.close();

    }
}
