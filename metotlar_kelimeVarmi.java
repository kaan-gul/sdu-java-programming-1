import java.util.Scanner;

public class metotlar_kelimeVarmi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        String girdiAlinan, girdiAranan;
        boolean sonuc;

        System.out.print("Cumleyi giriniz: ");
        girdiAlinan = girdi.nextLine();
        System.out.print("Aranacak kelimeyi giriniz: ");
        girdiAranan = girdi.nextLine();
        sonuc = kelimeVarmi(girdiAlinan, girdiAranan);
        System.out.println(sonuc);
        girdi.close();

    }

    public static boolean kelimeVarmi(String cumle, String kelime) {
        boolean kelimeVarmi = false;
        String[] kelimeDizi = cumle.split(" ");
        for (String string : kelimeDizi) {
            if (string.equals(kelime)) {
                kelimeVarmi = true;
            }
        }

        return kelimeVarmi;
    }
}
