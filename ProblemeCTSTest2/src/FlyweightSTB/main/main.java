package FlyweightSTB.main;

import FlyweightSTB.clase.Autobuz;
import FlyweightSTB.clase.ManagerLinie;

public class main {
    public static void main(String[] args) {
        Autobuz autobuz226 = new Autobuz("opel", 1999, 30);
        Autobuz autobuz168 = new Autobuz("honda", 1872, 49);
        Autobuz autobuz385 = new Autobuz("mercedes", 1997, 38);

        ManagerLinie managerLinie = new ManagerLinie();
        managerLinie.getLinie(168, "Unirii", "Romana").descriereLinie(autobuz168);
        managerLinie.getLinie(226, "Sebastian", "Romana").descriereLinie(autobuz226);
        managerLinie.getLinie(385, "romana", "universitate").nrMaximPasageriPeLinie(autobuz385);
    }
}
