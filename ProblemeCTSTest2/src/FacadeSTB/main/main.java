package FacadeSTB.main;

import FacadeSTB.clase.PanouControlFacade;

public class main {
    public static void main(String[] args) {
        PanouControlFacade panouSofer = new PanouControlFacade();

        panouSofer.elibereazaToateUsile();
        panouSofer.deschideFortatToateUsile();
    }
}
