import java.util.Scanner;

public class Assignment11_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the three sides of the trianlge: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        System.out.print("Enter a color: ");
        String color = input.next();

        System.out.print("Is the triangle filled (true / false) : ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(s1,s2,s3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println(triangle.toString());
        System.out.println("Area: "+triangle.getArea()+" , Perimeter: "+triangle.getPerimeter());
        System.out.println("Color: "+triangle.getColor());
        System.out.println("Trianle is "+(triangle.isFilled() ? "" : "not ")+"filled.");
    }
}

class GeometricObject{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject(){
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public String toString(){
        return "created on "+dateCreated+" color: "+color+" and filled: "+filled;
    }

}
class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    Triangle(){
        side1=side2=side3=1.0;
    }

    Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }

    public double getArea(){
        double s = (side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    public String toString(){
        return "Triangle side1 = " + side1 + " side2 = "+ side2 + " side3 = "+side3;
    }
}