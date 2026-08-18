import edu.princeton.cs.algs4.*;

public class problem3 {

    public static void main(String[] args) {
        if (StdIn.isEmpty()) {
            return;
        }

        int n = StdIn.readInt();

        int[] a = new int[n];

        // liest alle Zahlen ein
        for (int i = 0; i < n; i++) {
            a[i] = StdIn.readInt();
        }

        long anzahl = 0;

        // Start des Bereichs
        for (int left = 0; left < n; left++) {

            // Am Anfang besteht der Bereich nur aus einem Schüler
            int maxIndex = left;

            // Ende des Bereichs immer weiter nach rechts schieben
            for (int right = left; right < n; right++) {

                // Ist der neue Schüler größer als unser bisheriges Maximum?
                if (a[right] > a[maxIndex]) {
                    maxIndex = right;
                }

                // Anzahl der Schüler links vom größten Schüler
                int links = maxIndex - left;

                // Anzahl der Schüler rechts vom größten Schüler
                int rechts = right - maxIndex;

                // Maximum liegt in der ersten Hälfte
                if (links <= rechts) {
                    anzahl++;
                }
            }
        }

        StdOut.println(anzahl % 1_000_000_007);
    }
}