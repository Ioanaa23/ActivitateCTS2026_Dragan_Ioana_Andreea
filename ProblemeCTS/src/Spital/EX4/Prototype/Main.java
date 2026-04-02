package Spital.EX4.Prototype;

public class Main {
    public static void main(String[] args) {
        Reteta r = new Reteta("Paracetamol", 100);
        Reteta r1 = (Reteta) r.clone();
        System.out.println(r);
        System.out.println(r1);
        r = new Reteta("xanax", 11);
        System.out.println(r);
        System.out.println(r1);
    }
}
