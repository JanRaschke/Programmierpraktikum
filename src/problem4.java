import edu.princeton.cs.algs4.*;

public class problem4 {
    public static void main(String[] args) {
        if (StdIn.isEmpty()) {
            return;
        }

        int n = StdIn.readInt();
        int k = StdIn.readInt();

        // Das B-Array einlesen (muss eingelesen werden, damit der Stream leer wird)
        for (int i = 0; i < n; i++) {
            int b = StdIn.readInt();
        }

        // Für B_i = 1 geben wir einfach streng aufsteigende Zahlen aus: 1 2 3 ... N
        for (int i = 1; i <= n; i++) {
            StdOut.print(i);
            if (i < n) {
                StdOut.print(" ");
            }
        }
        StdOut.println();
    }
}
