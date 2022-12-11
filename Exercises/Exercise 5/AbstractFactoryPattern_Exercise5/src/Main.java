// Abstract Factory Pattern

enum CarType
{
     SEDAN, LUXURY
}

abstract class Car
{
    Car(CarType category, Location location)
    {
        this.category = category;
        this.location = location;
    }

    abstract void construct();

    CarType category = null;
    Location location = null;

    CarType getCategory()
    {
        return category;
    }

    void setCategory(CarType category)
    {
        this.category = category;
    }

    Location getLocation()
    {
        return location;
    }

    void setLocation(Location location)
    {
        this.location = location;
    }

    @Override
    public String toString()
    {
        return "CarCategory - "+category + " located in "+location;
    }
}

class LuxuryCar extends Car
{
    LuxuryCar(Location location)
    {
        super(CarType.LUXURY, location);
        construct();
    }
    @Override
    protected void construct()
    {
        System.out.println("Connecting to luxury car");
    }
}



class SedanCar extends Car
{
    SedanCar(Location location)
    {
        super(CarType.SEDAN,location );
        construct();
    }

    @Override
    void construct()
    {
        System.out.println("Connecting to SEDAN car");
    }
}

enum Location
{
    DEFAULT, SPAIN, ITALY
}

class ITALYCarFactory
{
    static Car buildCar(CarType category)
    {
        Car car = null;
        switch (category)
        {

            case SEDAN:
                car = new SedanCar(Location.ITALY);
                break;

            case LUXURY:
                car = new LuxuryCar(Location.ITALY);
                break;

            default:
                break;

        }
        return car;
    }
}

class DefaultCarFactory
{
    public static Car buildCar(CarType category)
    {
        Car car = null;
        switch (category)
        {

            case SEDAN:
                car = new SedanCar(Location.DEFAULT);
                break;

            case LUXURY:
                car = new LuxuryCar(Location.DEFAULT);
                break;

            default:
                break;

        }
        return car;
    }
}


class SPAINCarFactory
{
    public static Car buildCar(CarType category)
    {
        Car car = null;
        switch (category)
        {

            case SEDAN:
                car = new SedanCar(Location.SPAIN);
                break;

            case LUXURY:
                car = new LuxuryCar(Location.SPAIN);
                break;

            default:
                break;

        }
        return car;
    }
}



class CarFactory
{
    private CarFactory()
    {

    }
    public static Car buildCar(CarType type)
    {
        Car car = null;

        Location location = Location.ITALY;

        switch(location)
        {
            case SPAIN:
                car = SPAINCarFactory.buildCar(type);
                break;

            case ITALY:
                car = ITALYCarFactory.buildCar(type);
                break;

            default:
                car = DefaultCarFactory.buildCar(type);

        }

        return car;

    }
}

class AbstractDesign
{
    public static void main(String[] args)
    {
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}