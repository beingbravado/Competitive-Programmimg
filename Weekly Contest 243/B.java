public class B {
    public String maxValue(String n, int x) {
        String s = "";
        if (n.charAt(0) == '-') {
            for (int i = 1; i < n.length(); i++) {
                int a = Integer.parseInt(n.substring(i, i + 1));
                if (x < a) {
                    s = n.substring(0, i) + x + n.substring(i);
                    break;
                }
                if (i == n.length() - 1)
                    s = n.substring(0, i + 1) + x + "";
            }
        } else {
            for (int i = 0; i < n.length(); i++) {
                int a = Integer.parseInt(n.substring(i, i + 1));
                if (x > a) {
                    s = n.substring(0, i) + x + n.substring(i);
                    break;
                }
                if (i == n.length() - 1)
                    s = n.substring(0, i + 1) + x + "";
            }
        }
        return s;
    }
}