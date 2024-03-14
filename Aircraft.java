public class Aircraft extends Vehicle{

    public Aircraft(int id, String brand, String model, int year) {
        super(id, brand, model, year);
    }
    // Реализует методы интерфейса Flyable.
    // Добавляет свойства: int maxAltitude (максимальная высота полета), boolean isFlying (флаг состояния полета).
    // Реализует методы:
    // void startEngine() - запуск двигателя самолета.
    // void stopEngine() - остановка двигателя самолета.
    // void takeOff() - взлет самолета.
    // void land() - посадка самолета.

    @Override
    void displayInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayInfo'");
    }
    
}
