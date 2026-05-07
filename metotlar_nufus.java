import java.util.Scanner;

public class metotlar_nufus {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi1, sayi2;
        int islem;
        System.out.print("baslangic nufus girin: ");
        sayi1 = girdi.nextInt();
        System.out.print("artis orani girin: ");
        sayi2 = girdi.nextInt();
        System.out.print("yil girin: ");
        islem = girdi.nextInt();
        System.out.println(nufus_V2(sayi1, sayi2, islem));
        girdi.close();
    }

    public static double nufus_V1(double baslangicNufus, double artisOrani, int yil) {

        for (int i = 0; i < yil; i++) {
            baslangicNufus = baslangicNufus + (baslangicNufus * artisOrani / 100.0);
        }

        return baslangicNufus;
    }

    public static double nufus_V2(double baslangicNufus, double artisOrani, int yil) {
        if (yil == 0) {
            return baslangicNufus;
        }

        baslangicNufus = baslangicNufus + (baslangicNufus * artisOrani / 100.0);

        return nufus_V2(baslangicNufus, artisOrani, yil - 1);
    }
}
