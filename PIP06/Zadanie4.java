package PIP06;

public class Zadanie4 {
    public boolean is_reversed(int[] first_tab, int[] second_tab) {
        if (first_tab.length != second_tab.length)
            return false;
        for(int i = 0; i < first_tab.length; i++) {
            if (first_tab[i] != second_tab[first_tab.length - 1 - i])
                return false;
        }
        return true;
    }
}
