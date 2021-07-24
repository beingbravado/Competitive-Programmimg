import java.io.*;
import java.util.*;

public class B {
    public static void main(String[] args) throws IOException {
        // Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int k = Integer.parseInt(s1[1]);
            int[] a = new int[n];
            int[] ans = new int[n];
            String[] s2 = br.readLine().trim().split(" ");
            HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(s2[i]);

                ArrayList<Integer> list;
                if (map.containsKey(a[i]))
                    list = map.get(a[i]);
                else
                    list = new ArrayList<Integer>();
                list.add(i);
                map.put(a[i], list);
            }

            int x = 0, y = 0;
            for (int i : map.keySet()) {
                ArrayList<Integer> list = map.get(i);
                if (list.size() < k)
                    x += list.size();
                else
                    y++;
            }
            int ansCount = x / k + y;
            
            int pos = 0;
            for (int i : map.keySet()) {
                ArrayList<Integer> list = map.get(i);
                // System.out.println(list);
                for (int index = 0; index < k && index < list.size(); index++) {
                    int num = list.get(index);
                    ans[num] = ++pos;
                    if (pos >= k) {
                        ansCount--;
                        pos = 0;
                    }
                    if (ansCount == 0)
                        break;
                }
                if (ansCount == 0)
                    break;
            }

            for (int i = 0; i < n; i++)
                sb.append(ans[i] + " ");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}