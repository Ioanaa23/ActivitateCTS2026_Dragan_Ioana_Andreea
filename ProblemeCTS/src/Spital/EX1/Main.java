package Spital.EX1;

public class Main {
    public static void main(String[] args) {
        Internare i1 = new InternareBuilder().setNume("costi").build();
        Internare i2 = new InternareBuilder().setNume("Ana").setPapuci(true).build();
        System.out.println(i1);
        System.out.println(i2);
    }
}
