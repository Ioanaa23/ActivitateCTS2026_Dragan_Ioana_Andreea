package ObserverSTB;

public class CalatorAbonat implements Calator{
    private String nume;

    public CalatorAbonat(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println(this.nume + " ai primit mesaj: " + mesaj);
    }
}
