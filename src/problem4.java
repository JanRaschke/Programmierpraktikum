import java.io.*;
import java.util.*;

public class problem4 {

    /*
     * 1: x ← 0
     * 2: y ← -1
     * 3: for i ← 1, N execute
     * 4: while x ≤ y and A_i > T_y execute
     * 5: y ← y - 1
     * 6: end while
     * 7: if x ≤ y and i - K ≥ 1 and T_x = A_{i-K} then
     * 8: x ← x + 1
     * 9: end if
     * 10: y ← y + 1
     * 11: T_y ← A_i
     * 12: B_i ← y - x + 1
     * 13: end for
     */

    public static void main(String[] args) throws Exception {

        // Schneller als Scanner
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.trim().isEmpty())
            return;

        // K und N aufpalten und parsen, n Länge liste, --> Länge für
        // Schleidfendurchlauf
        // K begrenzt länge Liste spielt hier keine Rolle
        StringTokenizer st = new StringTokenizer(line);
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // Speicherpuffer und Ausgabe
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // einfache aufsteigende Liste bauen (im anderen Algo immer Länge 1)
        for (int i = 1; i <= n; i++) {
            bw.write(i + (i == n ? "" : " "));
        }
        bw.newLine();

        // Puffer leeren und Daten schreiben
        bw.flush();
    }
}