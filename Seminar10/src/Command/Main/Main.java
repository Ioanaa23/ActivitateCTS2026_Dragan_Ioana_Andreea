package Command.Main;

import Command.Clase.*;

public class Main {
    public static void main(String[] args) {
        PersonalSpital medic = new Medic("Popescu");
        PersonalSpital asistenta = new Asistent("Adela");

        Pacient pacient1 = new Pacient("Ana");
        Pacient pacient2 = new Pacient("Maria");

        Comanda comanda1 = new Internare(medic, pacient1);
        Comanda comanda2 = new Tratare(asistenta, pacient2);

        Operator operator = new Operator();
        operator.inregistreaza(comanda1);
        operator.inregistreaza(comanda2);

        operator.executaComanda();
        operator.inregistreaza(new Tratare(asistenta, new Pacient("Costel")));
        operator.executaComanda();
        operator.inregistreaza(new Tratare(asistenta, new Pacient("Alex")));
        operator.executaComanda();
        operator.executaComanda();

       // comanda1.execute();
        //comanda2.execute();
    }
}
