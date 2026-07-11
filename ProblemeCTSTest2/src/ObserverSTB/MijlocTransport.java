package ObserverSTB;

public interface MijlocTransport {
    void trimiteMesaj(String mesaj);
    void aboneaza(Calator calator);
    void dezaboneaza(Calator calator);
}
