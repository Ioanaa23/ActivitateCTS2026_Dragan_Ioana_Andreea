package AdapterDP.Clase.adapterDeObiect;

import AdapterDP.Clase.spital.Medicament;

public class Adapter extends AdapterDP.Clase.farmacie.Medicament {
    private Medicament medicament;


    public Adapter(Medicament medicament) {
        super(medicament.getNume());
        this.medicament = medicament;
    }

    @Override
    public void cumparaMedicament() {
        medicament.achizitioneazaMedicament();
    }
}
