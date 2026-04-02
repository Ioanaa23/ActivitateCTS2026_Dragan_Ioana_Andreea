package Spital.EX2;

import Spital.EX2.factory.FabricaPersonalSpital;
import Spital.EX2.factory.Tipuri;
import Spital.EX2.factoryClasses.PersonalSpital;

public class Main {
    public static void main(String[] args) {
        PersonalSpital p1 = FabricaPersonalSpital.getPersonalSpital(Tipuri.BRANCARDIER, "Alex");
        PersonalSpital p2 = FabricaPersonalSpital.getPersonalSpital(Tipuri.ASISTENT, "ana");
        PersonalSpital p3 = FabricaPersonalSpital.getPersonalSpital(Tipuri.MEDIC, "ananan");

        p1.afiseazaDetalii();
        p2.afiseazaDetalii();
        p3.afiseazaDetalii();
    }
}
