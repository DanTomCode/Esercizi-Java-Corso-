[README.md](https://github.com/user-attachments/files/33168280/README.md)
# Studio di Java

In `src` raccolgo esempi pratici per imparare variabili, condizioni, cicli, array e collezioni, metodi, classi e oggetti, incapsulamento, ereditarietà e polimorfismo. Gli esercizi dichiarano dati, eseguono operazioni e spesso mostrano il risultato con `System.out.println`.

## Cartelle e file

### `ProgOggetti`
- `Persona.java`: classe con dati, costruttori e metodo per stampare una persona.
- `PersonaProg.java`: crea una persona e usa il suo metodo.
- `Persona.class`, `PersonaProg.class`: versioni compilate; non sono sorgenti da modificare e potrebbero essere datate.

### `ProgettoStudio`
- `Prova.java`: stampa esempi di numeri, testo e caratteri.
- `AppuntiJavaCodice.java`: appunti sui tipi di dato e sulle variabili.
- `Condizioni.java`: esempi di `if` e `switch`.
- `Cicli.java`: ricerca in un array con cicli `while` e `do-while`; il secondo ciclo tenta di leggere oltre la fine dell'array.
- `ArrayListArray.java`: esempi di array, `ArrayList` e `HashMap`.
- `Metodi.java`: metodi per calcolare un quadrato e stampare testo.
- `Principale.java`: crea un oggetto `Metodi` e ne prova i metodi.
- `Metodi.class`, `Principale.class`: versioni compilate, non sorgenti da modificare.

### `Ereditarietà`
- `Animale.java`: classe base con dati e metodi per correre e parlare.
- `Cane.java`: estende `Animale` e ridefinisce i suoi metodi.
- `AnimaleProg.java`: crea un cane e prova il metodo `corri()`.

### `Polimorfismo`
- `Polimorfismo.java`: appunti sul sovraccarico dei metodi; è incompleto e al momento non compila.

### `com/daniele/corsoudemyjava/metodi/Incapsulamento`
- `Incapsulamento.java`: usa campi privati, getter e setter; il setter dell’età accetta solo valori maggiori di 18.

## Compilazione

I file `.java` sono il codice sorgente; i `.class` sono generati dal compilatore. La compilazione di tutti gli esempi richiede di completare `Polimorfismo.java`; per eseguire `Cicli.java` va corretto l’accesso fuori dai limiti dell’array.

## GitHub

Ho usato `.gitignore` per escludere i file compilati `.class` e la cartella `out`, mantenendo nel progetto da condividere su GitHub i file sorgente e gli altri contenuti utili.
