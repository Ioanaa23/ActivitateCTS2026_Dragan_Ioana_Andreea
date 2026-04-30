package Flyweight.main;

import Flyweight.clase.Autobuz;
import Flyweight.clase.ManagerLinie;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz101 = new Autobuz("Mercedez", 1999, 50);
        Autobuz autobuz102 = new Autobuz("Opel", 2004, 30);
        Autobuz autobuz202 = new Autobuz("Porsche", 1989, 60);

        ManagerLinie managerLinie = new ManagerLinie();
        managerLinie.getLinie(101, "Romana", "Universitate").nrMaximPasageriPeLinie(autobuz101);
        managerLinie.getLinie(101, "Romargvhewjkna", "qewrehgrhj").descriereLinie(autobuz101);


    }
}
