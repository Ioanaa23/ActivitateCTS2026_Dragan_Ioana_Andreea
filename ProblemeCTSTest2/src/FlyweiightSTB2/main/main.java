package FlyweiightSTB2.main;


import FlyweiightSTB2.clase.Autobuz;
import FlyweiightSTB2.clase.Fabrica;

public class main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("cdesgvh", 1872, 8);
        Autobuz autobuz1 = new Autobuz("avdyubhjk", 1999, 11);
        Autobuz autobuz2 = new Autobuz("afwewaSWAS", 1978, 97);

        Fabrica fabrica = new Fabrica();
        fabrica.getLinie(226, "romana", "univ").descriere(autobuz);
    }
}
