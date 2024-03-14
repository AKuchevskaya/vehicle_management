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
    public int getId(){
        return id;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

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
}