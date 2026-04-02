package Spital.EX2.factory;

import Spital.EX2.factoryClasses.Asistent;
import Spital.EX2.factoryClasses.Brancardier;
import Spital.EX2.factoryClasses.Medic;
import Spital.EX2.factoryClasses.PersonalSpital;

public class FabricaPersonalSpital {
    public static PersonalSpital getPersonalSpital(Tipuri tip, String nume) {
        switch (tip){
            case BRANCARDIER: return new Brancardier(nume);
            case ASISTENT: return new Asistent(nume);
            case MEDIC: return  new Medic(nume);
            default: throw new IllegalArgumentException("Tipul personalului nu este cunoscut");
        }
    }
}
