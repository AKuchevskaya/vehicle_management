public abstract class Vehicle {
    private int id;
    private String brand;
    private String model;
    private int year;

    public Vehicle(int id, String brand, String model, int year){
        this.id = id; //(уникальный идентификатор), 
        this.brand = brand; // (марка), 
        this.model = model; // (модель), 
        this.year = year; // (год выпуска)
    }
    
    // Методы:
    //абстрактный
    abstract void displayInfo();
    
    // запуск двигателя (реализация в подклассах).
    public void startEngine(){
        System.out.println("Двигатель запущен");
    }

    // остановка двигателя (реализация в подклассах).
    public void stopEngine(){
        System.out.println("Двигатель остановлен");
    }

    // увеличение скорости на указанное значение (реализация в подклассах).
    public void accelerate(int speed){
        System.out.println("Двигатель остановлен");
    }

    // прекращение движения (реализация в подклассах).
    public void brake(){
        System.out.println("Прекращение движения");
    }

    // вывод информации о транспортном средстве (реализация в подклассах).
    // abstract void displayInfo(){
    //     System.out.println("Используемое транспортное средство:\n" + id + ",\n" + brand + ",\n" + model + ",\n" + year);
    // }
}