import java.util.ArrayList;
import java.util.Scanner;

public class metotlar_tersle {

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        String terstenYazilacakCumle;

        terstenYazilacakCumle = girdi.nextLine();

        System.out.println(tersle(terstenYazilacakCumle));
        System.out.println("--------------------------");
        cumleyiTerstenYazdir_V2(terstenYazilacakCumle);
        girdi.close();

    }

    public static String tersle(String cumle) {
        String[] harflerDizi = cumle.split(" ");
        String cumleSon = " ";
        ArrayList<String> harfDizi = new ArrayList<String>();
        for (int i = harflerDizi.length - 1; i >= 0; i--) {
            harfDizi.add(harflerDizi[i]);
        }
        for (String string : harfDizi) {
            cumleSon += string + " ";

        }
        return cumleSon;
    }

    public static void cumleyiTerstenYazdir_V2(String cumle) {
        String[] kontrol = cumle.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = kontrol.length - 1; i >= 0; i--) {
            sb.append(kontrol[i]);
            sb.append(" ");
        }
        System.out.println("StringBuilder ile: " + sb);
    }
}
