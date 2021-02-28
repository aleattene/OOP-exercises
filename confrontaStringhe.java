/* CONFRONTO tra DUE STRINGHE inserite dall'UTENTE.
    Il RISULTATO FINALE ci dice quale sia la STRINGA di 
    DIMENSIONE MAGGIORE oppure l'UGUAGLIANZA tra le stesse*/

import java.util.*;

public class confrontaStringhe {

    public static void main(String[] args) {

        // Predisposizione canale comunicazione INPUT
        Scanner input = new Scanner(System.in);

        // DICHIARAZIONE VARIABILI
        String stringa1, stringa2;

        // Acquisizione stringhe da INPUT UTENTE
        System.out.print("\nInserire PRIMA STRINGA: ");
        stringa1 = input.nextLine();

        System.out.print("Inserire SECONDA STRINGA: ");
        stringa2 = input.nextLine();

        input.close(); // chiusura canale di comunicazione INPUT

        // CONFRONTO e Stampa della stringa più lunga
        if (stringa1.length() > stringa2.length())
            System.out.println("\nSTRINGA PIU' LUNGA -> la PRIMA (" + stringa1.length() + " caratteri vs "
                    + stringa2.length() + ") -> " + stringa1);
        
        else if (stringa1.length() < stringa2.length())
            System.out.println("\nSTRINGA PIU' LUNGA -> la SECONDA (" + stringa2.length() + " caratteri vs "
                    + stringa1.length() + ") -> " + stringa2);
    
        else
            System.out.println("\nLe STRINGHE inserite hanno la STESSA LUNGHEZZA (" + 
                    stringa1.length() + " caratteri).");
    }
}