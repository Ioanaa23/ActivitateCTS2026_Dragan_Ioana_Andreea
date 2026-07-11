package StrategySTB.main;

import StrategySTB.clase.Calator;
import StrategySTB.clase.MetodaPlata;
import StrategySTB.clase.SMS;

public class main {
    public static void main(String[] args) {
        Calator calator = new Calator("costi");
        calator.pay(5.44);

        calator.setMetodaPlata(new SMS());
        calator.pay(6.22);
    }
}
