/* VALUtAZIONE circa il fatto che un NUMERO
    inserito dall'UTENTE, sia PRIMO o meno */

import java.util.*;

public class numeroPrimo {
    public static void main(String[] args) {

        // Predisposizione canale comunicazione INPUT
        Scanner input = new Scanner(System.in);

        // Dichiarazione VARIABILI
        int numEsame;
        boolean primo = false;

        // Acquisizione DATI INPUT UTENTE
        do {
            System.out.print("Inserire NUMERO da VERIFICARE (valore minimo 1): ");
            numEsame = input.nextInt();
            if (numEsame <= 0)
                System.out.println("VALORE NON CONSENTITO. Riprovare!!!");
        } while (numEsame <= 0);

        // CASO Numero = 1 -> primo per definizione
        if (numEsame == 1)
            primo = true;

        // CASISTICA Numeri > 1
        for (int i = 2; i < numEsame; i++) {
            if ((numEsame % i) == 0) {
                primo = false;
                break;
            } else
                primo = true;
        }

        input.close(); // chiusura canale di comunicazione INPUT

        // STAMPA RISULTATO VALUTAZIONE (Numero PRIMO Si/No)
        if (primo)
            System.out.println("\nNUMERO " + numEsame + " = numero PRIMO");
        else
            System.out.println("\nNUMERO " + numEsame + " = NON PRIMO");
    }
}
