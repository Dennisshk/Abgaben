package worksheet4.task3;

public class Calculator {
    public static double divide1(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    public static double divide2(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        // Exception handling in method
        double d1 = Calculator.divide1(3, 0);
        System.out.println(d1);

        // Delegated Exception Handling
        try {
            double d2 = Calculator.divide2(3, 0);
            System.out.println(d2);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        /*
         * Variante 2 ist sinnvoller, da aus der Methode entweder eine Zahl oder die
         * Exception gegeben wird. Dies lässt sich in der aufzurufenden Methode
         * unterscheiden.
         * Bei Variante 1 muss die Methode trotzdem eine Zahl zurückgeben. Da dividieren
         * alle Zahlen als Ergebnis haben kann, gibt es keine eindeutige Möglichkeit zu
         * zeigen, dass die Division nicht geht.
         */
        /*
         * Beim Berechnen einer Wurzel wäre Variante 1 sinnvoller, da -1 bei falscher
         * Eingabe zurückgegeben werden kann, was dann auf einen Fehler verweist.
         * Oder bei Methoden welche Strings zurückgeben, da dort auch direkt
         * die Fehlermeldung gegeben werden kann.
         */
    }
}
