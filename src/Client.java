import java.util.ArrayList;
import java.util.List;

public class Client {
    private String nom;
    private String email;
    private List<Reservation> réservations = new ArrayList<>();

    public Client(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Reservation> getRéservations() {
        return réservations;
    }

    public void setRéservations(List<Reservation> réservations) {
        this.réservations = réservations;
    }

    public Reservation reserve(Seance seance, Salle salle, String place){
        if(seance.isFull()){
            return null;
        }
        else {
            Reservation reservation = new Reservation(seance,salle,place);
            return reservation;
        }
    }
}
