package builder;

public class CarBuilder {
    //required fields
    private String make;
    private String model;
    private String color;
    private int year;
    private int wheel;
    //optional fields
    private int airbags;
    private String infotainment;


    public CarBuilder setMake(String make) {
        this.make = make;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder setWheel(int wheel) {
        this.wheel = wheel;
        return this;
    }

    public CarBuilder setAirbags(int airbags) {
        this.airbags = airbags;
        return this;
    }

    public CarBuilder setInfotainment(String infotainment) {
        this.infotainment = infotainment;
        return this;
    }
    public Car build (){
        return new Car();
    }
}
