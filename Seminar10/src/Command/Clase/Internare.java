package Command.Clase;

public class Internare implements Comanda{
    private PersonalSpital medic;
    private Pacient pacient;

    public Internare(PersonalSpital medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void execute() {
        medic.preluarePacient(pacient);
    }
}
