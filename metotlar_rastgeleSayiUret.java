import java.util.Random;
import java.util.Scanner;

public class metotlar_rastgeleSayiUret {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int baslangicDegeri, bitisDegeri;
        int adet;
        System.out.print("sayi1 girin: ");
        baslangicDegeri = girdi.nextInt();
        System.out.print("sayyi2 girin: ");
        bitisDegeri = girdi.nextInt();
        System.out.print("islem girin: ");
        adet = girdi.nextInt();
        rastgeleSayiUret(baslangicDegeri, bitisDegeri, adet);
        girdi.close();
    }

    public static void rastgeleSayiUret(int baslangicDegeri, int bitisDegeri, int adet) {
        Random rnd = new Random();

        for (int i = 0; i < adet; i++) {
            int rastgele = baslangicDegeri + rnd.nextInt(bitisDegeri - baslangicDegeri);
            System.out.println(rastgele);
        }

    }
}
