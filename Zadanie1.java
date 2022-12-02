public class Zadanie1 {
    public static void main(String[] args){
        boolean czyPada = true;
        boolean czySwieciSlonce = true;

        if (czyPada && czySwieciSlonce) {
            System.out.println("tecza");
        }
        else if (czyPada == true && czySwieciSlonce == false) {
            System.out.println("plucha");
        }
        else if (czyPada == false && czySwieciSlonce == true) {
            System.out.println("slonecznie");
        }
        else if(czyPada == false && czySwieciSlonce == false){
            System.out.println("pochmurno");

        }



    }
}
