import java.util.*;

public class B {
    public int minStoneSum(int[] piles, int k) {
        Queue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int x : piles)
            pq.add(x);
        while (k-- > 0 && !pq.isEmpty()) {
            int y = pq.poll();
            y -= y / 2;
            pq.add(y);
        }
        int ans = 0;
        while (!pq.isEmpty())
            ans += pq.poll();
        return ans;
    }
}