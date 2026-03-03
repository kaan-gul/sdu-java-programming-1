
import java.util.Scanner;

public class IdealKiloHesapla {

    public static void main(String[] args) {
        Scanner girdiAl = new Scanner(System.in);
        int boy, kilo, yas;
        char cinsiyet;
        double idealKilo, Ksabiti;

        System.out.print("Boyunuzu giriniz: ");
        boy = girdiAl.nextInt();
        System.out.print("Yasinizi giriniz: ");
        yas = girdiAl.nextInt();
        System.out.print("Cinsiyetinizi giriniz: ");
        cinsiyet = girdiAl.next().charAt(0);
        System.out.print("Kilonuzu giriniz: ");
        kilo = girdiAl.nextInt();

        if (cinsiyet == 'K') {
            Ksabiti = 0.8;
        } else {
            Ksabiti = 0.9;
        }

        idealKilo = (boy - 100 + yas / 10) * Ksabiti;

        System.out.println("ideal kilonuz: " + idealKilo);
        if (idealKilo >= kilo) {
            System.out.println((idealKilo - kilo) + " kilo almalisiniz.");
        } else if (idealKilo <= kilo) {
            System.out.println((kilo - idealKilo) + " kilo vermelisiniz.");

        } else if (idealKilo == kilo) {
            System.out.println("İdeal kilonuzdasiniz.");

        } else {
            System.out.println("hatali durum");
        }
        girdiAl.close();

    }
}