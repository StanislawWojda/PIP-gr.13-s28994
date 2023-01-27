package PIP07;

import java.util.Scanner;

public class SecretStudent {
    private String name = "default name";
    private int numer = 1;
    private String nazwisko = "nazwisko";

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNumer() {
        return numer;
    }
    public void setNumer(int numer) {
        this.numer = numer;
    }

    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void readFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak masz na imie?");
        this.name = scanner.nextLine();
        System.out.println("Jak masz na nazwisko?");
        this.nazwisko = scanner.nextLine();
        System.out.println("Jaki masz numer?");
        this.numer = Integer.parseInt(scanner.nextLine());
    }

    public void print() {
        System.out.println("name: " + this.getName() + " nazwisko: " + this.getNazwisko() + " numer: " + this.getNumer());
    }
}
