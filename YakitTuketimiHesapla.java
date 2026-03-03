
import java.util.Scanner;

public class YakitTuketimiHesapla {

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        char yazKis;
        int ortHiz, km;
        double sonuc = 1;

        System.out.print("Yaz mı kis mi?  :  ");
        yazKis = girdi.next().charAt(0);
        System.out.print("Gidilecek mesafe km : ");
        km = girdi.nextInt();
        System.out.print("Ort hiz bilgisi: ");
        ortHiz = girdi.nextInt();

        if (ortHiz >= 1 && ortHiz <= 50) {
            sonuc = km * (10 / 100);
        } else if (ortHiz > 50 && ortHiz <= 100) {
            sonuc = km * (7.5 / 100);
        } else if (ortHiz > 100 && ortHiz <= 150) {
            sonuc = km * (9 / 100);
        }

        if (yazKis == 'K') {
            // %5 fazla tüketecek
            sonuc = sonuc + sonuc * ((5.0 / 100));
            // burda double işlem yapmasın için 5 yerine 5.0 yazmam gerekti yoksa işlemi
            // yanlış yapıyor dikkat et!
        }
        System.out.println("Sonuc: " + sonuc);

        girdi.close();
    }
}