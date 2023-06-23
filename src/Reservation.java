public class Reservation {
    private Client client;
    private Seance séance;
    private Salle salle;

    private String place;

    public Reservation(Seance séance, Salle salle, String place) {
        this.séance = séance;
        this.salle = salle;
        this.place = place;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Seance getSéance() {
        return séance;
    }

    public void setSéance(Seance séance) {
        this.séance = séance;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
