public class Main {

    public static void main(String[] args) {
        
        Studente studente1 = new Studente("Pietro", "Ponte", 22);
        Studente studente2 = new Studente("Laura", "Parodi", 21);
        Studente studente3 = new Studente("Giacomo", "Rossi", 23);

        RegistroStudenti registro = new RegistroStudenti();

        registro.aggiungiStudente(studente1);
        registro.aggiungiStudente(studente2);
        registro.aggiungiStudente(studente3);

        registro.stampaStudenti();

        /* ContoBancario conto1 = new ContoBancario();

        System.out.println(conto1.depositaDenaro(325.00f));
        System.out.println(conto1.depositaDenaro(250.00f));
        System.out.println(conto1.depositaDenaro(723.50f));
        System.out.println(conto1.prelevaDenaro(150.00f)); */

        
    }
}
