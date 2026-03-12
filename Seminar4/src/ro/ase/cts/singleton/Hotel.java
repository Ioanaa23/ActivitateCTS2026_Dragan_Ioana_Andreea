package ro.ase.cts.singleton;

public class Hotel {

    private String numeHotel;
    private int nrCamere;
    private int nrCamereOcupate;

    private static Hotel instance = null;

    private Hotel(String numeHotel, int nrCamere, int nrCamereOcupate) {
        this.numeHotel = numeHotel;
        this.nrCamere = nrCamere;
        this.nrCamereOcupate = nrCamereOcupate;
    }

    public static synchronized Hotel getInstance(String numeHotel, int nrCamere, int nrCamereOcupate){
        if(instance == null){
            instance = new Hotel(numeHotel, nrCamere, nrCamereOcupate);
        }
        return instance;
    }

    public void rezervaCamera(){
        if(this.nrCamereOcupate < this.nrCamere){
            System.out.println("Camera a fost rezervata!");
            nrCamereOcupate++;
        }
        else {
            System.out.println("Nu mai exista camere disponibile!");
        }
    }

    public void afisareDetaliiHotel(){
        StringBuilder builder = new StringBuilder();
        builder.append("Nume hotel: ").append(this.numeHotel);
        builder.append(" Numar camere: ").append(this.nrCamere);
        builder.append(" Numar camere ocupate: ").append(this.nrCamereOcupate);
        System.out.println(builder);
    }

}
