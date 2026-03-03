import java.util.Scanner;

public class BasariPuaniHesapla {

    public static void main(String[] args) {
        int kSinav1, kSinav2, kSinav3, vize1, vize2, finalS;
        double kOrt, vOrt, sonuc;

        Scanner veriAl = new Scanner(System.in);

        System.out.print("1. kisa sinavi giriniz: ");
        kSinav1 = veriAl.nextInt();
        System.out.print("2. kisa sinavi giriniz: ");
        kSinav2 = veriAl.nextInt();
        System.out.print("3. kisa sinavi giriniz: ");
        kSinav3 = veriAl.nextInt();
        System.out.print("1. vize sinavi giriniz: ");
        vize1 = veriAl.nextInt();
        System.out.print("2. vize sinavi giriniz: ");
        vize2 = veriAl.nextInt();
        System.out.print("final sinavi giriniz: ");
        finalS = veriAl.nextInt();

        kOrt = (kSinav1 + kSinav2 + kSinav3) / 3;
        vOrt = (vize1 + vize2) / 2;

        sonuc = (kOrt * 50 / 100 + vOrt * 50 / 100) * 40 / 100 + finalS * 60 / 100;
        System.out.println("Basari notu: " + sonuc);

        veriAl.close();

    }
}