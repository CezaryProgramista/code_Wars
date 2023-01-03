package code.wars;

public class set2 {
    public static void main(String[] args) {
        int n = 8;
        double[] s = new double[]{0, 1, 1};
        double[] tab = new double[n];
        for (int i = 0; i < tab.length; i++) {
            if (i < 3) {
                tab[i] = (int) s[i];
            }
            if (i > 2) {
                tab[i] = tab[i - 1] + tab[i - 2] + tab[i - 3];
            }
        }
        for (double v : tab) {
            System.out.println(v);
        }
    }
}

