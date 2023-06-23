import java.util.HashMap;
import java.util.Map;

public class Place {
    private String numero;
    Map<Seance, Boolean> isOccupied = new HashMap<>();

    public Place(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
