import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long x = (long) Math.sqrt(n);
        while (n % x != 0)
            x--;
        long y = n / x;
        System.out.println(x + y - 2);
        scan.close();
    }
}