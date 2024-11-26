class Car
{
    void drive()
    {
        System.out.println("Driving...");
    }
}

class McLaren extends Car
{
    @Override
    void drive()
    {
        System.out.println("Driving a McLaren...Artura");
    }
}

class AstonMartin extends Car
{
    @Override
    void drive()
    {
        System.out.println("Driving an Aston Martin...DBS");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.drive();

        car1 = new McLaren();
        car1.drive();

        car1 = new AstonMartin();
        car1.drive();
    }
}
