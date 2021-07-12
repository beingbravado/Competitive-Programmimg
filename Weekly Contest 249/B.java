import java.util.*;

public class B {
    public int countPalindromicSubsequence(String s) {
        int ans = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            int x = s.indexOf(i);
            int y = s.lastIndexOf(i);
            HashSet<Character> uniqueAns = new HashSet<>();
            for (int j = x + 1; j < y; j++) {
                uniqueAns.add(s.charAt(j));
            }
            ans += uniqueAns.size();
        }
        return ans;
    }
}