package PIP06;

public class Main {
    public static void main(String[] args) {
        Zadanie1 zadanie1 = new Zadanie1();
        Zadanie2 zadanie2 = new Zadanie2();
        Zadanie3 zadanie3 = new Zadanie3();
        Zadanie4 zadanie4 = new Zadanie4();

        int[] tab1 = zadanie1.generateTable(15);
        int[] tab2 = zadanie1.generateTable(15);
        int[] tab3 = zadanie1.generateTable(20);
        System.out.println("Zadanie 1");
        zadanie1.printTable(tab1);

        zadanie2.sort(tab3);
        int[] tab5 = zadanie2.sort(tab3);
        System.out.println("Zadanie 2");
        zadanie1.printTable(tab5);
        int[] tab4 = zadanie3.reverse(tab1);
        System.out.println("Zadanie 3");
        zadanie1.printTable(tab4);
        System.out.println("Zadanie 4");
        System.out.println(zadanie4.is_reversed(tab1, tab4));
        System.out.println(zadanie4.is_reversed(tab1, tab3));
        System.out.println(zadanie4.is_reversed(tab1, tab2));
    }
}
