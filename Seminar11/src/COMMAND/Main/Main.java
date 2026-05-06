package COMMAND.Main;

import COMMAND.Clase.Autobuz;
import COMMAND.Clase.Command;
import COMMAND.Clase.Operator;
import COMMAND.Clase.Plecare;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        Command comandaa1 = new Plecare(new Autobuz("Mercedes"), 223);
        Command comanda2 = new Plecare(new Autobuz("AUDI"), 226);

        operator.adaugaComanda(comandaa1);
        operator.adaugaComanda(comanda2);

        operator.adaugaComanda(new Plecare(new Autobuz("Opel"), 187) );

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();

    }
}
