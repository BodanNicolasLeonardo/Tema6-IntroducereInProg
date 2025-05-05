public abstract class Proprietate {
    protected Adresa adresa;
    protected int suprafata;

    public Proprietate(Adresa adresa, int suprafata) {
        this.adresa = adresa;
        this.suprafata = suprafata;
    }

    public abstract int getCost();

    public abstract String getDescriere();
}
