public class PamiecRam extends ElementNagrzewajacy {
    private int pamiec;

    public PamiecRam(String nazwa, String producent, String numer, int taktowanie, int tempTaktowania, int tempBezpieczna, int pamiec) {
        super(nazwa, producent, numer, taktowanie, tempTaktowania, tempBezpieczna);
        this.pamiec = pamiec;
    }

    public int getPamiec() {
        return pamiec;
    }

    public void setPamiec(int pamiec) {
        this.pamiec = pamiec;
    }

    @Override
    public void zwiekszTaktowanie(int dodatkoweTaktowanie) throws TemperaturaPrzekroczona {
        int wzrostTemperatury=dodatkoweTaktowanie / 100 * 15;
        if (tempTaktowania+wzrostTemperatury > tempBezpieczna) {
            throw new TemperaturaPrzekroczona("Zbyt wysoka temperatura pamieci RAM");
        } else {
            taktowanie = taktowanie + dodatkoweTaktowanie;
            tempTaktowania +=wzrostTemperatury;


        }
    }
}