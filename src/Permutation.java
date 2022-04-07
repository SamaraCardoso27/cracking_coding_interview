
import java.util.Arrays;

public class Permutation {
    
    public static boolean isPermutation(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        return sortString(s1).equals(sortString(s2));
    }

    public static String sortString(String s){
        char content [] = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
    public static void main(String[] args) {
        String str1 = "ana";
        String str2 = "ana";
        boolean result = isPermutation(str1, str2);
        System.out.println(result);
    }
}
