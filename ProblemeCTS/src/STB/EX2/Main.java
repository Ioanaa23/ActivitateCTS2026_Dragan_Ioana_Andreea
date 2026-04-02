package STB.EX2;

public class Main {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz(10, "DJ27SHS", "Firma");
        Autobuz a2 = (Autobuz) a1.clone();
        System.out.println(a1);
        System.out.println(a2);

        Autobuz a3 = new Autobuz(3, "SGHJ", "GWSHJEDF");
        Autobuz a4 = (Autobuz) a3.clone();

        System.out.println(a4);
    }
}
