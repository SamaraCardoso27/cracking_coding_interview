import java.util.HashSet;
import java.util.Set;

public class Unique {

    public static void main(String[] args) throws Exception {

        String input = "batatinha";
        if (isUnique(input)) {
            System.out.println("Todos os characters sao unicos");
        } else {
            System.out.println("Todos os characters sao nao unicos");
        }
    }

    public static boolean isUnique(String s) {
        Set<Character> set = new HashSet<>();
        char[] characters = s.toCharArray();
        for (Character c : characters) {
            if (!set.add(c)) {
                return false;
            }
        }
        return true;
    }
}

