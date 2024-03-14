public class Aircraft extends Vehicle implements Flyable{
    int maxAltitude; //максимальная высота полета
    boolean isFlying; // флаг состояния полета

    public Aircraft(int id, String brand, String model, int year, int maxAltitude, boolean isFlying) {
        super(id, brand, model, year);
        this.maxAltitude = maxAltitude;
        this.isFlying = isFlying;
    }

    @Override
    void displayInfo() {
        System.out.println("-------------------");
        System.out.println("Используемое транспортное средство:\n" + "id: " + getId() 
        + ",\n" + "марка: " + getBrand()
        + ",\n" + "модель: " + getModel()
        + ",\n" + "год выпуска(г): " + getYear()
        + ",\n" + "максимальная высота полета(м): " + maxAltitude
        + ",\n" + "флаг состояния полета: " + isFlying);
        System.out.println();
    }

    @Override
    public void startEngine(){
        System.out.println("Запуск двигателя самолета");
    }

    @Override
    public void stopEngine(){
        System.out.println("Остановка двигателя самолета");
    }
}
