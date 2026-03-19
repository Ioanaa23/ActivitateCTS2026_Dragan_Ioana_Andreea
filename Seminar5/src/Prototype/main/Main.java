package Prototype.main;

import Prototype.clase.Rezervare;
import Prototype.clase.RezervareAbstracta;

public class Main {
    public static void main(String[] args) {
        Rezervare rez1 = new Rezervare("Gica", 12, 17, "0755304229");
        Rezervare rez2 = (Rezervare) rez1.clone();

        rez2.setOraRezervare(10);
        rez2.setZiRezervare(10);

        System.out.println(rez1.toString());
        System.out.println(rez2.toString());
    }
}
