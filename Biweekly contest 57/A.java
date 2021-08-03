import java.util.Arrays;

public class A {
    public boolean areOccurrencesEqual(String s) {
        int[] a = new int[26];
        for (char c : s.toCharArray()) {
            a[c - 'a']++;
        }
        int x = -1;
        for (int i = 0; i < 26; i++) {
            if (a[i] > 0) {
                if (x == -1)
                    x = a[i];
                else if (a[i] != x)
                    return false;
            }
        }
        return true;
    }
}