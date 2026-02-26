import java.util.Scanner;

public class EsdegerDirencHesapla {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        double d1, d2, sonuc;
        char secim;

        System.out.print("Direnç değeri gir:");
        d1 = girdi.nextDouble();
        System.out.print("Direnç değeri gir:");
        d2 = girdi.nextDouble();
        System.out.print("Paralel için P, seri için S girin: ");
        secim = girdi.next().charAt(0);

        if (secim == 'P') {
            sonuc = (d1 * d2) / (d1 + d2);
            System.out.print("Paralel için eş değer: " + sonuc);
        } else {
            sonuc = d1 + d2;
            System.out.print("Seri için eş değer: " + sonuc);

        }
        girdi.close();
    }
}
