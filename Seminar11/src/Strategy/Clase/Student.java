package Strategy.Clase;

public class Student {
    private ModSustinere modSustinere;
    private String nume;

    public Student(String nume) {
        this.nume = nume;
        this.modSustinere = new Grila();
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void examinare(){
        modSustinere.sustinereExamen();
    }
}
