package STB.EX3;

public class AutobuzLinie {
    private final String model;
    private final String sofer;
    private final boolean oprireCapatLinie;
    private final boolean deschideUsa;
    private final String textEcran;


    public AutobuzLinie(String model, String sofer, boolean oprireCapatLinie, boolean deschideUsa, String textEcran) {
        this.model = model;
        this.sofer = sofer;
        this.oprireCapatLinie = oprireCapatLinie;
        this.deschideUsa = deschideUsa;
        this.textEcran = textEcran;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("model='").append(model).append('\'');
        sb.append(", sofer='").append(sofer).append('\'');
        sb.append(", oprireCapatLinie=").append(oprireCapatLinie);
        sb.append(", deschideUsa=").append(deschideUsa);
        sb.append(", textEcran='").append(textEcran).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
