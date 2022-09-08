package builder;

public class Car {
    //required fields
    private String make;
    private String model;
    private String color;
    private int year;
    private int wheel;
    //optional fields
    private int airbags;
    private String infotainment;

    public Car (CarBuilder builder) {
        make=builder.make;

    }

}
