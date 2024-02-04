class Alpha{
    String name;
    void show(){
        System.out.println("Alpha:");
        System.out.println("Name - "+name);
    }
    Alpha(String name){
        this.name = name;
    }
}
class Bravo extends Alpha{
    int code;
    @Override
    void show() {
        System.out.println("Bravo:");
        System.out.println("Name - "+name);
        System.out.println("Code - "+code);
    }
    Bravo(String name, int code){
        super(name);
        this.code = code;
    }
}
public class Main {
    public static void main(String[] args) {
        Alpha objA = new Alpha("objA");
        Bravo objB = new Bravo("objB", 123);
        objA.show();
        objB.show();
    }
}
