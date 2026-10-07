package Incapsulamento;
public class Incapsulamento
{
    // Incapsulamento = nascondere i dati.
    // I campi sono privati, quindi non si possono usare direttamente fuori dalla classe.
    // Per leggere o cambiare i dati usiamo getter e setter.

    private String nome;
    private int età;

    // Getter: legge il valore del campo privato.
    public String getNome()
    {
        return nome;
    }

    // Setter: cambia il valore del campo privato.
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getEtà()
    {
        return età;
    }

    // Rifiuta le età minori o uguali a 18 e mostra l'età accettata.
    // In questo setter controllo il valore prima di salvarlo.
    public void setEtà(int età) {
        if (età > 18) {
            this.età = età;
        } else {
            System.out.println("sei troppo piccolo per giocare  :(");
        }
    }

    public static void main(String[] args)
    {
        // Crea l'oggetto, imposta l'età e la legge tramite il getter.
        Incapsulamento inc = new Incapsulamento();

        inc.setEtà(20);

        System.out.println(inc.getEtà());
    }
   
      

        
   }

