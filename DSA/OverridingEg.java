// class Shape {
//     String name;
//     Shape()
//     {
//         System.out.println("shape empty constructor");
//     }
//     Shape(String n)
//     {
//         this.name = n;
//         System.out.println("shape param constructor");
//     }
//     void area()
//     {
//         System.out.println("area in shape");
//     }
// }

interface Shape {
    void area();
    void show();
    double pi = 3.14;
}

class Circle implements Shape
{
    double r,ar;
   // Circle() {}
    Circle(double r)
    {
        // super("circle");
        this.r = r; System.out.println("circle param construtor");
    }
    public void area() {
        ar = 3.14 * r * r;
        System.out.println("area of circle:"+ar);
    }
    public void show(){
        System.out.println("area of circle:"+ar);

    }
}
// class Rectangle extends Shape {
//     int ln,bd;
//     Rectangle(int l,int b){
//         super("rectangle");
//         ln = l;
//         bd = b;
//     }
//     void area()
//     {
//         System.out.println("area of rectangle:"+(ln*bd));
//     }
// }
public class OverridingEg {
    public static void main(String[] args) {
        Circle c = new Circle(2.5);
        // Rectangle r = new Rectangle(10, 20);

        Shape sref;
        sref = c; //dynamic binding
        sref.area();
        // sref = r;
        // sref.area();

        System.out.println(Shape.pi); // variable in interface is static and final 
    }

}