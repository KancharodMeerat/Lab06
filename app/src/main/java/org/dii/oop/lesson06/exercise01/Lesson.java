package app.src.main.java.org.dii.oop.lesson06.exercise01;

import java.util.Scanner;
import java.util.ArrayList; //this exercise MUST use arrayList

 class Shape {
    private String name;
    private int numSides;

    Shape(String name, String Side){
        this.name = name;
        this.numSides = Integer.parseInt(Side);
    }
     public double getArea(){
        return 0;
     }
     public double getPerimeter(){
        return 0;
     }
     public String getName(){
        return name;
     }
     public int getNumSides(){
        return numSides;
     }
}

class Circle extends Shape {
    private double radius;

    Circle(String name, String radius){
        super("Circle", "0");
        this.radius = Double.parseDouble(radius);
    }
    public double getArea(){
        return 3.14 * (radius * radius);
    }
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(String name, String width, String height) {
        super("Rectangle", "4");
        this.width = Double.parseDouble(width);
        this.height = Double.parseDouble(height);
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class Square extends Rectangle {
    Square(String name, String side) {
        super(name, side, side);
    }
}
public class Lesson {

    public static void run() {
//System.out.println("Hi");
        ArrayList<Shape> shapes = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        //HINT1: usage arraylist with Shape class to store all of your shapes, check how to use arrayList by yourself


        //HINT2: you may want to declare your arrayList around here


        do {
            System.out.println();
            //print menu as instructed in MD file
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Display all shape");
            System.out.println("5. exit");
            System.out.print("Please select [1-5]: ");

            String choice = in.nextLine().trim();

            // TODO: write your code here

            if ("1".equals(choice)) {
                System.out.print("\nEnter radius: ");
                String strRadius = in.nextLine();
                shapes.add(new Circle("Circle", strRadius));
                //store to arrayList
            }
            if ("2".equals(choice)) {
                System.out.print("\nEnter width: ");
                String strWidth = in.nextLine();
                System.out.print("Enter height: ");
                String strHeight = in.nextLine();
                shapes.add(new Rectangle("Rectangle", strWidth, strHeight));
                //store to arrayList
            }
            if ("3".equals(choice)) {
                System.out.print("\nEnter side: ");
                String strSide = in.nextLine();
                shapes.add(new Square("Square", strSide));
                //store to arrayList
            }
            if ("4".equals(choice)) {
                System.out.print("\n");
                System.out.print("List all shape: \n");
                for (Shape shape : shapes) {
                    System.out.println("Name: " + shape.getName() + ", Number of side: " + shape.getNumSides() + ", Area: " + shape.getArea() + ", Perimeter: " + shape.getPerimeter());
                    //print data as instructed
                    //check how to iterate through arrayList

                    //HINT3: you can use getClass() function of arrayList to get the name of class. It might be useful : )
                }
            }
            if ("5".equals(choice)) {
                break;
            }
            if ("6".equals(choice)) {
                break;
            }

        }while (true) ;

            in.close();

        }
    }
