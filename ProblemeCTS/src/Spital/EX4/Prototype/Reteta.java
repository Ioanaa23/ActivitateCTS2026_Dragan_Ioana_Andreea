package Spital.EX4.Prototype;

public class Reteta implements IReteta{
    private String numeSolutie;
    private int cantitateSolutie;

    public Reteta() {
    }

    public Reteta(String numeSolutie, int cantitateSolutie) {
        this.numeSolutie = numeSolutie;
        this.cantitateSolutie = cantitateSolutie;
    }

    public IReteta clone(){
        Reteta retetaNoua = new Reteta();
        retetaNoua.numeSolutie = this.numeSolutie;
        retetaNoua.cantitateSolutie = this.cantitateSolutie;
        return retetaNoua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("Solutia='").append(numeSolutie).append('\'');
        sb.append(", Cantitatea Solutiei=").append(cantitateSolutie);
        sb.append('}');
        return sb.toString();
    }
}
