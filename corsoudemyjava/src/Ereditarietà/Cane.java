package Ereditarietà;

// Cane eredita dati e comportamenti dalla classe Animale.
public class Cane extends Animale {
    int altezza;
    String nome;

    // super inizializza anche la parte ereditata da Animale.
    public Cane(int altezza, String nome) {
        super(2, 1, altezza, nome);
        this.altezza = altezza;
        this.nome = nome;
    }

    // Ridefinisce la corsa: esegue il comportamento base e poi stampa quello del cane.
    @Override
    public void corri() {
        super.corri();
        System.out.println("cane corre");
    }

    // Ridefinisce il parlare, richiamando per ora il comportamento di Animale.
    @Override
    public void parla() {
        super.parla();
    }
}
