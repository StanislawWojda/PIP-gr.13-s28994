import java.util.Scanner;

import static java.lang.Math.abs;

public class Zadanie5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Wybierz operacje(ADD,SUB,DIV,MUL):");
        String dzialanie= scanner.nextLine();
        System.out.println("Pierwsza wartość:");
        int x= scanner.nextInt();
        System.out.println("Druga wartość:");
        int y= scanner.nextInt();



        switch (dzialanie){
            case "ADD":
                ADD(x, y);
                break;
            case "SUB":
                SUB(x, y);
                break;
            case "DIV":
                DIV(x, y);
                break;
            case "MUL":
                MUL(x, y);
                break;
            default:
                System.out.println("Brak takiej operacji");
        }
    }

    public static void ADD(int x, int y){
        int z=x+y;
        System.out.println("Wynik: " + z);
        absoluteValue(z);
    }
    public static void SUB(int x, int y){
        int z=x-y;
        System.out.println("Wynik: " + z);
        absoluteValue(z);
    }
    public static void DIV(int x, int y){
        try {
            int z=x/y;
            System.out.println("Wynik: " +z );
            absoluteValue(z);

        }catch (ArithmeticException e){
            System.out.println("Nie można dzielić przez 0!!!");
        }
    }
    public static void MUL(int x, int y){
        int z=x*y;
        System.out.println("Wynik: " +z );
        absoluteValue(z);
    }
    public static void absoluteValue(int z){
        int q=abs(z);
        System.out.println(z + "=>"+ q);

    }
}

