import java.util.Scanner;

public class metotlar_kelimeyiGetir {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        String cumle;
        int sira;
        System.out.print("Kelime girin: ");
        cumle = girdi.nextLine();
        System.out.print("Sira numarasini giriniz: ");
        sira = girdi.nextInt();
        System.out.println(kelimeyiGetir(cumle, sira));

        girdi.close();
    }

    public static String kelimeyiGetir(String cumle, int kelimeSiraNo) {
        String[] dizi = cumle.split(" ");

        return dizi[kelimeSiraNo - 1];
    }
}
