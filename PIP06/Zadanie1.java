package PIP06;
import java.util.Random;

public class Zadanie1 {
    private final Random random = new Random();

    public int[] generateTable(int n) {
        int[] tab = new int[n];
        for (int i = 0; i < n; i++)
            tab[i] = random.nextInt(0, 100);
        return tab;
    }

    public void printTable(int[] tab) {
        for (int i = 0; i < tab.length; i++) {

            if (i == tab.length - 1)
                System.out.println(tab[i]);
            else{
                System.out.print(tab[i] + ", ");
            }
        }
    }
}
