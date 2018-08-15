public class Test {
    public static void main(String[] args) {
        Procesor procesor = new Procesor("proc1", "intel", "135556", 3000, 60, 90);
        PamiecRam pamiecRam = new PamiecRam("RAM1", "producent1", "7878677", 1066, 60, 90, 4096);
        DyskTwardy dyskTwardy = new DyskTwardy("dysk1", "producen2", "233445", 128);
        Komputer komputer = new Komputer(procesor, pamiecRam, dyskTwardy);
        try {
            procesor.zwiekszTaktowanie(100);
            System.out.println("zwiększono taktowanie procesora"+"\ntaktowanie:"
                    +procesor.getTaktowanie()+" \ntemperatura:"+procesor.getTempTaktowania());
            procesor.zwiekszTaktowanie(500);
            System.out.println("zwiększono taktowanie procesora"+"\ntaktowanie:"
                    +procesor.getTaktowanie()+" \ntemperatura:"+procesor.getTempTaktowania());
        } catch (TemperaturaPrzekroczona e) {
            System.out.println(e.getMessage());
        }
        try {

            pamiecRam.zwiekszTaktowanie(100);
            System.out.println("zwiększono taktowanie RAM"+"\ntaktowanie:"
                    +pamiecRam.getTaktowanie()+" \ntemperatura:"+pamiecRam.getTempTaktowania());
            pamiecRam.zwiekszTaktowanie(500);
            System.out.println("zwiększono taktowanie RAM"+"\ntaktowanie:"
                    +pamiecRam.getTaktowanie()+" \ntemperatura:"+pamiecRam.getTempTaktowania());

        } catch (TemperaturaPrzekroczona e) {
            System.out.println(e.getMessage());
        }
    }
}
