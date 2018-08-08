public class DyskTwardy extends  ElementKomputera{
    private int pojemnsc;

    public DyskTwardy(String nazwa, String producent, String numer, int pojemnsc) {
        super(nazwa, producent, numer);
        this.pojemnsc = pojemnsc;
    }

    public int getPojemnsc() {
        return pojemnsc;
    }

    public void setPojemnsc(int pojemnsc) {
        this.pojemnsc = pojemnsc;
    }
}
