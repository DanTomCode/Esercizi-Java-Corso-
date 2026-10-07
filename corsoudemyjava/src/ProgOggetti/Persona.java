package ProgOggetti;

// Una classe e' un modello dal quale possiamo creare oggetti.
public class Persona {
    // Questi attributi rappresentano i dati contenuti in ogni Persona.
    String nome;
    int anni;
    char sesso;

    // Il costruttore viene eseguito quando viene usato l'operatore new.
    // I parametri ricevuti vengono copiati negli attributi dell'oggetto.
    public Persona(String nomeP, int anniP, char sessoP) {
        nome = nomeP;
        anni = anniP;
        sesso = sessoP;
    }

    // Un metodo definisce un comportamento che l'oggetto puo' eseguire.
    public void stampa() {
        System.out.println("nome: " + nome + " | anni: " + anni + " | sesso: " + sesso);
    }

        public Persona(String nomeP, int anniP) {
        nome = nomeP;
        anni = anniP;
       
    }



}
