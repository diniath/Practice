/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author nande
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    
    //don't need a superclass for getArea, as each given shape's area is calculated in a different way
    public static void main(String[] args) {
        Square square = new Square(2, 3);
        Triangle triangle = new Triangle(5, 6);
        Circle circle = new Circle(3, 3.14);
        
        System.out.println("the area of square is "+ square.getArea());
        System.out.println("the area of triangle is "+triangle.getArea());
        System.out.println("the area of circle is "+circle.getArea());
    }
    
}
