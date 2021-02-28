/* CALCOLO e STAMPA della MEDIA ARITMETICA
    di 5 numeri inseriti dall'UTENTE. 
    
    N.B Se si volessero aumentare o diminuire i numeri
        su cui calcolare la MEDIA ARITMETICA,
        basterà modificare il valore della variabile "numeri".
    
    P.S.: in fase di inserimento, per i numeri decimali 
        usare la virgola e non il punto */

import java.util.*;

public class mediaAritmetica {

    public static void main(String[] args) {

        // Predisposizione canale di comunicazione INPUT
        Scanner input = new Scanner(System.in);

        // Dichiarazione VARIABILI
        int numeri = 5;
        double numInserito, somma = 0;

        // Acquisizione DATI UTENTE
        for (int i = 1; i <= numeri; i++) {
            System.out.print(1 + "° numero? ");
            numInserito = input.nextDouble();
            somma = somma + numInserito;
        }

        input.close(); // Chiusura canale di comunicazione INPUT

        // Stampa a Video della MEDIA CALCOLATA
        System.out.println("\nMEDIA = " + somma / numeri); // risultato DOUBLE
    }
}