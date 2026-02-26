import java.util.Scanner;

public class TamBolunmeKontrolu {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int sayi1, sayi2;

        System.out.print("A Sayi gir:");
        sayi1 = girdi.nextInt();
        System.out.print("B Sayi gir:");
        sayi2 = girdi.nextInt();

        if (sayi1 % sayi2 == 0) {
            System.out.println("A Bye tam bölünür");
        } else {
            System.out.println("A Bye tam bölünmez");
        }
        girdi.close();
    }
}
