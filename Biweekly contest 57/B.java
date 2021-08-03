import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class B {
    public static class pair {
        int friend, time;

        pair(int x, int y) {
            friend = x;
            time = y;
        }
    }

    public int smallestChair(int[][] times, int targetFriend) {
        Queue<pair> arrival = new PriorityQueue<>((a, b) -> a.time < b.time ? -1 : 1);
        Queue<pair> departure = new PriorityQueue<>((a, b) -> a.time < b.time ? -1 : 1);
        Queue<Integer> position = new PriorityQueue<>();
        HashMap<Integer, Integer> occupied = new HashMap<>();

        for (int i = 0; i < times.length; i++) {
            arrival.add(new pair(i, times[i][0]));
            departure.add(new pair(i, times[i][1]));
            position.add(i);
        }

        while (!arrival.isEmpty()) {
            while (!departure.isEmpty() && departure.peek().time <= arrival.peek().time) {
                pair p = departure.poll();
                position.add(occupied.get(p.friend));
            }

            pair p = arrival.poll();
            int pos = position.poll();
            occupied.put(p.friend, pos);
            if (p.friend == targetFriend)
                return pos;
        }
        return -1;
    }

}