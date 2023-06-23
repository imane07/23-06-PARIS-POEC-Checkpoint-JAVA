import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Seance {

    private Film film;
    private Date date;
    private Time heure;
    private Salle salle;
    private List<Reservation> réservation = new ArrayList<>();

    public Seance(Film film, Date date, Time heure, Salle salle) {
        this.film = film;
        this.date = date;
        this.heure = heure;
        this.salle = salle;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getHeure() {
        return heure;
    }

    public void setHeure(Time heure) {
        this.heure = heure;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public List<Reservation> getRéservation() {
        return réservation;
    }

    public void setRéservation(List<Reservation> réservation) {
        this.réservation = réservation;
    }

    public void addReservation(Reservation reservation){
        this.réservation.add(reservation);
    }
    public boolean isFull(){
        return this.réservation.size() >= this.salle.getCapacité();
    }
}
