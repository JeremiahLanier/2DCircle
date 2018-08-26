/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle2d;

import java.util.Scanner;

/**
 *
 * @author Lanier
 */
public class Circle2D {
   private double x;
   private double y;
   private double radius;
   
   //Contructor
   
   public Circle2D()
   {
      double X = x = 0;
      double Y = y = 0;
      double Radius = radius = 1;
      
   }
   public Circle2D(double x,double y, double radius)
   {
     this.x = x;
     this.y = y;
     this.radius = radius;
   }
     //Getter methods
   public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getRadius() {
        return this.radius;
    }
    
    //Methods to handle circle objects
    public double getArea()
    {
       double area = Math.PI *(radius * radius);
        return area;
         
    }
    public double getPerimeter()
    {
      double perimeter = 2 * Math.PI * radius;
       return perimeter;
    }
    public boolean contains(double x, double y)
    {
        return true;
    }
    public boolean contains(Circle2D cirlce)
    {
      return true;
    }
    public boolean overlaps(Circle2D circle)
    {
       return true;
    }
  
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       
       System.out.println("TThis is a circle creations program ");
       System.out.println("Do you wish to create a circle? Please enter yes ");
       
       String answer = input.next();
       
       //Create circle object
       while(answer.equalsIgnoreCase("yes"))
       {
          
          double X;
          double Y;
          double Radius;
          
          System.out.println("Please enter a value for x ");
                X = input.nextDouble();
          System.out.println("Please enter a value for y");
                Y = input.nextDouble();
          System.out.println("Please enter a value for the radius");
               Radius = input.nextDouble();
          
          Circle2D c1 = new Circle2D(X,Y,Radius);
          c1.getArea();
          c1.getPerimeter();
          c1.contains(3, 3);
          
          
          
          
          System.out.print(c1);
          System.out.println("The area of the circle is: " + c1.getArea());
          System.out.println(" The perimeter is: " + c1.getPerimeter());
          System.out.println("The Point(3,3) being contained in the circle is: " + c1.contains(3, 3));
          System.out.println("Circle (4,5,10) being contained in the circle is:  " + c1.contains(new Circle2D(4,5,10.5)));
          System.out.println("Circle (3,5,2.3) overlapping Circle1 is: " + c1.overlaps(new Circle2D(3,5,2.3)));
          
          return;
          
       }
       
       
               
    }

    
    
}
