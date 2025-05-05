public class Teren extends Proprietate {
    private int rang;

    public Teren(Adresa adresa, int suprafata, int rang) {
        super(adresa, suprafata);
        this.rang = rang;
    }

    @Override
    public int getCost() {
        return (350 * suprafata) / rang;
    }

    @Override
    public String getDescriere() {
        return "Teren: " + adresa.toString() + "\nSuprafata: " + suprafata + ", Rang: " + rang + "\nCost: " + getCost();
    }
}
