import java.util.Date;

public class Film {
    private String nom;
    private String synopsis;
    private Date dateSortie;

    public Film(String nom, String synopsis, Date dateSortie) {
        this.nom = nom;
        this.synopsis = synopsis;
        this.dateSortie = dateSortie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }
}
