// Crea una classe ContoBancario con attributi per numero di conto e saldo. 
// Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero. 
// Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto e ottenere il saldo corrente.

import java.util.Random;

public class ContoBancario {

    private int numeroConto;
    private float saldo;

    public ContoBancario() {
        Random rand = new Random();
        this.numeroConto = rand.nextInt(999999);
        this.saldo = 0;
    }

    public float depositaDenaro(float denaroAggiunto) {
        this.saldo += denaroAggiunto;
        return this.saldo;
    }

    public float prelevaDenaro(float denaroPrelevato) {
        this.saldo -= denaroPrelevato;
        return this.saldo;
    }

}
