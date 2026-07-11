package ProxySTB2.main;

import ProxySTB2.clase.Autobuz;
import ProxySTB2.clase.AutobuzNoapte;

public class main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(226);

        AutobuzNoapte autobuzNoapte = new AutobuzNoapte(autobuz, 3);
        AutobuzNoapte autobuzNoapte1 = new AutobuzNoapte(new Autobuz(233), 0);

        autobuzNoapte.opresteInStatie("romana");
        autobuzNoapte1.opresteInStatie("universitate");
    }
}
