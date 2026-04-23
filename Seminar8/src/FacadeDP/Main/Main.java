package FacadeDP.Main;

import FacadeDP.Clase.Medic;
import FacadeDP.Clase.Pacient;
import FacadeDP.Clase.ReceptieSpitalFacade;
import FacadeDP.Clase.Salon;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Gigel", 5);
        Medic  medic = new Medic();
        Salon salon = new Salon();

        if(medic.areTrimitere(pacient)){
            int patLiber = salon.getPatLiber();
            if(patLiber != -1) {
                System.out.println("Pacientul " + pacient.getNume() + " va fi internat in patul: " + patLiber + " ");
                salon.ocupatPat(patLiber);
            }
        }

        System.out.println("FACADE \n");
        Pacient pacient1 = new Pacient("COCO", 3);
        Pacient pacient2 = new Pacient("Ana", 2);
        Pacient pacient3 = new Pacient("Toma", 7);

        ReceptieSpitalFacade receptieSpitalFacade = new ReceptieSpitalFacade(medic, salon);
        receptieSpitalFacade.internarePacient(pacient1);
        receptieSpitalFacade.internarePacient(pacient2);
        receptieSpitalFacade.internarePacient(pacient3);
    }
}
