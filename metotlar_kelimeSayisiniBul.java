import java.util.Scanner;

public class metotlar_kelimeSayisiniBul {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        String girdiCumle;
        girdiCumle = girdi.nextLine();
        kelimeSayisiniBul(girdiCumle);
        girdi.close();
    }

    public static void kelimeSayisiniBul(String cumle) {
        int kelimeSayisi = 0;
        String[] kelimeDizi = cumle.split(" ");
        kelimeSayisi = kelimeDizi.length;

        System.out.println("Bulunan kelime sayisi: " + kelimeSayisi);
    }
}