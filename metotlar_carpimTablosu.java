import java.util.ArrayList;
import java.util.Scanner;

public class metotlar_carpimTablosu {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int carpan, adim;
        System.out.print("carpan girin: ");
        carpan = girdi.nextInt();
        System.out.print("adim girin: ");
        adim = girdi.nextInt();
        carpimTablosu(carpan, adim);
        System.out.println("----------------------------");

        carpimTablosu_V2(carpan, adim);
        System.out.println("----------------------------");
        carpimTablosu_V3(carpan, adim);

        girdi.close();
    }

    public static void carpimTablosu(int carpan, int adim) {
        ArrayList<String> tabloListesi = new ArrayList<String>();
        for (int i = 0; i < adim; i++) {
            tabloListesi.add((i + 1) + "x" + carpan + "=" + ((i + 1) * carpan));
        }
        for (String string : tabloListesi) {
            System.out.println(string);
        }
    }

    public static void carpimTablosu_V2(int carpan, int adim) {

        for (int i = 0; i < adim; i++) {
            System.out.println((i + 1) + "x" + carpan + "=" + ((i + 1) * carpan));
        }

    }

    public static void carpimTablosu_V3(int carpan, int adim) {

        for (int i = 0; i < adim; i++) {
            // System.out.println((i + 1) + "x" + carpan + "=" + ((i + 1) * carpan));
            System.out.printf("%2d x %d = %d%n", i, carpan, (i * carpan));
        }

    }

}
