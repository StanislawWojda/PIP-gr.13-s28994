import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Wprowadź login:");
        String login=scanner.nextLine();

        if (login.equals("auchan21")) {
            System.out.println("Wprowadź hasło:");
            String hasło= scanner.nextLine();
        if (hasło.equals("qwerty")){
            System.out.println("Zalogowano pomyślnie");
        }  else {
            System.out.println("Błędne hasło");
            System.exit(0);
        }
        } else{
            System.out.println("Błędny login");
            System.exit(0);

        }
        }
    }

