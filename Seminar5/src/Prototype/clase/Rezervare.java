package Prototype.clase;

public class Rezervare implements RezervareAbstracta{
    private String numeClient;
    private int oraRezervare;
    private int ziRezervare;
    private String nrTelefon;

    public Rezervare(String numeClient, int oraRezervare, int ziRezervare, String nrTelefon) {
        if(numeClient.length() > 1){
            this.numeClient = numeClient;
        }
        else {
            this.numeClient = "Ion";
        }
        if(oraRezervare < 23 && oraRezervare > 9){
            this.oraRezervare = oraRezervare;
        }
        else{
            this.oraRezervare = 9;
        }
        if(ziRezervare < 30){
            this.ziRezervare = ziRezervare;
        }

        if(nrTelefon.length() == 10) {
            this.nrTelefon = nrTelefon;
        }
        else {
            this.nrTelefon = "0777777777";
        }

    }

    public Rezervare() {
    }

    public void setOraRezervare(int oraRezervare) {
        if(oraRezervare < 23 && oraRezervare > 9){
            this.oraRezervare = oraRezervare;
        }
        else{
            this.oraRezervare = 9;
        }
    }

    public void setZiRezervare(int ziRezervare) {
        if(ziRezervare < 30){
            this.ziRezervare = ziRezervare;
        }
    }

    @Override
    public RezervareAbstracta clone() {
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.oraRezervare = this.oraRezervare;
        rezervareNoua.ziRezervare = this.ziRezervare;
        rezervareNoua.nrTelefon = this.nrTelefon;

        return rezervareNoua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", ziRezervare=").append(ziRezervare);
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
