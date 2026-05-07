import java.util.Scanner;

public class KdvMiktariHesapla {

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        char urunGami;
        int urunFiyat;
        System.out.println("sirayla ürün gami ve ürün fiyatini giriniiz: ");
        urunGami = girdi.next().charAt(0);
        urunFiyat = girdi.nextInt();
        if (urunGami == 'M') {
            // %1 kdv
        } else if (urunGami == 'Y') {
            // %10kdv
        } else { // D
            // %20kdv var
        }
        System.out.println(urunFiyat);
        girdi.close();

    }
}