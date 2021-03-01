/* Semplice CONCATENAZIONE di due SOTTOSTRINGHE,
    ricavate da una STRINGA inserita dall'UTENTE.

    Il punto di TAGLIO (pre e post) viene deciso 
    dall'UTENTE stesso. Ad esempio di fronte alla STRINGA:
                
                CIAO SONO SANDRA
    
    se l'utente decide di effettuare il TAGLIO
    a partire dal 13° carattere e sino al 14°, 
    ottiene la NUOVA STRINGA:
                
                  CIAO SONO SARA 
    
    quale concatenazione delle due SOTTOSTRINGHE
            
                "CIAO SONO SA" + "RA" */

import java.util.*;

public class tagliaStringa {
    public static void main(String[] args) {

        // Predisposizione canale di comunicazione INPUT
        Scanner input = new Scanner(System.in);

        // Dichiarazione VARIABILI
        String stringa;
        String substring1, substring2;
        int startCut, stopCut, range;

        // Acquisizione DATI da INPUT UTENTE
        System.out.print("\nInserire la STRINGA: ");
        stringa = input.nextLine();
        range = stringa.length();

        System.out.print("Inserire PUNTO INIZIO TAGLIO (tra 1 e " + range + " ): ");
        startCut = input.nextInt();

        System.out.print("Inserire PUNTO FINE TAGLIO (tra " + startCut + " e " + range + " ): ");
        stopCut = input.nextInt();

        input.close(); // chiusura canale di comunicazione INPUT

        // Estrazione SUBSTRINGS e conseguente CONCATENAZIONE
        substring1 = stringa.substring(0, startCut - 1);
        substring2 = stringa.substring(stopCut, range);

        System.out.println("\nNUOVA STRINGA -> " + substring1 + substring2 + "\n");
    }
}