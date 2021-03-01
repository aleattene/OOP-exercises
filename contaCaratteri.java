/* VALUTAZIONI del numero di OCCORRENZE con cui
    ogni CARATTERE appartenente ad una STRINGA
    inserita dall'UTENTE, compare all'interno
    della STRINGA STESSA. */

import java.util.*;

public class contaCaratteri {
    public static void main(String[] args) {

        // predisposizione canale di COMUNICAZIONE INPUT
        Scanner input = new Scanner(System.in);

        // Dichiarazione VARIABILI / ARRAY
        String stringa;
        int occorrenze = 0;
        int dimArray;
        char[] arrayCaratteri; // array di caratteri

        // Acquisizione DATI (stringa) da INPUT UTENTE
        System.out.print("Inserire la STRINGA da ANALIZZARE: ");
        stringa = input.nextLine();

        input.close(); // chiusura canale di comunicazione INPUT

        // DIMENSIONAMENTO ARRAY
        dimArray = stringa.length();
        arrayCaratteri = new char[dimArray];

        // POPOLAMENTO ARRAY con i CARATTERI componenti la STRINGA
        for (int i = 0; i < dimArray; i++)
            arrayCaratteri[i] = stringa.charAt(i);

        // STAMPA a VIDEO delle VALUTAZIONI OCCORRENZE
        System.out.println("NUMERO OCCORRENZE: ");

        // ANALIZZO un CARATTERE alla VOLTA all'interno dell'ARRAY
        for (int i = 0; i < dimArray; i++) {
            occorrenze = 1; // ogni primo carattere è un'occorrenza

            // PER OGNI CARATTERE CONSIDERATO VERIFICO L'UGUAGLIANZA INTERNO ARRAY
            for (int j = i + 1; j < dimArray; j++) {
                if (arrayCaratteri[i] == arrayCaratteri[j])
                    occorrenze++; // se i caratteri sono uguali sale occorrenza
            }
            for (int k = 0; k < i; k++) {
                if (arrayCaratteri[i] == arrayCaratteri[k])
                    occorrenze = 0; // azzero perchè trattasi di carattere sicuramente
                                    // già valutato precedentemente
            }

            // STAMPA OCCORRENZE per OGNI CICLO FOR di VALUTAZIONE
            if (occorrenze > 0)
                System.out.println(arrayCaratteri[i] + " = " + occorrenze);
        }
    }
}
