// Летающие транспортные средства
public interface Flyable {
    // Методы: 
    // взлет самолета.
    public static void takeOff() {
        System.out.println("Взлетаем");
    }
    // посадка самолета.
    public static void land() {
        System.out.println("Приземляемся");
    }
}
