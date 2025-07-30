import java.util.*;

public class solution {
    public static void find_Subset(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return; // ✅ important!
        }

        // Recursive choices: include or exclude current char
        find_Subset(str, ans + str.charAt(i), i + 1); // Include
        find_Subset(str, ans, i + 1);                 // Exclude
    }

    public static void main(String[] args) {
        String str = "abc";
        find_Subset(str, "", 0); // ✅ use "" instead of " "
    }
}
