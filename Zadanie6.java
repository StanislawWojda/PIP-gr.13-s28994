import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź 2 liczby rzeczywiste i naciśnij ENTER po każdej z nich:");
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();

        if (x > y) {
            x = x + y;
            y = x - y;
            x = x - y;
        }
        System.out.println("Wybrany przedział: [" + x + ", " + y + "]");
        float r1 = randomBetween(x, y);
        float r2 = randomBetween(x, y);
        float r3 = randomBetween(x, y);
        System.out.println("Wartości generowane losowo: ");


        double dArr[] = {r1, r2, r3};


        for (double number : dArr) {
            System.out.println(number);
        }

        Arrays.sort(dArr);
        System.out.println("Gdzie: " + dArr[0] + " < " + dArr[1] + " < " + dArr[2]);
    }


        static float randomBetween ( float x, float y){
            Random r = new Random();
            float a1 = x + (y - x) * r.nextFloat();

            return a1;
        }
    }


