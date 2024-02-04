abstract class Figure{
    String color;
    int size;
    Figure(String clr, int s){
        color = clr;
        size = s;
    }
    void show(){
        System.out.println("Фигура: "+ color + getName());
        System.out.println("Размер: ("+getSizeName()+")"+size);
        System.out.printf("Площадь: %.3f\n",getArea());
        String line="";
        for (int i = 1; i<=30; i++){
            line += "*";
        }
        System.out.println(line);
    }
    String getSizeName(){
        return "сторона";
    }
    abstract String getName();
    abstract double getArea();
}
class Triangle extends Figure{
    Triangle(String clr, int s){
        super(clr, s);
    }
    String getName(){
        return " треугольник";
    }
    double getArea(){
        double i = Math.sqrt(3)/4;
        return size*size*i;
    }
}
class Square extends Figure{
    Square(String clr, int s){
        super(clr, s);
    }
    String getName(){
        return " квадрат";
    }
    double getArea(){
        double i = 1;
        return size*size*i;
    }
}
class Circle extends Figure{
    Circle(String clr, int s){
        super(clr, s);
    }
    String getName(){
        return " круг";
    }
    double getArea(){
        double i = Math.PI;
        return size * size * i;
    }
    String getSizeName(){
        return "радиус";
    }
}
public class Main {
    public static void main(String[] args) {
        Triangle T = new Triangle("красный", 2);
        Square S = new Square("черный", 3);
        Circle C = new Circle("желтый", 1);
        T.show();
        S.show();
        C.show();
        Figure F;
        F = T;
        F.show();
        F = S;
        F.show();
        F = C;
        F.show();
    }
}
