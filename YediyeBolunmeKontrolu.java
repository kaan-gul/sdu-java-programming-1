import java.util.Scanner;

public class YediyeBolunmeKontrolu {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int sayi1;

        System.out.print("Sayi gir:");
        sayi1 = girdi.nextInt();

        if (sayi1 % 7 == 0) {
            System.out.println("7ye tam bölünür");
        } else {
            System.out.println("7ye tam bölünmez");
        }
        girdi.close();
    }
}
