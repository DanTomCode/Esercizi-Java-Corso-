package ProgettoStudio;

public class Condizioni {
    public static void main(String[] args) {

        // Il valore scelto determina quale messaggio viene mostrato.
        int soldi = 30; // inizializzo la variabile soldi con il valore 30, quindi ho 30 euro

        // if/else confronta intervalli e sceglie una sola alternativa.
        if (soldi > 10) { //se i soldi sono maggiori di 10, quindi se ho più di 10 euro
            System.out.println("Posso comprarmi una pizza");
        } else if ((soldi >= 5) && (soldi <= 10)) { //se i soldi sono maggiori o uguali a 5 e minori o uguali a 10, quindi se ho tra i 5 e i 10 euro
            System.out.println("Posso comprarmi un panino"); 
        } else {
            System.out.println("Non posso comprarmi nulla");
        }

    // switch confronta un valore con i case; default copre tutti gli altri casi.
    switch (soldi)
{ 


    case 1: //se i soldi sono uguali a 1, quindi se ho 1 euro
        System.out.println("Hai 1 euro"); 
        break;


    case 2:
    System.out.println("Hai 2 euro");
    break;


    case 3:
    System.out.println("Hai 3 euro");
    break;


    case 4:
    System.out.println("Hai 4 euro");
    break;


    case 5:
    System.out.println("Hai 5 euro");
    break;


    case 6:
    System.out.println("Hai 6 euro");
    break;


    case 7:
    System.out.println("Hai 7 euro");
    break;


    default:  //se i soldi sono maggiori di 7, quindi se ho più di 7 euro
    System.out.println("Hai più di 7 euro");
    break;

}

    }
}

