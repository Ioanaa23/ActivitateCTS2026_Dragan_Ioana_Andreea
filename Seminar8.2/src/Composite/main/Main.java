package Composite.main;

import Composite.clase.Departament;
import Composite.clase.Sectie;
import Composite.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura depSpital = new Departament("Spital");
        Structura depAdministrativ = new Departament("Administrativ");
        Structura sectieSecretariat = new Sectie("Secretariat", 12);
        Structura sectieManagament = new Sectie("Management", 20);

        ((Departament) depSpital).adaugaStructura(depAdministrativ);
        ((Departament) depSpital).adaugaStructura(sectieManagament);
        ((Departament) depAdministrativ).adaugaStructura(sectieSecretariat);
        depSpital.afiseazaDetaliiStructura("");
        ((Departament) depSpital).stergeStructura(sectieManagament);
        ((Departament) depAdministrativ).adaugaStructura(sectieManagament);
        System.out.println("Dupa modificare.");
        depSpital.afiseazaDetaliiStructura("");
    }
}
