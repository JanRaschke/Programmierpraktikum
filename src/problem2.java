
import edu.princeton.cs.algs4.*;

public class problem2 {

    public static void main(String[] args) {
        if (StdIn.isEmpty()) {
            return;
        }

        //Einlesen mit Hilfe von Library in Array 
        int n = StdIn.readInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = StdIn.readInt();
        }

        //Erstellen Tabelle 2 Dim für Paarberechnung
        int[][] table = new int[n][n];

        //Befüllen Tabelle mit Länge 1 jedes Elem zeigt auf sich selber 
        for (int i = 0; i < n; i++) {
            table[i][i] = input[i];
        }

        //Anfang Länge 2 bis Länge n
        for (int len = 2; len <= n; len++) {

            //Start- Endindizes setzen
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                //Speicher für max wert mit Min damit auf jeden fall alles größer ist 
                int maxVal = Integer.MIN_VALUE;

                //Trennpunkt finden 
                for (int k = i; k < j; k++) {

                    //Möglichkeiten berechen auf Basis von k(Trennpunkt)
                    int val = (table[i][k] + table[k + 1][j]) / 2;

                    //Werte Vergleich
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