package Strategy.Main;

import Strategy.Clase.*;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Vasile");
        student.examinare();

        student.setModSustinere(new ProbaOrala());
        student.examinare();

        student.setModSustinere(new ProbaScrisa());
        student.examinare();
    }
}
