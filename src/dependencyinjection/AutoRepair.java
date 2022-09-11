package dependencyinjection;

public class AutoRepair {
    private Alignment alignment;
    private OilChange oilChange;
    private TireRotation tireRotation;

    public AutoRepair(Alignment alignment, OilChange oilChange, TireRotation tireRotation) {
        this.alignment = alignment;
        this.oilChange = oilChange;
        this.tireRotation = tireRotation;
    }

    @Override
    public String toString() {
        return "AutoRepair{" +
                "alignment=" + alignment +
                ", oilChange=" + oilChange +
                ", tireRotation=" + tireRotation +
                '}';
    }
}
