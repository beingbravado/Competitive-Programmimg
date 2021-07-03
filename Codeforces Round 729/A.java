import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[2 * n];
            for (int i = 0; i < a.length; i++) {
                a[i] = scan.nextInt();
            }
            int x = 0, y = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 == 0)
                    x++;
                else
                    y++;
            }

            System.out.println((x == y ? "Yes" : "No"));
        }
        scan.close();
    }
}
