import java.util.ArrayList;
import java.util.Scanner;

public class metotlar_cumleyiTerstenYazdir {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        String terstenYazilacakCumle;

        terstenYazilacakCumle = girdi.nextLine();

        cumleyiTerstenYazdir_V1(terstenYazilacakCumle);
        System.out.println("--------------------------");
        cumleyiTerstenYazdir_V2(terstenYazilacakCumle);
        girdi.close();

    }

    public static void cumleyiTerstenYazdir_V1(String cumle) {
        String[] harflerDizi = cumle.split("");
        ArrayList<String> harfDizi = new ArrayList<String>();
        for (int i = harflerDizi.length - 1; i >= 0; i--) {
            harfDizi.add(harflerDizi[i]);
        }
        for (String string : harfDizi) {
            System.out.print(string);

        }
        System.out.println("");
    }

    public static void cumleyiTerstenYazdir_V2(String cumle) {
        StringBuilder sb = new StringBuilder(cumle);
        sb.reverse();
        System.out.println("StringBuilder ile: " + sb);
    }
}
