import java.util.Scanner;

public class metotlar_asalSayimi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi;
        System.out.print("Asal mi sayisi girin: ");
        sayi = girdi.nextInt();
        System.out.println(AsalSayimi(sayi));

        girdi.close();
    }

    public static boolean AsalSayimi(int KontrolEdilecekSayi) {
        if (KontrolEdilecekSayi == 2) {
            return true;
        } else if (KontrolEdilecekSayi <= 1) {
            return false;
        } else {
            for (int i = 2; i <= (KontrolEdilecekSayi + 1) / 2; i++) {
                if (KontrolEdilecekSayi % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }
}
