package ObserverDP.Main;

import ObserverDP.Clase.ISpital;
import ObserverDP.Clase.Pacient;
import ObserverDP.Clase.PacientAbonat;
import ObserverDP.Clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new PacientAbonat("Ionescu", 30);
        Pacient pacient1 = new PacientAbonat("Popescu", 35);
        Pacient pacient2 = new PacientAbonat("Manuel", 55);

        ISpital spital = new Spital("Regina Maria");
        spital.aboneazaPacient(pacient);
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);

        ((Spital) spital).notificaVirus();
        ((Spital) spital).notificaEpidemie();

    }
}
