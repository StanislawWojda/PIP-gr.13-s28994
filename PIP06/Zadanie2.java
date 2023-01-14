package PIP06;

public class Zadanie2 {
    public int[] sort(int[] tab)
    {
        int temp;
        int[] new_tab = new int[tab.length];
        System.arraycopy(tab, 0, new_tab, 0, tab.length);
        for (int i = 0; i < new_tab.length - 1; i++) {
            for (int j = 0; j < new_tab.length - i - 1; j++) {
                if (new_tab[j] > new_tab[j + 1]) {
                    temp = new_tab[j];
                    new_tab[j] = new_tab[j + 1];
                    new_tab[j + 1] = temp;
                }
            }
        }
        return new_tab;
    }
}
