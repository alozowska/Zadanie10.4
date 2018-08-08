public class Test {
    public static void main(String[] args) {
        Procesor procesor = new Procesor("proc1", "intel", "135556", 3000, 60, 90);
        PamiecRam pamiecRam = new PamiecRam("RAM1", "producent1", "7878677", 1066, 60, 90, 4096);
        DyskTwardy dyskTwardy = new DyskTwardy("dysk1", "producen2", "233445", 128);
        Komputer komputer = new Komputer(procesor, pamiecRam, dyskTwardy);
        try {
            procesor.zwiekszTaktowanie(100);
            procesor.zwiekszTaktowanie(500);

        } catch (TemperaturaPrzekroczona e) {
            System.out.println(e.getMessage());
        }
        try {

            pamiecRam.zwiekszTaktowanie(100);
            pamiecRam.zwiekszTaktowanie(500);

        } catch (TemperaturaPrzekroczona e) {
            System.out.println(e.getMessage());
        }
    }
}
