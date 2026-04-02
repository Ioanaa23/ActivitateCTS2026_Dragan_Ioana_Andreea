package AgentieTurism.singleton;

public class Main {
    public static void main(String[] args) {
        AgeTur a1 = AgeTur.getInstance("Vacanta Santorini", 400, 300, 333);
        AgeTur a2 = AgeTur.getInstance("vgahjk", 2673, 11,333);
        System.out.println(a1.toString());
        System.out.println(a2.toString());

        a1.rezervaPachet();
        a2.rezervaPachet();
    }
}
