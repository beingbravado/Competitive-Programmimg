public class A {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        char[] first = firstWord.toCharArray();
        char[] second = secondWord.toCharArray();
        char[] target = targetWord.toCharArray();
        int x = 0, y = 0, z = 0;
        for (char c : first) {
            x *= 10;
            x += c - 'a';
        }
        for (char c : second) {
            y *= 10;
            y += c - 'a';
        }
        for (char c : target) {
            z *= 10;
            z += c - 'a';
        }
        return x + y == z;
    }
}