package ProgettoStudio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayListArray 
{

    public static void main(String[] args) {
 
// Un array ha dimensione fissa e gli elementi si raggiungono con un indice da 0.
int arraynumeriInteri[] = new int[5];      //new, parola chiave che serve per creare un nuovo oggetto, in questo caso un array di 5 elementi
String arraynomi[] = new String[]{"ciao", "hello", "goodmorning"   };      //new, parola chiave che serve per creare un nuovo oggetto, in questo caso un array di 5 elementi

// Assegna valori ad alcune posizioni e stampa anche un elemento ancora vuoto (vale 0).
arraynumeriInteri[0] = 5;       // il numero di valori è 5, quindi 5 variabili nell'array, da 0 a 4 sono 5 
arraynumeriInteri[4] = 1056;



System.out.println(arraynumeriInteri[0]);      //il valore 5 viene stampato
System.out.println(arraynumeriInteri[4]);      //il valore 1056 viene stampato
System.out.println(arraynumeriInteri[1]);      //il valore 0 viene stampato



// Una lista può crescere: add aggiunge elementi e get li legge tramite indice.
List<String> listanomi = new ArrayList<>();    //creo un arraylist di stringhe, quindi una lista di nomi
listanomi.add("Daniele");                   //aggiungo nomi alla lista
listanomi.add("Giovanni"); 
listanomi.add("Sara"); 
listanomi.add("Paola"); 

System.out.println(listanomi.get(0));       //stampo il primo nome della lista, quindi Daniele
System.out.println(listanomi.get(3)); 





// Una mappa associa una chiave a un valore; put salva e get cerca per chiave.
HashMap<String, String> hashmap = new HashMap<>();    //creo un hashmap, quindi una mappa di chiavi e valori, in questo caso le chiavi e i valori sono stringhe
hashmap.put("key1", "chiave ingresso");
hashmap.put("key2", "chiave cancello");

System.out.println(hashmap.get("key1"));         //stampo il valore della chiave key1, quindi chiave ingresso
System.out.println(hashmap.get("key2"));         //stampo il valore della chiave key2, quindi chiave cancello








    }
  
    





}
