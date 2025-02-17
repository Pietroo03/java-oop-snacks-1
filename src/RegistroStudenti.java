// Crea una classe RegistroStudenti che rappresenti un registro di studenti. 
// Utilizza un array privato per memorizzare oggetti Studente. 
// Implementa un costruttore senza parametri per inizializzare il registro vuoto
// Un metodo pubblico per aggiungere studenti al registro. 
// Aggiungi un metodo che stampi la lista degli studenti.

public class RegistroStudenti {

    private Studente[] registro;

    public RegistroStudenti () {
        registro = new Studente[100];
    }

    private int counter = 0;

    public void aggiungiStudente(Studente studente) {
        if (counter < registro.length) {
            registro[counter] = studente;
            counter ++;
        } else {
            System.out.println("Registro pieno!");
        }
    }

    public void stampaStudenti() {
        if (counter == 0) {
            System.out.println("Nessun studente presente all'interno del registro");
        } else {
            for(int i = 0; i < counter; i++) {
                System.out.println(registro[i].datiConcatenati());
            }
        }
    }
}
