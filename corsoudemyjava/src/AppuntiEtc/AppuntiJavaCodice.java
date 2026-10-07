package AppuntiEtc;

public class AppuntiJavaCodice {
    public static void main(String[] args) {
        // Dichiarazione variabili
        // Una variabile può essere dichiarata prima di assegnarle un valore.
        String saluto = "Hello World!";
        String saluto2;

        // Assegnazione variabile
        saluto2 = "Ciao Mondo!";

        // Tipi interi di dimensioni diverse: long usa il suffisso L.
        int numeroIntero = 2045645156;
        long numeroInteroGrande = 28456451564564856L;
        short numeroInteroCorto = 456;
        byte numeroInteroMoltoPiccolo = 1;

        // Tipi decimali: float richiede il suffisso f.
        float numeroVirgolaMobile = 15.6f;
        double numeroGrandeVirgolaMobile = 456.456;

        // char contiene un singolo carattere; boolean un valore true o false.
        char carattere = '%';

        boolean isTrue = true;

        // Unisce più valori in una stringa e la stampa.
        System.out.println(saluto2 + numeroIntero + " " + numeroVirgolaMobile + carattere);
    }
}
