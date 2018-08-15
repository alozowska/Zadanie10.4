public class Procesor extends ElementNagrzewajacy {
    public Procesor(String nazwa, String producent, String numer, int taktowanie, int tempTaktowania, int tempBezpieczna) {
        super(nazwa, producent, numer, taktowanie, tempTaktowania, tempBezpieczna);
    }

    @Override
    public void zwiekszTaktowanie(int dodatkoweTaktowanie) throws TemperaturaPrzekroczona{
        int wzrostTemperatury=dodatkoweTaktowanie / 100 * 10;
        if (tempTaktowania+wzrostTemperatury > tempBezpieczna) {
            throw new TemperaturaPrzekroczona("Zbyt wysoka temperatura procesora");
        } else {
            taktowanie = taktowanie + dodatkoweTaktowanie;
            tempTaktowania +=wzrostTemperatury;
        }
    }

}
