package testOOP;

public abstract class Vehicle {

    public String brand, model;
    public int wheels;

    public abstract void PrintInfo();
}


class Car extends Vehicle
{
    private int doors;

    public Car(String _brand, String _model, int _wheels, int _doors)
    {
        brand = _brand;
        model = _model;
        wheels = _wheels;
        doors = _doors;
    }

    @Override
    public void PrintInfo()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Doors: " + doors);
        System.out.println("Wheels: " + wheels);
    }

}






