package worksheet5.task1;

public class MatrixMultMain {
    public static void main(String[] args) {
        int[][] m1 = {  { 1, 2, 3, 4 }, 
                        { 4, 3, 2, 1 }, 
                        { 2, 2, 2, 2 } };
        int[][] m2 = { { 1, 2, 4 }, 
                       { 4, 2, 1 },
                       { 2, 2, 2 }, 
                       { 1, 1, 1 } };
        int[][] m3 = {{1,2}};
        int[][] m4 = {{5},
                      {7},
                      {0}};

        int[][] result = null;
        try {
            result = product(m2, m1);
        } catch (ArithmeticException e) {
            System.out.println("Unzulässige Größen der Spalten und Reihen");
        }
        if (result != null) {
            for (int i = 0; i < result.length; i++) {
                System.out.println();
                for (int j = 0; j < result[0].length; j++) {
                    System.out.print(result[i][j]+"   ");
                }
            }
        }
        System.out.println(m3[0][0]+m4[0][0]);

    }

    // Mit run() wird die Methode ohne neuen Thread aufgerufen. Dafür hätte man jede beliebige Methode machen
    // können. Nur mit start() wird ein neuer Thread erstellt und diese laufen parallel.

    // Es ergibt nicht viel Sinn hier Threads zu benutzen, da die Berechnung des Skalarproduktes schnell geht
    // und die Methode product parallel nicht wirklich eine Aufgabe hat außer zu warten bis alle Threads fertig 
    // sind. Es muss so oder so am Ende gewartet werden bis jedes Skalarprodukt berechnet wurde. Würde z.B. die
    // Main-Methode während der Berechnung etwas machen, dann könnte es sinnvoll sein dies als Thread zu verwenden.
    public static int[][] product(int[][] m1, int[][] m2) {
        if(m1[0].length != m2.length) throw new ArithmeticException();
        // Ergebnis ist Zeilen von m1 und Spalten von m2 groß
        int[][] result = new int[m1.length][m2[0].length];
        DotProductThread[][] t = new DotProductThread[m1.length][m2[0].length];
        // Alle Berechnungen der Zellen werden gestartet
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                t[i][j] = new DotProductThread(m1[i], spalteAlsArray(m2, j), result, i, j);
                t[i][j].start();
            }
        }

        // Prüfe, ob Threads noch arbeiten
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                if (t[i][j].isAlive()) {
                    try {
                        t[i][j].join();
                    } catch (InterruptedException e) {
                        System.out.println("Der Thread wollte eigentlich noch schlafen.");
                    }
                }
            }
        }
        return result;
    }

    private static int[] spalteAlsArray(int[][] m, int s) {
        int[] result = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            result[i] = m[i][s];
        }
        return result;
    }
}