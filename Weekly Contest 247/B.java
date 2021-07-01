import java.util.ArrayList;

public class B {
    public static class pair {
        int x, y;

        pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][] a = new int[m][n];
        for (int g = 0; g < n / 2 && g <= m / 2; g++) {
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<pair> pos = new ArrayList<>();
            int i = g, j = g;
            for (; j < n - g; j++) {
                b.add(grid[i][j]);
                pos.add(new pair(i, j));
            }
            j--;
            for (; i < m - g; i++) {
                b.add(grid[i][j]);
                pos.add(new pair(i, j));
            }
            i--;
            for (; j >= g; j--) {
                b.add(grid[i][j]);
                pos.add(new pair(i, j));
            }
            j++;
            for (; i > g; i--) {
                b.add(grid[i][j]);
                pos.add(new pair(i, j));
            }

            int t = k % b.size();
            for (int index = 0; index < b.size(); index++) {
                int y = index + t;
                if (y >= b.size()) {
                    y = y - b.size();
                }
                a[pos.get(index).x][pos.get(index).y] = b.get(y);
            }
        }
        return a;
    }
}
