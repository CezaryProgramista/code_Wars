package code.wars;

public class set8 {
    public static void main(String[] args) {

        System.out.println(toCamelCase("the_stealth-warrior"));
    }

    static String toCamelCase(String s) {

        String[] tab = s.split("[-,_]");
        StringBuilder builder = new StringBuilder();
        String f;
        for (int i = 0; i < tab.length; i++) {

            if (i > 0) {
                tab[i] = String.valueOf(tab[i].charAt(0)).toUpperCase().concat(tab[i].substring(1));
            }
            builder.append(tab[i]);
        }
        f = builder.toString();
        return f;
    }
}