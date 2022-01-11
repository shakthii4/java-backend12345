package car;

public class Driver
{
    private Car car;

    //    private final Car car;

    /*public Driver(Car car) { // constructor injection
        this.car = car;
    }*/
    public void setCar(Car car) // setter injection
    {
        this.car=car;
    }
}
