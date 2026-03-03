import java.util.Scanner;

public class TekSayiKontrolu {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int sayi1;

        System.out.print("Sayi gir:");
        sayi1 = girdi.nextInt();

        if (sayi1 % 2 == 0) {
            System.out.println("tek değil");
        } else {
            System.out.println("tek");
        }
        girdi.close();
    }
}
