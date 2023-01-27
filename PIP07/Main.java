package PIP07;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(), student2 = new Student();
        student2.name = "Stanislaw Wojda";
        student2.numer = 28994;
        System.out.println("student1 name: " + student1.name + " numer: " + student1.numer + ", student2 name: " + student2.name + " numer: " + student2.numer);

        SecretStudent secretStudent1 = new SecretStudent();
        System.out.println("secretStudent1 name: " + secretStudent1.getName() + " nazwisko: " + secretStudent1.getNazwisko() + " numer: " + secretStudent1.getNumer());

        SecretStudent secretStudent2 = new SecretStudent();
        secretStudent2.setName("Stanislaw");
        secretStudent2.setNazwisko("Wojda");
        secretStudent2.setNumer(28994);
        System.out.println("secretStudent2 name: " + secretStudent2.getName() + " nazwisko: " + secretStudent2.getNazwisko() + " numer: " + secretStudent2.getNumer());

        SecretStudent secretStudent3 = new SecretStudent();
        SecretStudent secretStudent4 = new SecretStudent();
        secretStudent3.readFromScanner();
        secretStudent4.readFromScanner();
        secretStudent3.print();
        secretStudent4.print();
    }
}
