// Crea una classe RegistroStudenti che rappresenti un registro di studenti. 
// Utilizza un array privato per memorizzare oggetti Studente. 
// Implementa un costruttore senza parametri per inizializzare il registro vuoto
// Un metodo pubblico per aggiungere studenti al registro. 
// Aggiungi un metodo che stampi la lista degli studenti.

public class RegistroStudenti {

    private Studente[] registro;

    public RegistroStudenti () {
        registro = new Studente[0];
    }

    public void aggiungiStudente(Studente studente) {
        Studente[] nuovoRegistro = new Studente[registro.length + 1];
        
        for (int i = 0; i < registro.length; i++) {
            nuovoRegistro[i] = registro[i];
        }
        nuovoRegistro[registro.length] = studente;
        registro = nuovoRegistro;
    }

    public void stampaStudenti() {
        if (registro.length == 0) {
            System.out.println("Nessun studente presente all'interno del registro");
        } else {
            for(int i = 0; i < registro.length; i++) {
                System.out.println(registro[i].datiConcatenati());
            }
        }
    }
}
