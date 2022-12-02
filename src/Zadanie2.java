import java.util.Scanner;
import java.util.Random;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz cyfre od 1 do 6:");
        int x = scanner.nextInt();

        if (x == randomBetween(1, 6)){
            System.out.println("YOU DIED");
        } else {
            System.out.println("Lucky one!");
        }
    }

        static int randomBetween(int start, int end) {
            Random random = new Random();
            int a1 = random.nextInt(end - start + 1);
            int a2 = a1 + start;
            return a2;

        }


    }

