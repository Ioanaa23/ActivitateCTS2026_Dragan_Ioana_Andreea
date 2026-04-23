package AdapterDP.Clase.spital;

public class Medicament {
    private String nume;
    private float pret;

    public void achizitioneazaMedicament(){
        if(prezintaReteta()){
            System.out.println("Medicamentul " + nume + " a fost achizitionat la pretul de " + pret + " lei." );
        }
        else
            System.out.println("Nu a prezentat reteta");
    }

    public Medicament(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public boolean prezintaReteta(){
        return (nume.length() > 10);

    }

    public String getNume() {
        return nume;
    }
}
