package ModificatoriVisibilità;

public class StaticClass 
{
    
     // Con static il contatore appartiene alla classe ed è condiviso da tutti gli oggetti.
     // Ogni nuovo oggetto lo aumenta di 1, quindi i valori stampati sono 1, 2 e 3.
     private static int counter = 0;

     public StaticClass()
     {
       counter++;
     }

     public static int getCounter() {
         return counter;
     }

   





}
