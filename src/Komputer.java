public class Komputer {
    Procesor procesor;
    PamiecRam pamiecRam;
    DyskTwardy dyskTwardy;

    public Komputer(Procesor procesor, PamiecRam pamiecRam, DyskTwardy dyskTwardy) {
        this.procesor = procesor;
        this.pamiecRam = pamiecRam;
        this.dyskTwardy = dyskTwardy;
    }

    public Procesor getProcesor() {
        return procesor;
    }

    public void setProcesor(Procesor procesor) {
        this.procesor = procesor;
    }

    public PamiecRam getPamiecRam() {
        return pamiecRam;
    }

    public void setPamiecRam(PamiecRam pamiecRam) {
        this.pamiecRam = pamiecRam;
    }

    public DyskTwardy getDyskTwardy() {
        return dyskTwardy;
    }

    public void setDyskTwardy(DyskTwardy dyskTwardy) {
        this.dyskTwardy = dyskTwardy;
    }
}
