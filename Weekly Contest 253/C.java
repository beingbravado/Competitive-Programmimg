import java.util.Stack;

public class C {
    public int minSwaps(String s) {
        Stack<Character> x = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == ']' && !x.isEmpty() && x.peek() == '[')
                x.pop();
            else
                x.push(c);
        }
        for (char c : x)
            System.out.print(c);
        System.out.println();
        int n = x.size();
        n /= 2;

        return (n + 1) / 2;
    }
}