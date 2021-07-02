public class C {
    public int largestMagicSquare(int[][] grid) {
        int maxSquare = 1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                maxSquare = Math.max(maxSquare, check(grid, i, j));
            }
        }
        return maxSquare;
    }

    public static int check(int[][] grid, int x, int y) {
        int max = 1;
        int i = x, j = y;
        while (i >= 0 && j >= 0) {
            if (checkGrid(grid, x, y, i, j))
                max = Math.max(max, x - i + 1);
            i--;
            j--;
        }
        return max;
    }

    public static boolean checkGrid(int[][] grid, int x, int y, int a, int b) {
        int sum = 0;
        for (int i = a, j = b; i <= x && j <= y; i++, j++)
            sum += grid[i][j];
        int total = 0;
        for (int i = a, j = y; i <= x && j >= b; i++, j--)
            total += grid[i][j];
        if (total != sum)
            return false;
        for (int i = a; i <= x; i++) {
            int count = 0;
            for (int j = b; j <= y; j++)
                count += grid[i][j];
            if (count != sum)
                return false;
        }
        for (int j = b; j <= y; j++) {
            int count = 0;
            for (int i = a; i <= x; i++)
                count += grid[i][j];
            if (count != sum)
                return false;
        }
        return true;
    }
}
