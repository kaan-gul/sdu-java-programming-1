import java.util.Scanner;

public class EkDersUcretiHesapla {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int saat;
        double maas;

        System.out.print("Saat gir:");
        saat = girdi.nextInt();

        if (saat < 10) {
            maas = saat * 10;
            System.out.println("Ek maas: " + maas);
        } else if (saat > 10 && saat < 20) {
            maas = saat * 12.5;
            System.out.println("Ek maas: " + maas);
        } else if (saat > 20) {
            maas = saat * 13;
            System.out.println("Ek maas: " + maas);
        }
        girdi.close();
    }
}
