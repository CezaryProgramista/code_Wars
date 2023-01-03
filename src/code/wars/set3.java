package code.wars;

public class set3 {
    public static void main(String[] args) {
        System.out.println( order("is2 Thi1s T4est 3a"));

    }

    public static String order(String words) {
        String newString = "";
        if (words.isEmpty()){
            return newString;
        }
        String[] tab = words.split(" ");
        StringBuilder bulid = new StringBuilder();

        boolean finalString = true;
        int number = 1;
        while (finalString) {
            for (String s : tab) {
                if (s.contains(String.valueOf(number))) {
                    bulid.append(s);
                    bulid.append(" ");
                    number++;
                }
            }
            newString = bulid.toString();
            if (number == tab.length+1) {
                finalString = false;
            }
        }
        return newString.trim();
    }
}
