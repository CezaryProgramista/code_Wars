package code.wars;

public class set7 {
    public static void main(String[] args) {
        System.out.println(duplicateCount("Indivisibilities"));
    }

    public static int duplicateCount(String text) {
        String[] tab = text.toLowerCase().split("");
        String empty = "";
        int matches=0;
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            for (int j = i; j < text.length(); j++) {
                if (tab[i].matches(tab[j]) && !empty.contains(tab[i])) {
                    matches++;
                }
            }
            if (matches > 1) {
                empty=empty.concat(tab[i]);
                sum++;
            }
            matches = 0;
        }
        return sum;
    }
}
