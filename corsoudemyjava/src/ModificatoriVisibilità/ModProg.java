package ModificatoriVisibilità;

public class ModProg
{

    public static void main(String args[])
    {
        // Ogni nuovo oggetto aumenta di 1 il contatore static condiviso.
        /*ModificatoriVisibilità mod = new ModificatoriVisibilità();*/

        StaticClass staticclass1 = new StaticClass();
        // Stampa il valore del contatore dopo aver creato l'oggetto.
        System.out.println(staticclass1.getCounter());


        StaticClass staticclass2 = new StaticClass();
        System.out.println(staticclass2.getCounter());

        StaticClass staticclass3 = new StaticClass();
        System.out.println(staticclass3.getCounter());

        

    }


}
