package AdapterSTB.clase;

public class ValidatorTerestru implements IValidatorTerestru{

    @Override
    public void valideazaCalatorie(Bilet bilet) {
        System.out.println("Validarea a fost efectuata pentru " + bilet.getTip() + " cu ID ul " + bilet.getId());

    }
}
