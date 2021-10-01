import java.util.Scanner;
public class Circle {
    private float radius;
    public Circle(float R){
        radius=R;
        System.out.println("Круг создан");
    }
    public void setRadius(float r){
        radius=r;
        System.out.println("Новый радиус = "+ radius);
    }
    public float getRadius(){
        return radius;
    }
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        System.out.println("Введите радиус окружности:");
        float r = cs.nextFloat();
        Circle first = new Circle(r);
        System.out.println(first.getRadius());
        System.out.println("Введите новый радиус окружности:");
        r = cs.nextFloat();
        first.setRadius(r);
        System.out.println("Обновлённый радиус: "+first.getRadius());
    }
}