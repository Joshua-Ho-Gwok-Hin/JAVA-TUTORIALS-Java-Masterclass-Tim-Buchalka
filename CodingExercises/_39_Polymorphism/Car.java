package _39_Polymorphism;

public class Car {

    private String name;
    private boolean engine;
    private int cylinders,
            wheels;

    public Car(int cylinders, String name) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return getClass().getSimpleName() + " -> startEngine()";
    }

    public String accelerate(){
        return getClass().getSimpleName() + " -> accelerate()";
    }

    public String brake(){
        return getClass().getSimpleName() + " -> brake()";
    }


}
