package dependencyinjection;

public class Tester {
    public static void main(String[] args) {

        //dependencies

        Alignment alignment = new Alignment();
        OilChange oilChange = new OilChange();
        TireRotation tireRotation = new TireRotation();

        //inject

        AutoRepair autoRepair = new AutoRepair(alignment,oilChange,tireRotation);
        System.out.println(autoRepair);


    }
}
