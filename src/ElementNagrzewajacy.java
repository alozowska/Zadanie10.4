public abstract class ElementNagrzewajacy extends ElementKomputera{
    protected int taktowanie;
    protected int tempTaktowania;
    protected int tempBezpieczna;

    public ElementNagrzewajacy(String nazwa, String producent, String numer, int taktowanie, int tempTaktowania, int tempBezpieczna) {
        super(nazwa, producent, numer);
        this.taktowanie = taktowanie;
        this.tempTaktowania = tempTaktowania;
        this.tempBezpieczna = tempBezpieczna;
    }

    public int getTaktowanie() {
        return taktowanie;
    }

    public void setTaktowanie(int taktowanie) {
        this.taktowanie = taktowanie;
    }

    public int getTempTaktowania() {
        return tempTaktowania;
    }

    public void setTempTaktowania(int tempTaktowania) {
        this.tempTaktowania = tempTaktowania;
    }

    public int getTempBezpieczna() {
        return tempBezpieczna;
    }

    public void setTempBezpieczna(int tempBezpieczna) {
        this.tempBezpieczna = tempBezpieczna;
    }
    public abstract void zwiekszTaktowanie(int dodatkoweTaktowanie);

}
