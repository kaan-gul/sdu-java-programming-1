import java.util.Scanner;

public class metotlar_hesaplamaIslemiYap {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi1, sayi2;
        char islem;
        System.out.print("sayi1 girin: ");
        sayi1 = girdi.nextInt();
        System.out.print("sayyi2 girin: ");
        sayi2 = girdi.nextInt();
        System.out.print("islem girin: ");
        islem = girdi.next().charAt(0);
        System.out.println(hesaplamaIslemiYap(sayi1, sayi2, islem));
        girdi.close();
    }

    public static double hesaplamaIslemiYap(double sayi1, double sayi2, char islem) {
        double sonuc = 0;
        if (islem == '+') {
            sonuc = sayi1 + sayi2;
        } else if (islem == '-') {
            sonuc = sayi1 - sayi2;
        } else if (islem == '*') {
            sonuc = sayi1 * sayi2;
        } else {
            sonuc = sayi1 / sayi2;
        }
        return sonuc;
    }
}
