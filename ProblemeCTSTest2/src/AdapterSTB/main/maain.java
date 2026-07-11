package AdapterSTB.main;

import AdapterSTB.clase.*;

public class maain {
    public static void main(String[] args) {
        Bilet bilet = new Bilet("bilet", 1002);
        Bilet abonament = new Bilet("abonament", 8652);

        IValidatorTerestru validatorAutobuz = new ValidatorTerestru();
        validatorAutobuz.valideazaCalatorie(bilet);

        ValidatorMetrou validatorMetrou = new ValidatorMetrou();
        IValidatorTerestru adapter = new AdaptorMetrou(validatorMetrou);
        adapter.valideazaCalatorie(abonament);
    }
}
