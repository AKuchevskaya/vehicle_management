public class Car extends Vehicle {
    private int fuelCapacity; // емкость топливного бака
    private int currentFuelLevel; //текущий уровень топлива

    public Car(int id, String brand, String model, int year, int fuelCapacity, int currentFuelLevel) {
        super(id, brand, model, year);
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    void displayInfo() {
        System.out.println("-------------------");
        System.out.println("Используемое транспортное средство:\n"  + "id: " + getId() 
        + ",\n" + "марка: " + getBrand() 
        + ",\n" + "модель: " + getModel() 
        + ",\n" + "год выпуска(г): " + getYear() 
        + ",\n" + "емкость топливного бака(л): " + fuelCapacity
        + ",\n" + "текущий уровень топлива(л): " + currentFuelLevel);
        System.out.println();
    }

    // Реализует методы:
    // увеличение скорости автомобиля на указанное значение.
    public void accelerate(int speed){
        System.out.println("Скорость увеличена на " + speed + " км/ч");
    }
    // прекращение движения автомобиля.
    public void brake(){
        System.out.println("Прекращение движения");
    }
    // заправка автомобиля (увеличение уровня топлива).
    public void refuel(int liters){
        System.out.println("Вы заправили топливный бак на " + liters + " литров");
    }
}
