public class Main {

    public static void main(String[] args) {
        
        Studente studente1 = new Studente("Pietro", "Ponte", 22);

        System.out.println(studente1.datiConcatenati());

        ContoBancario conto1 = new ContoBancario();

        System.out.println(conto1.depositaDenaro(325.00f));
        System.out.println(conto1.depositaDenaro(250.00f));
        System.out.println(conto1.depositaDenaro(723.50f));
        System.out.println(conto1.prelevaDenaro(150.00f));
    }
}
