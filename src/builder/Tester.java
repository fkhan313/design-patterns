package builder;

public class Tester {
    public static void main(String[] args) {
        Car c1 = new CarBuilder()
                .setMake("Toyota")
                .setModel("Camry")
                .setYear(2022)
                .setColor("Blue")
                .build();
        System.out.println(c1);
    }
}
