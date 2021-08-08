import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class A {
    public boolean isPrefixString(String s, String[] words) {
        StringBuffer sb = new StringBuffer();
        for (String str : words) {
            sb.append(str);
            if (s.equals(sb.toString()))
                return true;
        }
        return false;
    }
}