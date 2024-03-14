public class Boat extends Vehicle{

    public Boat(int id, String brand, String model, int year) {
        super(id, brand, model, year);
    }

    // Реализует методы абстрактного класса displayInfo.
    // Реализует методы интерфейса Swimmable.
    // Добавляет свойства: int maxSpeed (максимальная скорость на воде), boolean isSailing (флаг состояния движения по воде).
    // Реализует методы:
    // void startEngine() - запуск двигателя лодки.
    // void stopEngine() - остановка двигателя лодки.
    // void startSwimming() - начало движения лодки по воде.
    // void stopSwimming() - прекращение движения лодки по воде.

    @Override
    void displayInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayInfo'");
    }
    
}
