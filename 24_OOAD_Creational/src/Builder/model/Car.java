package Builder.model;

public class Car {
    private String model;
    private String color;
    private int year;
    private String engine;
    private boolean isAutomatic;

    // Private constructor to prevent direct instantiation
    Car(CarBuilder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.year = builder.year;
        this.engine = builder.engine;
        this.isAutomatic = builder.isAutomatic;
    }

    @Override
    public String toString() {
        return "Car {model=" + model + ", color=" + color + ", year=" + year + 
               ", engine=" + engine + ", isAutomatic=" + isAutomatic + "}";
    }

    // Getters for Car fields
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getEngine() {
        return engine;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }
}

