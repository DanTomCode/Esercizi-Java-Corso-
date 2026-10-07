package ModificatoriVisibilità;

public class ModificatoriVisibilità 
{
   private String nome;
   private String cognome;
   protected String secondoNome;

   private void stampa(String mes)
   {
      System.out.println(mes);
   }
   
   public void stampaMes()
   {
     System.out.println("sei nella classe modificatori");
     stampa("sei nella classe modificatori");
   }

}
