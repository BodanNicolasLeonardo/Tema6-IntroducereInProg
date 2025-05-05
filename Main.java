public class Main {
    public static void main(String[] args) {
        Contribuabil ion = new Contribuabil("Ion Popescu", "1234567890123");

        ion.adaugaProprietate(new Cladire(new Adresa("V Parvan", 2), 20));
        ion.adaugaProprietate(new Teren(new Adresa("V. Parvan", 2), 10, 1));
        ion.adaugaProprietate(new Cladire(new Adresa("Lugoj", 4), 25));

        System.out.println(ion.getFluturas());
    }
}
