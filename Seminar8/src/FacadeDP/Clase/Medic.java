package FacadeDP.Clase;

public class Medic {
    public boolean areTrimitere(Pacient pacient){
        return pacient.getGravitate() > 5;
    }
}
