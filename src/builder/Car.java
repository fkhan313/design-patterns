package builder;

public class Car {
    //required fields
    private String make;
    private String model;
    private String color;

    //optional fields
    private int year;
    private int wheel;
    private int airbags;
    private Boolean sunRoof;
    private String infotainment;


    public Car(String make, String model, String color, int year, int wheel, int airbags, Boolean sunRoof, String infotainment) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.wheel = wheel;
        this.airbags = airbags;
        this.sunRoof = sunRoof;
        this.infotainment = infotainment;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", wheel=" + wheel +
                ", airbags=" + airbags +
                ", sunRoof=" + sunRoof +
                ", infotainment='" + infotainment + '\'' +
                '}';
    }
}
