import edu.princeton.cs.algs4.*;

public class problem2 {
    public static void main(String[] args) {
        if (StdIn.isEmpty()) {
            return;
        }

        int n = StdIn.readInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = StdIn.readInt();
        }


        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            table[i][i] = input[i];
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                int maxVal = Integer.MIN_VALUE;
                for (int k = i; k < j; k++) {
                    int val = (table[i][k] + table[k + 1][j]) / 2;
                    if (val > maxVal) {
                        maxVal = val;
                    }
                }
                table[i][j] = maxVal;
            }
        }

        StdOut.println(table[0][n - 1]);
    }
}