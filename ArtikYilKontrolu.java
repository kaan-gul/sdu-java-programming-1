import java.util.Scanner;

public class ArtikYilKontrolu {

    public static void main(String[] args) {
        Scanner girdiAl = new Scanner(System.in);
        int yil;

        System.out.print("Yili girin: ");
        yil = girdiAl.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println("Artik yildir.");
                } else {
                    System.out.println("Artik yil degil.");
                }

            } else {
                System.out.println("Artik yildir.");
            }

        } else {
            System.out.println("Artik yil degil.");
        }

        girdiAl.close();

    }
}