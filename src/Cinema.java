import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cinema {

    private String nom;
    private String adresse;
    private List<Film> films = new ArrayList<>();
    private List<Seance> séance = new ArrayList<>();
    private List<Salle> salles = new ArrayList<>();

    public Cinema(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public List<Film> getFilms() {
        return films;
    }

    public List<Seance> getSéance() {
        return séance;
    }

    public List<Salle> getSalles() {
        return salles;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public void setSéance(List<Seance> séance) {
        this.séance = séance;
    }

    public void setSalles(List<Salle> salles) {
        this.salles = salles;
    }

    public void addFilm(Film film){
        this.films.add(film);
    }
    public void removeFilm(Film film){
       this.films.remove(film);
    }
    public void scheduleSeance(Film film, Date date, Time heure, Salle salle){
        this.séance.add(new Seance(film,date,heure,salle));
    }

    public List<Seance> getAllSeancesForFilmOnDate(Film film, Date date){
       List<Seance> result = new ArrayList<>();

       for(Seance s: this.séance) {
           if(s.getDate().equals(date) && s.getFilm().equals(film))
               result.add(s);
       }
       return result;

    }
    public void addSalle(Salle salle){
        this.salles.add(salle);
    }
}
