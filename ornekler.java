
import java.util.Arrays;
import java.util.Random;

public class ornekler {
    public static void main(String[] args) {

        Random rnd = new Random();
        int diziS[] = new int[50];

        for (int i = 0; i < 50; i++) {
            diziS[i] = rnd.nextInt(100);
            System.out.println(diziS[i]);
        }
        DiziyiSirala(diziS);

    }

    public static void DiziyiSirala(int[] dizi) {
        Arrays.sort(dizi);
        for (int i : dizi) {
            System.out.println(i);
        }
    }
}
