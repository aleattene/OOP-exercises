/* Implementazione della seguente FUNZIONE:
    F(x,y) = 0 , se y = 0
    F(x,y) = x + F(x,y-1) , se y > 0

    Ad esempio, se x = 5 e y = 3 avremo i seguenti 4 casi ricorsivi:
    1) return 5 + somma(5,2)
        2) return 5 + somma(5,1)
            3) return 5 + sommaRicorsiva (5,0)
                4) return 0
    Il risultato finale sarà quindi pari a -> 5 + 5 + 5 + 0 = 15*/

import java.util.*;

public class sommaRicorsiva {

    // Definizione del METODO RICORSIVO
    public static int somma(int x, int y) { // come argomenti ho due interi
        if (y == 0)
            return 0; // caso base
        else
            // System.out.println(x); Decommentare per eventuale miglior comprensione
            return x + somma(x, y - 1); // caso ricorsivo
    }

    // Metodo MAIN
    public static void main(String[] args) {

        // Predisposizione del canale di INPUT
        Scanner input = new Scanner(System.in);

        // Dichiarazioni VARIABILI
        int num1, num2;

        do {
            System.out.print("Inserisci il valore di x: ");
            num1 = input.nextInt();
            System.out.print("Inserisci il valore di y: ");
            num2 = input.nextInt();
        } while (num1 < 0 || num2 < 0); // Richiedi se non sono entrambi numeri positivi

        input.close(); // Chiusura del canale di comunicazione INPUT

        // STAMPA del RISULTATO FINALE
        System.out.println("RISULTATO FINALE = " + somma(num1, num2));
    }
}
