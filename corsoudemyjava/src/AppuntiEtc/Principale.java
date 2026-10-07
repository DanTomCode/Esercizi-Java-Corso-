package ProgettoStudio;

public class Principale {
  public static void main(String[] args) {
    // Crea l'oggetto che contiene i metodi da provare.
    Metodi metodi = new Metodi();

    // Salva il quadrato di 5 e poi lo stampa.
    int dato = metodi.potenzaAlQuadrato(5);

    System.out.println(metodi.potenzaAlQuadrato(5));

    // Chiama il metodo che stampa una frase.
    metodi.stampa("Ciao Mondo");



  }
}
