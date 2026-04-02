package STB.EX3;

public class Main {
    public static void main(String[] args) {
        AutobuzLinie a1 = new AutobuzLinieBuilder().setModel("fiat").setNumeSofer("Gigel").build();
        System.out.println(a1);
    }
}
