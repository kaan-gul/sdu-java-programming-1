import java.util.Scanner;

public class PozitifNegatifSifir {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi;

        System.out.print("Sayı girin: ");
        sayi = girdi.nextInt();

        if (sayi >= 0) {
            System.out.println("Sayi pozitif");
        }
        if (sayi == 0) {
            System.out.println("Sayi sıfıra eşit");
        }
        if (sayi <= 0) {
            System.out.println("Sayi negatif");
        }
        girdi.close();
    }
}
