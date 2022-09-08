package builder;

public class CarBuilder {
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

    public CarBuilder setSunRoof(Boolean sunRoof) {
        this.sunRoof = sunRoof;
        return this;
    }

    public Car build (){
        if (make==null) {
            throw new IllegalArgumentException("make is a required field");
        }

        if (model==null) {
            throw new IllegalArgumentException("model is a required field");
        }

        if (color==null) {
            throw new IllegalArgumentException("color is a required field");
        }


        return new Car(make,model,color,year,wheel,airbags,sunRoof,infotainment);
    }
}
