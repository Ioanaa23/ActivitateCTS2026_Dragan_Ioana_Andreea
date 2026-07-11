package CommandSTB;

public class ComandaPlecare implements ICommand{
    private Autobuz autobuz;
    private int nrLinie;

    public ComandaPlecare(Autobuz autobuz, int nrLinie) {
        this.autobuz = autobuz;
        this.nrLinie = nrLinie;
    }

    @Override
    public void executa() {
        autobuz.plecare(nrLinie);
    }
}
