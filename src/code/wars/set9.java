package code.wars;

public class set9 {
    public static void main(String[] args) {

        System.out.println(spinWords("Hey fellow warriors"));
    }

    public static String spinWords(String sentence) {
        String[] tab = sentence.split(" ");
        StringBuilder builder = new StringBuilder();
        String s;
        String output = "";
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].length() > 4) {
                String[] tab2 = tab[i].split("");
                for (int j = tab2.length ; j > 0; j--) {
                    builder.append(tab2[j-1]);
                }
                s = builder.toString();
                output = output.concat(s).concat(" ");
                s = "";
                builder.delete(0,tab2.length);
                continue;
            }
            output = output.concat(tab[i].concat(" "));
        }
        return output.trim();
    }
}

