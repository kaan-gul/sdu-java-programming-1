import java.util.Scanner;

public class HarfNotuDonusturucu {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int not;

        System.out.print("Notunuzu giriniz:");
        not = girdi.nextInt();

        if (not >= 0 && not < 25) {
            System.out.println("F");
        } else if (not >= 25 && not < 45) {
            System.out.println("E");
        } else if (not >= 45 && not < 55) {
            System.out.println("D");
        } else if (not >= 55 && not < 70) {
            System.out.println("C");
        } else if (not >= 70 && not < 85) {
            System.out.println("B");
        } else if (not >= 85 && not <= 100) {
            System.out.println("A");
        }

        girdi.close();
    }
}
