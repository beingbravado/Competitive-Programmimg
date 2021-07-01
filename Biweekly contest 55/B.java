public class B {
    public String removeOccurrences(String s, String part) {
        for (int i = 0; i < 10000; i++) {
            boolean found = true;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == part.charAt(0)) {
                    if (check(s, part, j)) {
                        s = s.substring(0, j) + s.substring(j + part.length());
                        found = false;
                        break;
                    }
                }
            }
            if (found)
                break;
        }
        return s;
    }

    public static boolean check(String s, String part, int x) {
        for (int i = 0; i < part.length(); i++, x++) {
            if (x == s.length())
                return false;
            if (s.charAt(x) != part.charAt(i))
                return false;
        }
        return true;
    }
}