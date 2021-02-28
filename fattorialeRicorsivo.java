/* Calcolo del FATTORIALE di un numero fornito dall'UTENTE.

    Ad esempio il fatoriale di 5 dovrà essere pari a 120 in quanto:
            fattoriale(5) = 5 x 4 x 3 x 2 x 1 = 120 
            fattoriale(10) = 10 x 9 x 8 x 7 x 6 x 120 = 3.628.800 */

import java.util.*;

public class fattorialeRicorsivo {

    // Definizione del METODO RICORSIVO
    public static int fattoriale(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * fattoriale(n - 1);
    }

    // Main
    public static void main(String[] args) {

        // Predisposizione canale di comunicazione INPUT
        Scanner input = new Scanner(System.in);

        // Dichiarazione VARIABILE
        int num;

        do {
            System.out.print("Inserire il NUMERO di cui si vuole calcolare il FATTORIALE: ");
            num = input.nextInt();
        } while (num < 0);

        input.close(); // chiusura canale di comunicazione INPUT

        // STAMPA a VIDEO del RISULTATO
        System.out.println("FATTORIALE di " + num + " = " + fattoriale(num));
    }
}