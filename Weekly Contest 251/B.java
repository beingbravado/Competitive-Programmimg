import java.util.*;

public class B {
    public String maximumNumber(String num, int[] change) {
        boolean start = false;
        String[] s = num.split("");
        String ans = "";
        int startIndex = 0, endIndex = num.length();
        for (int i = 0; i < num.length(); i++) {
            int x = Integer.parseInt(s[i]);
            if (change[x] > x) {
                if (!start) {
                    startIndex = i;
                    start = true;
                }
                ans += "" + change[x];
            } else if (change[x] == x && start) {
                ans += "" + change[x];
            } else if (start) {
                endIndex = i;
                break;
            }
        }
        if (ans.length() > 0)
            num = num.substring(0, startIndex) + ans + num.substring(endIndex);

        return num;
    }
}