import java.util.PriorityQueue;
import java.util.Queue;

public class B {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        Queue<Integer> time = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            time.add((int) Math.ceil(dist[i] / (double) speed[i]));
        }
        int ans = 0;
        while (!time.isEmpty() && ans < time.peek()) {
            ans++;
            time.poll();
        }
        return ans;
    }
}