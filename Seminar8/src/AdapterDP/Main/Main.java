import AdapterDP.Clase.adapterDeObiect.Adapter;
import AdapterDP.Clase.spital.Medicament;

public static void procurareMedicament(AdapterDP.Clase.farmacie.Medicament medFarm){
    medFarm.cumparaMedicament();
}


public static void main(String[] args) {
    Medicament medicamentSpital = new Medicament("Paracetamol", 8.5F);
    AdapterDP.Clase.farmacie.Medicament medicamentFarmacie = new AdapterDP.Clase.farmacie.Medicament("Nurofen");

    medicamentSpital.achizitioneazaMedicament();
    medicamentFarmacie.cumparaMedicament();

    System.out.println("//////////////////////////");
    System.out.println("\n");

    procurareMedicament(medicamentFarmacie);
    Adapter adapter = new Adapter(medicamentSpital);
    procurareMedicament(adapter);
}


