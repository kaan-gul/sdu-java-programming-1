
import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int sayi1, sayi2;
        double sonuc;
        char islem;

        System.out.print("A Sayi gir:");
        sayi1 = girdi.nextInt();
        System.out.print("B Sayi gir:");
        sayi2 = girdi.nextInt();

        System.out.println("Matematiksel islem Sec(operatoru yaziniz): ");
        islem = girdi.next().charAt(0);

        if (islem == '+') {
            sonuc = sayi1 + sayi2;

        } else if (islem == '-') {
            sonuc = sayi1 - sayi2;

        } else if (islem == '/') {
            sonuc = sayi1 / sayi2;

        } else if (islem == '*') {
            sonuc = sayi1 * sayi2;

        } else {
            System.out.println("Gecersiz islem");
            sonuc = 0;
        }
        System.out.println("Cevap: " + sonuc); // başlangıç değeri atanmamış olursa hata verir bu sebeple deafult değer
                                               // olmalı
        // iflere girmezse null kalabilir

        girdi.close();
    }
}
