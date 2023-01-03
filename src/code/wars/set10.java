package code.wars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class set10 {
    public static void main(String[] args) {
        System.out.println(validParentheses("678574321(())()()235467asdgfhvutdygjh486i7u)))()()()())))((((((()()()()(()()"));
    }

    public static boolean validParentheses(String parens) {
        List<String> list = new ArrayList<>(Arrays.asList(parens.split("")));
        List<String> list1 = new ArrayList<>(Arrays.asList("(", ")"));
        list.retainAll(list1);
        int a = 0;
        while (true) {
            for (int i = 0; i < list.size(); i++) {
                if (i != list.size() - 1) {
                    if (list.get(i).equals("(") && list.get(i + 1).equals(")")) {
                        list.set(i, "a");
                        list.set(i + 1, "a");
                        i++;
                        a++;
                    }
                }
                if (i == list.size() - 1) {
                    list.removeAll(Collections.singleton("a"));
                }
            }
            if (list.size() == 0) {
                return true;
            }
            if (a == 0) {
                return false;
            }
            a = 0;
        }
    }
}

