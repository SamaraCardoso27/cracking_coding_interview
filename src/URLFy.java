public class URLFy {

    public static String replace(String s){
        s = s.trim();
        return s.replaceAll("\\s", "%20");
    }

    public static void main(String[] args) {

        String str = "My     String       ";
        System.out.println(replace(str));
    }
}
