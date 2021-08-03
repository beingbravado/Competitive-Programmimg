import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class A {
    public int getLucky(String s, int k) {
        Queue<Integer> sum = new LinkedList();
        for (char c : s.toCharArray()) {
            sum.add((c - 'a' + 1) % 10);
            sum.add((c - 'a' + 1) / 10);
        }
        int ans = 0;
        while (k-- > 0) {
            ans = 0;
            while (!sum.isEmpty()) {
                ans += sum.poll();
            }
            int num = ans;
            while (num > 0) {
                sum.add(num % 10);
                num = num / 10;
            }
        }
        return ans;
    }
}