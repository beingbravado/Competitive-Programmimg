import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a= new int[n];
            int min= Integer.MAX_VALUE;
            for (int i = 0; i < a.length; i++) {
                a[i]= scan.nextInt();
                min= Math.min(a[i], min);
            }
            int count=0;
            for (int i = 0; i < a.length; i++) {
                if(a[i]>min) count++;
            }
            
            System.out.println(count);
        }
        scan.close();
    }
}
