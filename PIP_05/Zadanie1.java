import java.util.Scanner;
import static java.lang.Math.abs;

public class Zadanie1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Wprowadź liczbę calkowitą n:");
        int n=scanner.nextInt();
        if(n >= 0) {
            for (int i = 0; i <= n; i++) {
                System.out.print(i + "; ");
            }
        }
        else if (n < 0){
            for(int i=0; i >= n; i--){
                System.out.print(i + "; ");
            }
        }
    }
}
