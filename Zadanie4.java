import java.util.Scanner;

public class Zadanie4 {
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
        System.out.println("Wynik: " +( x + y));

    }
    public static void SUB(int x, int y){
        System.out.println("Wynik: " + (x - y));

    }
    public static void DIV(int x, int y){
        System.out.println("Wynik: " +(x/y) );
    }
    public static void MUL(int x, int y){
        System.out.println("Wynik: " +(x*y) );
    }
}
