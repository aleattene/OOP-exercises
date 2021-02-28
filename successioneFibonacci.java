/* Stampa a video della SUCCESSIONE DI FIBONACCI
    sino al termine "n(esimo)" scelto dall'UTENTE.
    SUCCESSIONE di FIBONACCI definita nel seguente modo:
    - F(1) = 1
    - F(2) = 1
    - F(n) = F(n-1) + F(n-2)
    
    Quindi la successione è composta nel seguente modo:
    1,1,2,3,5,8,13,21,34,55,89,144,233,377, ......  */

    import java.util.*;

    public class successioneFibonacci {
    
        // definizione METODO RICORSIVO
        public static int fibonacci(int n) {
            if (n == 1 || n == 2)
                return 1; // caso base
            else
                return fibonacci(n - 1) + fibonacci(n - 2); // caso ricorsivo
        }
    
        // definizione metodo MAIN
        public static void main(String[] args) {
    
            // Predisposizione canale di comunicazione INPUT
            Scanner input = new Scanner(System.in);
    
            // Dichiarazione VARIABILI
            int numseq;
            do {
                System.out.print("TERMINI della SUCCESSIONE da generare? ");
                numseq = input.nextInt();
    
                if (numseq <= 0)
                    System.out.println("Valore non consentito in quanto minore o uguale a zero. Riprovare.)");
            } while (numseq <= 0);
    
            input.close(); // chiusura canale di comunicazione INPUT
    
            for (int i = 1; i <= numseq; i++)
                System.out.println("F[" + i + "] vale " + fibonacci(i));
            System.out.print("Quindi SUCCESSIONE di FIBONACCI (con n = " + numseq + ") ->  ");
            for (int i = 1; i <= numseq; i++)
                System.out.print(fibonacci(i) + "  ");
        }
    } 