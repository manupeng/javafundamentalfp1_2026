package oopmodeling;

import java.util.Date;

/**
 * @author cepv
 * @created 10/8/2026
 */
public class Main {
    public static void main(String[] args) {
        //create three objects from "Circle" class
        Circle c1 = new Circle(2);
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        //Print the memory addresses of the objects
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        //Call methods of the objects
        System.out.println(c1.circumference());
        System.out.println(c2.circumference());
        System.out.println(c1.area());
        System.out.println(c2.area());
        System.out.println(c3.area());

        Book b1 =
                new Book(12, "Beyond good and evil");
        System.out.println(b1.category);
        b1.category = "science fiction";
        System.out.println(b1.category);

        Book b2 = new Book();
        System.out.println("The category of this book is : " + b2.category);
        Book b3 = new Book(12, "The earth", "", new Date(), 234, "");
        System.out.println("The category of this book is : " + b3.category);


    }
}
