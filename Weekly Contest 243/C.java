import java.util.PriorityQueue;
import java.util.Queue;

public class C {
    public static class pair implements Comparable<pair> {
        int index, value;

        public pair(int x, int y) {
            index = x;
            value = y;
        }

        @Override
        public int compareTo(pair o) {
            if (value != o.value) {
                return value - o.value;
            } else {
                return index - o.index;
            }
        }
    }

    public int[] assignTasks(int[] servers, int[] tasks) {
        int[] position = new int[tasks.length];
        Queue<pair> q = new PriorityQueue<>();
        Queue<pair> rest = new PriorityQueue<>();
        for (int i = 0; i < servers.length; i++)
            q.add(new pair(i, servers[i]));

        int i = 0;
        while (i < tasks.length && !q.isEmpty()) {
            // while (i >= rest.peek().value - servers[rest.peek().index]) {
            // q.add(rest.poll());
            // }
            // if (i >= q.peek().value - servers[q.peek().index]) {
            pair p = q.poll();
            position[i] = p.index;
            p.value += tasks[i];
            rest.add(p);
            i++;
            // } else {

            // }
        }
        return position;
    }
}