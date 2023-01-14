package PIP06;

public class Zadanie3 {
    public int[] reverse(int[] tab) {
        int temp;
        int[] new_tab = new int[tab.length];
        System.arraycopy(tab, 0, new_tab, 0, tab.length);
        for(int i = 0; i < (new_tab.length / 2) + 1; i++) {
            temp = new_tab[i];
            new_tab[i] = new_tab[new_tab.length - 1 - i];
            new_tab[new_tab.length - 1 - i] = temp;
        }
        return new_tab;
    }
}
