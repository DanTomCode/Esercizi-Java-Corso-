package ProgOggetti;

public class PersonaProg {
    public static void main(String[] args) {
        // new crea un oggetto Persona e richiama il suo costruttore.
        Persona persona1 = new Persona("Marco", 53, 'm');

        // Attraverso la variabile persona1 richiamiamo un metodo dell'oggetto.
        persona1.stampa(); 
    }
}

