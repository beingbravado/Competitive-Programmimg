import java.io.*;

public class C {
    public static double solution;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            double c = Double.parseDouble(s[0]);
            double m = Double.parseDouble(s[1]);
            double p = Double.parseDouble(s[2]);
            double v = Double.parseDouble(s[3]);
            solution = 0f;
            slips(c, m, p, v, 1, 1);
            System.out.println(solution);
        }
    }

    public static void slips(double c, double m, double p, double v, double prob, double length) {
        solution += length * prob * p;
        // System.out.println(c + " " + m + " " + p + " " + prob * p);
        if (c == 0 && m == 0) {
            return;
        }
        if (c > v)
            if (m > 0)
                slips(c - v, m + v / 2, p + v / 2, v, prob * c, length + 1);
            else
                slips(c - v, 0, p + v, v, prob * c, length + 1);
        else if (c > 0)
            if (m > 0)
                slips(0, m + c / 2, p + c / 2, v, prob * c, length + 1);
            else
                slips(0, 0, p + c, v, prob * c, length + 1);
        if (m > v)
            if (c > 0)
                slips(c + v / 2, m - v, p + v / 2, v, prob * m, length + 1);
            else
                slips(0, m - v, p + v, v, prob * m, length + 1);
        else if (m > 0)
            if (c > 0)
                slips(c + m / 2, 0, p + m / 2, v, prob * m, length + 1);
            else
                slips(0, 0, p + m, v, prob * m, length + 1);
    }
}
