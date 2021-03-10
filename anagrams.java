// import java.util.Scanner;

public class anagrams {
    static boolean isAnagram(String a, String b) {
        String news = a.toLowerCase();
        String news_l = b.toLowerCase();
        char[] n = news.toCharArray();
        char[] m = news_l.toCharArray();
        if(a.length() != b.length()) {
            return false;
        }
        else {
            java.util.Arrays.sort(n);
            java.util.Arrays.sort(m);
            System.out.println(n);
            System.out.println(m);
            for(int i = 0; i < a.length(); i++) {
                if(n[i] != m[i]) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // String a = scan.nextLine();
        // String b = scan.nextLine();
        String a = "SILENT";
        String b = "LISTEN";
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagram" : "Not Anagram");

        // scan.close();
    }
}
