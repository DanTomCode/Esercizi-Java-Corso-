package Polimorfismo;

import java.util.ArrayList;
import java.util.List;

// Esempio in preparazione sul polimorfismo tramite sovraccarico dei metodi.
public class Polimorfismo 
{
    // Queste versioni hanno lo stesso nome ma parametri diversi.
    public void inizializzaPersona(String nome)
    {
       

    }
    // Ogni overload aggiunge un dato rispetto alle versioni precedenti.
    public void inizializzaPersona(String nome, int età)
    {
       

    }
    public void inizializzaPersona(String nome, int età, char sesso)
    {
       

    }
    public void inizializzaPersona()
    {
       

    }
    // List descrive il tipo della lista; ArrayList è la classe che la crea.
    // In Java maiuscole e minuscole contano: i nomi corretti sono List e ArrayList.
    List<String> liste = new ArrayList<>();
    
}
