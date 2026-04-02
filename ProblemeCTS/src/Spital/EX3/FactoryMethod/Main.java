package Spital.EX3.FactoryMethod;

import Spital.EX3.FactoryMethod.clase.PersonalSpital1;
import Spital.EX3.FactoryMethod.enums.TipPersonal;
import Spital.EX3.FactoryMethod.enums.TipPersonalMedical;
import Spital.EX3.FactoryMethod.factory.FabricaAbstracta;
import Spital.EX3.FactoryMethod.factory.FabricaPersonalMedical;
import Spital.EX3.FactoryMethod.factory.FabricaPersonalNonMedical;

public class Main {
    public static void main(String[] args) {
        FabricaPersonalMedical fabricaPersonalMedical = new FabricaPersonalMedical();
        FabricaPersonalNonMedical fabricaPersonalNonMedical = new FabricaPersonalNonMedical();
        PersonalSpital1 medic = fabricaPersonalMedical.getPersonal(TipPersonalMedical.MEDIC, "ana");
        medic.afisare();
    }
}
