import java.util.Scanner;

public class TekMiCiftMi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int sayi1;

        System.out.print("Sayi gir:");
        sayi1 = girdi.nextInt();

        if (sayi1 % 2 == 0) {
            System.out.println("çift");
        } else {
            System.out.println("tek");
        }
        girdi.close();
    }

}
