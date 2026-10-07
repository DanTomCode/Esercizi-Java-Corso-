package Ereditarietà;

// Classe base: raccoglie dati e comportamenti comuni agli animali.
public class Animale {
    int occhi;
    int bocca;
    int altezza;
    String nome;

    // Il costruttore assegna all'animale i valori ricevuti.
    public Animale(int occhi, int bocca, int altezza, String nome) {
        this.occhi = occhi;
        this.bocca = bocca;
        this.altezza = altezza;
        this.nome = nome;
    }

    // Comportamenti di base, che le sottoclassi possono ridefinire.
    public void corri() {
        System.out.println("Corro. . . Class: Animale");
    }

    public void parla() {
        System.out.println("Parlo. . . Class: Animale");
    }
}
