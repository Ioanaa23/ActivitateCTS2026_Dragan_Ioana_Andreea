package ChainSTB;

public abstract class Handler {
    private Handler succesor;

    public Handler() {
        this.succesor = succesor;
    }

    public Handler getSuccesor() {
        return succesor;
    }

    public void setSuccesor(Handler succesor) {
        this.succesor = succesor;
    }
    public abstract String recomandaCalatorie(double distanta);
}
