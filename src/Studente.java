// Scrivi una classe Studente con i seguenti attributi: nome, cognome, età. 
// Implementa un costruttore che accetta tre parametri per inizializzare questi attributi. 
// Aggiungi un metodo che restituisca una stringa concatenata dei valori (es. Anselmo Bitta, 24 anni).

public class Studente {

    private String nome;
    private String cognome;
    private int età;

    public Studente (String nome, String cognome, int età) {
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
    }

    public String datiConcatenati() {
        return nome + ' ' + cognome + ", " + età + " anni";
    }
}



