public class Cladire extends Proprietate {

    public Cladire(Adresa adresa, int suprafata) {
        super(adresa, suprafata);
    }

    @Override
    public int getCost() {
        return 500 * suprafata;
    }

    @Override
    public String getDescriere() {
        return "Cladire: " + adresa.toString() + "\nSuprafata: " + suprafata + "\nCost: " + getCost();
    }
}
