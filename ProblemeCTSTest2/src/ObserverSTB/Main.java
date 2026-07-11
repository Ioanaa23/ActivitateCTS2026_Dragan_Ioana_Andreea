package ObserverSTB;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz();
        Calator calator = new CalatorAbonat("alina");
        Calator calator1 = new CalatorAbonat("ana");

        autobuz.aboneaza(calator);
        autobuz.aboneaza(calator1);

        autobuz.trimiteMesaj("Autobuzul pleaca din statie!");

        autobuz.dezaboneaza(calator);
        autobuz.trimiteMesaj("Autobuzul a plecat din statie");
    }
}
