package Prototype.model;

public class Car implements IPrototype {
    private String model;
    private String color;
    private int year;

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public Car clone()  {
        return new Car(model,color,year);
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", color=" + color + ", year=" + year + "]";
    }
}

