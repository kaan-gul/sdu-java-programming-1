import java.util.Scanner;

public class metotlar_buyukBul {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi1, sayi2, sayi3;
        System.out.print("birinci sayiyi giriniiz: ");
        sayi1 = girdi.nextInt();
        System.out.print("ikinci sayiyi giriniiz: ");
        sayi2 = girdi.nextInt();
        System.out.print("ucuncu sayiyi giriniiz: ");
        sayi3 = girdi.nextInt();
        buyukBul(sayi1, sayi2, sayi3);
        girdi.close();
    }

    public static void buyukBul(int sayi1, int sayi2, int sayi3) {
        int[] kontrolDizisi = { sayi1, sayi2, sayi3 };
        int enBuyukSayi = sayi1;
        for (int i : kontrolDizisi) {
            if (i > enBuyukSayi) {
                enBuyukSayi = i;
            }
        }
        System.out.println("En buyuk sayi : " + enBuyukSayi);
    }
}
