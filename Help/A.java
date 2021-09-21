import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        ArrayList<Long> list = new ArrayList<>();
        long temp = n;
        while (temp > 0) {
            long x = temp % 10;
            list.add(x);
            temp /= 10;
        }
        ArrayList<Long> check = new ArrayList<>();
        long num = list.get(0);
        int index = 0;
        boolean condition = false;
        for (int i = 1; i < list.size(); i++) {
            long x = list.get(i);
            index++;
            check.add(x);
            if (x < num) {
                condition = true;
                break;
            }
        }

        long myNum = 0;
        if (condition) {
            int last = list.size() - 1;
            while (last > index) {
                myNum *= 10;
                myNum += list.get(last);
                last--;
            }
            Collections.sort(check);
            myNum *= 10;
            myNum += num;
            for (long x : check) {
                myNum *= 10;
                myNum += x;
            }
            System.out.println(myNum);
        } else {
            System.out.println("No greater value possible");
        }

        scan.close();
    }
}