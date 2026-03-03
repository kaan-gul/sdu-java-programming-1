import java.util.Scanner;

public class DenklemKokleriniBul {

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int a, b, c;
        double x1, x2;
        double diskriminant;

        System.out.println("ax^2 + bx + c = 0 denkleminin koklerini bulmak icin a, b ve c degerlerini sirayla girin: ");
        a = girdi.nextInt();
        b = girdi.nextInt();
        c = girdi.nextInt();

        diskriminant = Math.pow(b, 2) - 4 * a * c;

        x1 = (-b + Math.sqrt(diskriminant)) / 2 * a;
        x2 = (-b - Math.sqrt(diskriminant)) / 2 * a;

        System.out.println("kokler su sekilde --> x1 = " + x1 + " x2 = " + x2);

        girdi.close();
    }
}