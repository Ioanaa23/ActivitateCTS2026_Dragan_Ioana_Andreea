package CommandSTB;

public class main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        ICommand comanda = new ComandaPlecare(new Autobuz("mercedes"), 226);
        ICommand command = new ComandaPlecare(new Autobuz("toyota"), 165);

        operator.adaugaComanda(comanda);
        operator.adaugaComanda(command);
        operator.executaComanda();
        operator.executaComanda();
    }
}
