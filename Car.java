public class Car extends Vehicle {

    public Car(int id, String brand, String model, int year) {
        super(id, brand, model, year);
    }

    @Override
    void displayInfo() {
        //System.out.println("Используемое транспортное средство:\n" + id + ",\n" + brand + ",\n" + model + ",\n" + year);
    }

    // Добавляет свойства: int fuelCapacity (емкость топливного бака), int currentFuelLevel (текущий уровень топлива).
    // Реализует методы:
    // void startEngine() - запуск двигателя автомобиля.
    // void stopEngine() - остановка двигателя автомобиля.
    // void accelerate(int speed) - увеличение скорости автомобиля на указанное значение.
    // void brake() - прекращение движения автомобиля.
    // void refuel(int liters) - заправка автомобиля (увеличение уровня топлива).
    
}
