import java.util.Scanner;

public class A {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0)
        {
//            long n = scan.nextLong();
            int n = scan.nextInt();
            // long b = scan.nextInt();

            // String x = Integer.toBinaryString(n);
            // int y= x.length();
            int ans= Integer.highestOneBit(n);
            ans--;
            System.out.println(ans);
        }
        scan.close();
    }
}
