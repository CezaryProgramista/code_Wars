package code.wars;

public class set4 {
    public static void main(String[] args) {
        System.out.println( findShort("bitcoin take over the world maybe who knows perhaps"));
    }

    public static int findShort(String s) {
        String[] sTab = s.split(" ");
        int min = 0;
        for (int i = 0; i < sTab.length; i++) {
            if (i == 0) {
                min = sTab[i].length();
            } else {
                if (sTab[i].length() < min) {
                    min = sTab[i].length();

                }
            }
        }
        return min;
    }
}
