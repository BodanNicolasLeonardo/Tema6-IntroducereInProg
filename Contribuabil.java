import java.util.ArrayList;
import java.util.List;

public class Contribuabil {
    private String nume;
    private String cnp;
    private List<Proprietate> proprietati;

    public Contribuabil(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
        this.proprietati = new ArrayList<>();
    }

    public void adaugaProprietate(Proprietate p) {
        proprietati.add(p);
    }

    public int getSumaTotala() {
        int suma = 0;
        for (Proprietate p : proprietati) {
            suma += p.getCost();
        }
        return suma;
    }

    public String getFluturas() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contribuabil: ").append(nume).append("\nProprietati\n");
        for (Proprietate p : proprietati) {
            sb.append(p.getDescriere()).append("\n");
        }
        sb.append("Suma totala: ").append(getSumaTotala());
        return sb.toString();
    }
}
