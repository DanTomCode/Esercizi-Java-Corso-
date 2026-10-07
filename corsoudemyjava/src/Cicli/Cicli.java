package ProgettoStudio;

public class Cicli {

    public static void main(String[] args) {
        // Array da scorrere e contatore che indica la posizione corrente.
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int leggo;
        int i = 0;

        // Il ciclo for si usa quando conosci in anticipo il numero di iterazioni.
        /*for (int i = 0; i < array.length; i++) {
            // esegue il corpo finché i è minore della lunghezza dell'array
        }*/

        // while: controlla la condizione prima di eseguire il corpo.
        while (i < array.length) {
            leggo = array[i]; // legge valore corrente dell'array
            if (leggo == 8) {
                System.out.println("valore trovato nella posizione:" + i);
            }
            i++; // aggiorna il contatore per passare al prossimo elemento
        }

        // do-while: esegue almeno una volta, poi controlla la condizione.
        // Per ripetere la ricerca, i va riportato a 0 prima di questo ciclo.
        // In questo esempio i è già array.length: così com'è, la prima lettura esce dall'array.
        do {
            leggo = array[i];
            if (leggo == 8) {
                System.out.println("valore trovato nella posizione:" + i);
            }
            i++;
        } while (i < array.length);

    }
}
