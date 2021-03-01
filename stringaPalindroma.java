/* Viene effettuata la VERIFICA circa il fatto che 
    una STRINGA inserita dall'UTENTE sia PALINDROMA o MENO.

    Ad esempio:
    - ANNA -> è una stringa PALINDROMA
    - ATTO -> NON è una stringa PALINDROMA 
    
    N.B.: PALINDROMA -> la stringa può essere letta
        indistintamente da Dx verso SX o da SX verso DX */

import java.util.*;

public class stringaPalindroma {
    public static void main(String[] args) {

        // Predisposizione canale di comunicazione INPUT
        Scanner input = new Scanner(System.in);

        // Dichiarazione VARIABILI
        boolean palindroma = true;
        String stringa;
        int sx, dx;

        // Acquisizione STRINGA da valutare -> da INPUT UTENTE
        System.out.print("Inserire la STRINGA da VALUTARE: ");
        stringa = input.nextLine();

        input.close(); // chiusura canale di comunicazione INPUT

        /*
         * Ciclo FOR con DOPPIA VARIABILE di CONTROLLO - sx si incrementa ad ogni
         * iterazione - dx si decrementa a sua volta ad ogni iterazione
         */
        for (sx = 0, dx = stringa.length() - 1; sx < dx; sx++, dx--)
            if (stringa.charAt(sx) != stringa.charAt(dx)) { // carattere SX diverso da DX
                palindroma = false;
                break;
            }

        // STAMPA a VIDEO RISULTATO FINALE (Stringa PALINDROMA Si/No)
        if (palindroma) // palindroma == true
            System.out.println("\nSTRINGA \"" + stringa + "\" -> PALINDROMA\n");
        else
            System.out.println("\nSTRINGA \"" + stringa + "\" -> NON PALINDROMA\n");
    }
}