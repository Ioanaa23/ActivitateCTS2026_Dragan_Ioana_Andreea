package STB.EX3;

public class AutobuzLinieBuilder implements AbstractBuilderV2{

    private String model;
    private String sofer;
    private boolean oprireCapatLinie = true;
    private boolean deschideUsa = false;
    private String textEcran = "Linie 1";

    @Override
    public AutobuzLinie build() {
        return new AutobuzLinie(model, sofer, oprireCapatLinie, deschideUsa, textEcran);
    }

    @Override
    public AbstractBuilderV2 setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public AbstractBuilderV2 setNumeSofer(String numeSofer) {
        this.sofer = numeSofer;
        return this;
    }

}
