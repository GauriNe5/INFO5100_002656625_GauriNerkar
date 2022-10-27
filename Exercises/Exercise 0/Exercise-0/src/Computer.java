import java.net.SocketOption;

public class Computer {
     Computer(){
        System.out.println("constructor of Computer class");
    }
        int keyboard_size = 10;
        String screen_display = "HD";
        int slots = 0;
        int screen_size=0;
        int keys_input=0;
        int ram_size=0;
        String cpu_processor = "Core i7";
        int usb_port = 0;
        int storage = 0;
        int battery_life=0;

    void computerBrand(){
         System.out.println("1st method of class Computer method");
    }

    void computerSize(){
        System.out.println(" 2nd method of Computer class");

    }

    void computerFields(){
        System.out.println(" 3rd method of Computer class");

    }

}

class MobilePhone {
    MobilePhone(){

        System.out.println("Constructor of Mobile class.");
    }

    String screen_display = "4K";
    int usb_slots = 2;
    int screen_size=0;
    int charger_count=0;
    int memory_size=0;
    String processor = "A16 Bionic";
    int storage = 0;
    int battery_hrs=0;

    void mobileFeatures(){
        System.out.println("Method of MobilePhone class ");
    }

    void mobileDemo(){

        System.out.println("2nd method of MobilePhone class");
    }

    void mobileBrand(){

        System.out.println("3rd method of MobilePhone class");
    }
}

class Vehicle{
    Vehicle(){

        System.out.print("Constructor of vehicle class.");
    }

    String shape;
    int vehicle_quantity = 5;
    int capacity=0;
    String mode;
    String fuel_type="Diesel";
    String engine;
    int tyres = 4;
    String vehicle_brand_name;

    void vehicleMethod(){

        System.out.print("1st Method of vehicle class.");
    }

    void vehicleDemo(){

        System.out.print("2nd Method of vehicle class.");
    }

    void vehicleFun(){

        System.out.print("3rd Method of vehicle class.");
    }


    class Truck{
       Truck()
        {
            System.out.print("Constructor of Truck class.");
        }

        String model_name;
        int truck_quantity = 2;
        int capacity=1000;
        String mode;
        String fuel_type="Diesel";
        String engine_type;
        int tyres = 4;
        String truck_brand_name;

        void truckMethod(){

           System.out.print("1st Method of truck class.");
        }

        void truckDemo(){

            System.out.print("2nd Method of truck class.");
        }

        void truckFun(){

            System.out.print("3rd Method of truck class.");
        }

    }

    class Car{
        Car(){
            System.out.println("Constructor of car class");
        }

        String model_name_car;
        int car_quantity = 2;
        int num_seats = 4;
        String brand;
        String car_fuel_type="Petrol";
        String eng_type;
        int num_tyres = 4;
        String car_brand_name;


        void carFeature(){
            System.out.print("1st Method of car class");
        }

        void carModel(){
            System.out.print("2nd Method of car class");
        }

        void carMethod(){
            System.out.print("3rd Method of car class");
        }

    }
}

class Person{

    String name_person = "Gauri";
    int height = 170;
    int weight= 60;
    int date_of_birth;
    int identity_document_number ;
    String gender = "Female";
    String city = "Pune";
    String country = "India";

    Person(){
System.out.println("Constructor of Person class");
    }

    void personMethod(){
        System.out.print(" Method of person class");
    }

    void personName(){
        System.out.print(" 2nd Method of person class");
    }

    void personAge(){
        System.out.print(" 3rd Method of person class");
    }

}

class Books{

    String author_name;
    int book_quantity = 5;
    int vol=50;
    String book_type = "paperback";
    int sales;
    String category;
    int published_year = 400;
    String book_brand_name;

    Books(){

        System.out.println("Constructor of Books class");
    }

    void booksMethod(){

        System.out.print(" 1st Method of books class");
    }

    void booksAuthor(){

        System.out.print(" 2nd Method of books class");
    }

    void booksFiction(){

        System.out.print(" 3rd Method of books class");
    }

}

class Laptop{

    String laptop_model_name;
    int laptop_quantity = 5;
    int memory_size=50;
    String os_type = "Windows";
    int laptop_sales;
    String processor_name = "AMD";
    int release_year = 2022;
    String laptop_brand_name;

    Laptop(){

        System.out.println("Constructor of Laptop class");
    }

    void laptopMethod(){

        System.out.print(" 1st Method of laptop class");
    }

    void laptopSize(){

        System.out.print(" 2nd Method of laptop class");
    }

    void laptopStorage(){

        System.out.print(" 3rd Method of laptop class");
    }

}

class Electronics{

    String device_name;
    int electronics_quantity = 5;
    int modes=50;
    String device_type = "paperback";
    int electronics_sales_monthly;
    String device_category;
    int electronics_sales_annually;
    String dev_brand_name;

    Electronics(){

        System.out.println("Constructor of Electronics class");
    }

    void electronicsMethod(){

        System.out.print(" 1st Method of Electronics class");
    }

    void electronicsDev(){

        System.out.print(" 2nd Method of Electronics class");
    }

    void electronicsUnits(){

        System.out.print(" 3rd Method of Electronics class");
    }

}

class Test {
    public static void main(String[] args) {

        //instantiation for class Computer
        Computer obj1 = new Computer();
        Computer obj2 = new Computer();
        Computer obj3 = new Computer();


        //instantiation for class MobilePhone

        MobilePhone mob1 = new MobilePhone();
        MobilePhone mob2 = new MobilePhone();
        MobilePhone mob3 = new MobilePhone();

        //instantiation for class Vehicle

        Vehicle outerObject1 = new Vehicle();
        Vehicle outerObject2 = new Vehicle();
        Vehicle outerObject3 = new Vehicle();

        //instantiation for class Truck

        Vehicle.Truck myObj1 = outerObject1.new Truck();
        Vehicle.Truck myObj2 = outerObject2.new Truck();
        Vehicle.Truck myObj3 = outerObject3.new Truck();

        //instantiation for class Car

        Vehicle.Car carObj1 = outerObject1.new Car();
        Vehicle.Car carObj2 = outerObject2.new Car();
        Vehicle.Car carObj3 = outerObject3.new Car();

        //instantiation for class Person
        Person perObj1 = new Person();
        Person perObj2 = new Person();
        Person perObj3 = new Person();

        //Books
        Books bookObj1 = new Books();
        Books bookObj2 = new Books();
        Books bookObj3 = new Books();

        //Laptop
        Laptop lapObj1 = new Laptop();
        Laptop lapObj2 = new Laptop();
        Laptop lapObj3 = new Laptop();

        //Electronics
        Electronics electObj1 = new Electronics();
        Electronics electObj2 = new Electronics();
        Electronics electObj3 = new Electronics();

    }
}

