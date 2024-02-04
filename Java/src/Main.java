interface First{
    String getFirst();
    default void show(){
        System.out.println("Интерфейс First");
    }
}
interface Second{
    String getSecond();
    default void show(){
        System.out.println("Интерфейс Second");
    }
}
class Base{
    String getBase(){
        return "Base";
    }
    void show(){
        System.out.println("Класс Base");
    }
}
class Implement extends Base implements First,Second{
    public String getFirst(){
        return "Интерфейс First";
    }
    public String getSecond(){
        return "Интерфейс Second";
    }
    public void show(){
        System.out.println("Мы используем: ");
        System.out.println(getFirst());
        System.out.println(getSecond());
        System.out.println(getBase());
        First.super.show();
        Second.super.show();
        super.show();
    }
}
public class Main {
    public static void main(String[] args) {
        Implement obj = new Implement();
        obj.show();
    }
}
