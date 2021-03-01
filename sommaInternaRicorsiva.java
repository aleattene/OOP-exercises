/* Implementazione di una FUNZIONE RICORSIVA, che SOMMA tutti i 
    numeri compresi tra due NUMERI INSERITI dall'UTENTE.

    Ad esempio, se l'utente inserisce i NUMERI:
                    
                    N1 = 5
                    N2 = 10
    
    avremo i seguenti 4 casi ricorsivi:
    1) return 5 + somma(6,10)
        2) return 6 + somma(7,10)
            3) return 7 + somma(8,10)
                3) return 8 + somma(9,10)
                    3) return 9 + somma(10,10)
                        4) return 10
    
    Il RISULTATO FINALE sarà quindi pari a:
        
            5 + 6 + 7 + 8 + 9 + 10 = 45*/

import java.util.*;

public class sommaInternaRicorsiva {

    // Definizione METODO RICORSIVO
    public static int somma(int n1, int n2) {
        if (n1 == n2)
            return n1; // caso base
        else
            return n1 + somma(n1 + 1, n2); // caso ricorsivo
    }

    public static void main(String[] args) {

        // Predisposizione canale di comunicazione INPUT
        Scanner input = new Scanner(System.in);

        // Acquisizione DATI da INPUT UTENTE
        int num1, num2;
        System.out.println("Inserire DUE NUMERI INTERI N1 e N2 (con N1 < N2)!!!");

        do {
            System.out.print("Inserire il valore di N1: ");
            num1 = input.nextInt();
            System.out.print("Inserire il valore di N2: ");
            num2 = input.nextInt();
        } while (num1 >= num2 || num1 < 0 || num2 < 0);

        input.close(); // chiusura canale di comunicazione INPUT

        // STAMPA a VIDEO del RISULTATO FINALE
        System.out.println("RISULTATO FINALE = " + somma(num1, num2));
    }
}