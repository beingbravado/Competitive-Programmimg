import java.io.*;
import java.util.*;

public class B {
    public static class pair {
        int node, value;

        pair(int x, int y) {
            node = x;
            value = y;
        }
    }

    public static void main(String[] args) throws IOException {
        // Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int k = Integer.parseInt(s1[1]);
            int h = Integer.parseInt(s1[2]);
            ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
            for (int i = 0; i <= n; i++)
                tree.add(new ArrayList<>());

            for (int i = 1; i < n; i++) {
                String[] s2 = br.readLine().trim().split(" ");
                int x = Integer.parseInt(s2[0]);
                int y = Integer.parseInt(s2[1]);

                tree.get(x).add(y);
            }
        }
        System.out.println(sb);
    }
}