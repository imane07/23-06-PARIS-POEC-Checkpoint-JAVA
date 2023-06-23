import java.util.ArrayList;
import java.util.List;

public class Salle {

    private int capacité;
    private List<String> places = new ArrayList<>();

    public Salle(int capacité, List<String> places) {
        this.capacité = capacité;
        this.places = places;
    }

    public int getCapacité() {
        return capacité;
    }

    public void setCapacité(int capacité) {
        this.capacité = capacité;
    }

    public List<String> getPlaces() {
        return places;
    }

    public void setPlaces(List<String> places) {
        this.places = places;
    }
}
