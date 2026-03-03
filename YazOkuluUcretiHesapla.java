import java.util.Scanner;

public class YazOkuluUcretiHesapla {

    public static void main(String[] args) {
        Scanner girdiAl = new Scanner(System.in);

        String fakulteBilgisi, hangiDers;
        int saatBasiDersUcreti, dersSaati;

        System.out.print("Fakulte bilgisi giriniz: ");
        fakulteBilgisi = girdiAl.nextLine(); // TF MF EF
        if (fakulteBilgisi.equals("TF")) {
            saatBasiDersUcreti = 20;
        } else if (fakulteBilgisi.equals("MF")) {
            saatBasiDersUcreti = 22;
        } else if (fakulteBilgisi.equals("EF")) {
            saatBasiDersUcreti = 19;
        } else {
            saatBasiDersUcreti = 1;
        }

        System.out.print("Hangi ders giriniz: ");
        hangiDers = girdiAl.nextLine(); // FİZ1 FİZ2 KLK1 KLK2
        System.out.println(hangiDers);
        System.out.println(fakulteBilgisi);
        // System.out.println(hangiDers.toString() == "FIZ1" || hangiDers.toString() ==
        // "FIZ2");
        // equals kullanmali imişim

        if (hangiDers.equals("FİZ1") || hangiDers.equals("FİZ2")) {
            dersSaati = 3;
        } else if (hangiDers.equals("KLK1") || hangiDers.equals("KLK2")) {
            dersSaati = 4;
        } else {
            dersSaati = 1;
        }
        System.out.println("odenmesi gereken ucret: " + (saatBasiDersUcreti * dersSaati));
        girdiAl.close();
    }
}