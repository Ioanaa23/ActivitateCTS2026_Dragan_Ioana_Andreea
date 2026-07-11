package AdapterSTB.clase;

public class

AdaptorMetrou implements IValidatorTerestru{
    private ValidatorMetrou validatorMetrou;

    public AdaptorMetrou(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void valideazaCalatorie(Bilet bilet) {
        System.out.println("--> Adaptorul traduce datele pentru sistemul metroului...");
        validatorMetrou.permiteAccesSubteran(bilet.getId(), bilet.getTip());
    }

}
