public class Main {
    public static void main(String[] args) {
        Car car = new Car(1, "car_KIA", "Carnival", 2010, 40, 35);
        Vehicle boat = new Boat(2, "boat_Star", "305-13", 2018, 150, true);
        Vehicle aircraft = new Aircraft(3, "aircraft_Moon", "3000", 2022, 1000, true);
        
        car.displayInfo();
        car.startEngine();
        car.accelerate(20);
        car.refuel(15);
        car.stopEngine();

        boat.displayInfo();
        boat.startEngine();
        Swimmable.startSwimming();
        Swimmable.stopSwimming();
        boat.stopEngine();

        aircraft.displayInfo();
        aircraft.startEngine();
        Flyable.takeOff();
        Flyable.land();
        aircraft.stopEngine();



    }


    
}
