import java.util.Scanner;

public class NotOrtalamasiHesapla {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        double vize, nfinal, sonuc;

        System.out.print("vize gir: ");
        vize = girdi.nextDouble();
        System.out.print("vize gir: ");
        nfinal = girdi.nextDouble();

        sonuc = vize * 0.40 + nfinal * 0.60;

        System.out.println("ortalama: " + sonuc);
        if (sonuc > 70) {
            System.out.println("BASARILI");
        } else {
            System.out.println("BASARISIZ");

        }
        girdi.close();
    }
}
