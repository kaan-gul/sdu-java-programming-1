import java.util.Scanner;

public class KursKabulKontrolu {

    public static void main(String[] args) {
        int matNotu, fizNotu, kimNotu, toplam;
        Scanner girdi = new Scanner(System.in);

        System.out.println("Sirayla mat,fiz,kim notlarinizi giriniz: ");
        matNotu = girdi.nextInt();
        fizNotu = girdi.nextInt();
        kimNotu = girdi.nextInt();
        toplam = matNotu + fizNotu + kimNotu;
        if (matNotu >= 65 && fizNotu >= 55 && kimNotu >= 50) {
            if (toplam >= 190 || (matNotu + fizNotu) >= 140) {
                System.out.println("Kabul edildiniz.");
            } else {
                System.out.println("Kabul edilmediniz.");
            }
        } else {
            System.out.println("Kabul edilmediniz.");
        }
        girdi.close();
    }
}