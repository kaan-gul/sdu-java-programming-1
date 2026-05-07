import java.util.Scanner;

public class metotlar_sayilariTopla {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int baslangic, bitis;
        System.out.print("baslangic girin: ");
        baslangic = girdi.nextInt();
        System.out.print("bitis girin: ");
        bitis = girdi.nextInt();

        sayilariTopla(baslangic, bitis);
        girdi.close();
    }

    public static void sayilariTopla(int baslangic, int bitis) {
        int toplam = 0;
        for (int i = baslangic; i <= bitis; i++) {
            toplam += i;
        }
        System.out.println("Toplam: " + toplam);
    }
}
