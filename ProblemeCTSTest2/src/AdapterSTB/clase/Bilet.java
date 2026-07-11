package AdapterSTB.clase;

public class Bilet {
    private String tip;
    private int id;

    public Bilet(String tip, int id) {
        this.tip = tip;
        this.id = id;
    }

    public String getTip() {
        return tip;
    }

    public int getId() {
        return id;
    }
}
