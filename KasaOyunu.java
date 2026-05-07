import java.util.Random;
import java.util.Scanner;

public class KasaOyunu {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        Random rnd = new Random();

        int kasa, tut;
        kasa = 1 + rnd.nextInt(9);
        System.out.println("Kasa degeri: " + kasa);

        System.out.println("Kac sefer daha sayi tutayım: ");
        tut = giris.nextInt();

        for (int i = 0; i < tut; i++) {
            kasa += 1 + rnd.nextInt(10);
            System.out.println(kasa);
        }
        if (35 < kasa && kasa < 40) {
            System.out.println("Tebrikler kazandiniz");
        } else {
            System.out.println("Elendin");
        }
        giris.close();
    }

}
