public class Boat extends Vehicle implements Swimmable{
    private int maxSpeed; // максимальная скорость на воде
    private boolean isSailing; // флаг состояния движения по воде

    public Boat(int id, String brand, String model, int year, int maxSpeed, boolean isSailing) {
        super(id, brand, model, year);
        this.maxSpeed = maxSpeed;
        this.isSailing = isSailing;
    }

    @Override
    void displayInfo() {
        System.out.println("-------------------");
        System.out.println("Используемое транспортное средство:\n" + "id: " + getId() 
        + ",\n" + "марка: " + getBrand() 
        + ",\n" + "модель: " + getModel() 
        + ",\n" + "год выпуска(г): " + getYear() 
        + ",\n" + "максимальная скорость на воде(км/ч): " + maxSpeed
        + ",\n" + "флаг состояния движения по воде: " + isSailing);
        System.out.println();
    }

    @Override
    public void startEngine(){
        System.out.println("Запуск двигателя лодки");
    }

    @Override
    public void stopEngine(){
        System.out.println("Остановка двигателя лодки");
    }
}
