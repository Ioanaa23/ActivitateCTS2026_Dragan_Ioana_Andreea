package CommandSTB;

public class Autobuz {
    private String model;

    public Autobuz(String model) {
        this.model = model;
    }

    public void plecare(int nrLinie){
        System.out.println("Autobuzul " + model + " a plecat pe linia " + nrLinie);
    }
}
