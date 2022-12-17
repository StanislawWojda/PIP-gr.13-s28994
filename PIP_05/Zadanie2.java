import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Wprowadź liczbę całkowitą n:");
        int n = scanner.nextInt();
        int f0 = 0;
        int f1 = 1;
        int fn;
        System.out.println("F0 = 0");
        System.out.println("F1 = 1");
        int counter = 2;
        while(counter <= n)
        {   int x1, x2;
            x1 = f0;
            x2 = f1;
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
            System.out.println("F" + counter + " = " + x1  + " + " + x2 + " = " + fn );
            counter++;
        }

    }
}
