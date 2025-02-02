package Builder.model;

public class CarBuilder {
    String model;
    String color;
    int year;
    String engine;
    boolean isAutomatic;

    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder year(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder engine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder isAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
        return this;
    }

    public Car build() {
        return new Car(this);
    }
}

