import java.util.Scanner;

public class metotlar_parcaGetir {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int baslangic, son;
        String kelime;
        System.out.println("Kelime giirn");
        kelime = girdi.nextLine();
        System.out.print("baslangic girin: ");
        baslangic = girdi.nextInt();
        System.out.print("son girin: ");
        son = girdi.nextInt();
        parcaGetir(kelime, baslangic, son);
        girdi.close();
    }

    public static String parcaGetir(String kelime, int baslangic, int bitis) {

        return "";
    }
}
