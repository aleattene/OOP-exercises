/* CALCOLO e STAMPA del MASSIMO COMUN DIVISORE
    tra 2 numeri, inseriti dall'UTENTE. */

import java.util.*;

public class massimoComunDivisore {

    // Definizione METODO RICORSIVO
    public static int mcdRicorsivo(int n1, int n2) {
        if (n2 == 0)
            return n1; // caso base
        else
            return mcdRicorsivo(n2, n1 % n2); // caso ricorsivo
    }

    // Definizione metodo MAIN
    public static void main(String[] args) {

        // Predisposizione canale di comunicazione INPUT
        Scanner input = new Scanner(System.in);

        // Acquisizione DATI inseriti dall'UTENTE
        int num1, num2;
        do {
            System.out.print("Inserire il PRIMO NUMERO (positivo > 0): ");
            num1 = input.nextInt();
            System.out.print("Inserire il SECONDO NUMERO (positivo > 0): ");
            num2 = input.nextInt();
            if (num1 <= 0 || num2 <= 0)
                System.out.println("Inserimento VALORI NON CONSENTITI. Riprovare.");
        } while (num1 <= 0 || num2 <= 0);

        input.close(); // chiusura canale di comunicazione INPUT

        System.out.println("M.C.D. tra " + num1 + " e " + num2 + " = " + mcdRicorsivo(num1, num2));
    }
}