public class Zadanie4 {
public static void main(String[] args) {
    int x = 5;
    int y = 3;
    int z = 8;
    char space = ' ';
    char gwiazdka = '*';
    int max = Math.max(x, Math.max(y, z));
    for(int i = 0; i < Math.max(x, Math.max(y, z)); i++) {
        if (x >= max) {
            System.out.print(gwiazdka);
        }
        else {
            System.out.print(space);
        }
        System.out.print(space);
        if (y >= max) {
            System.out.print(gwiazdka);
        }
        else {
            System.out.print(space);
        }
        System.out.print(space);
        if (z >= max) {
            System.out.print(gwiazdka);
        }
        else {
            System.out.print(space);

        }

        System.out.println(space);
        max--;
    }
    }

}






