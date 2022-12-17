import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Wprowadź liczbę calkowitą:");
        int n = scanner.nextInt();
        for (int i = n, k = n; i > 0; i--) {
            if((n - i) % 2 != 0) {
                for (int j = k; j > 0; j--) {
                    System.out.print(" ");
                }
                k--;
                for (int j = 0; j < n- i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }


            }
        }
}

