import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Witamy w kantorze!");
        System.out.println("Wybierz walutę:");
        System.out.println("      1 - PLN");
        System.out.println("      2 - JPY");
        int val= scanner.nextInt();


        if(val == 1){
            System.out.println("Wprowadź kwotę:");
            double kwota= scanner.nextDouble();
            PLN(kwota);

        } else if (val == 2){
            System.out.println("Wprowadź kwotę:");
            double kwota= scanner.nextDouble();
            JPY(kwota);
        }else {
            System.out.println("Wprowadzono niepoprawne polecenie!" );

        }


    }
    public static void PLN(double x){
        double kurs= 30.15;
        System.out.println(x + " zł " + "=> " + (x * kurs) + " ¥");


    }
    public static void JPY(double x){
        double kurs=0.033;
        System.out.println(x + " ¥" + "=> " + (x * kurs) + " zł");
    }
}
