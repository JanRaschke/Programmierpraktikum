import java.io.*;
import java.util.*;

public class problem4 {
    public static void main(String[] args) throws Exception {
        // Schnelles Einlesen über BufferedReader initialisieren
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.trim().isEmpty())
            return;

        // Erste Zeile parsen (enthält N und K)
        StringTokenizer st = new StringTokenizer(line);
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // Schnelle Ausgabe über BufferedWriter initialisieren
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Für den Spezialfall B_i = 1: Ausgabe von 1 bis N (streng aufsteigend)
        for (int i = 1; i <= n; i++) {
            bw.write(i + (i == n ? "" : " "));
        }
        bw.newLine();

        // Puffer leeren und Daten schreiben
        bw.flush();
    }
}