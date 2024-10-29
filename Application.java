#application.java file 
#HDFC application
public class Example {

    // Define instance variables
    private int number;
    private String name;

    // Define accessor (getter) methods
    public int getNumber() {
      return number; 
    }

    public String getName() {
      return name; 
    }

    // Define mutator (setter) methods
    public void setNumber(int number)
    {
        this.number = number;
    }

    public void setName(String name) { this.name = name; }

    // Define other methods
    public void printDetails()
    {
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
    }
}
# feature 201 changes by vivek for the service module in HDFC project in oct 2023
import java.io.*;

// Class 1
// Helper class
class Test {

    public static int i = 0;

    // Constructor of class
    Test()
    {

        // Counts the number of the objects of the class
        i++;
    }

    // Method 1
    // To access static members of the class and
    // and for getting total no of objects
    // of the same class created so far
    public static int get()
    {

        // statements to be executed....
        return i;
    }

    // Method 2
    // Instance method calling object directly
    // that is created inside another class 'GFG'.

    // Can also be called by object directly created in the
    // same class and from another method defined in the
    // same class and return integer value as return type is
    // int.
    public int m1()
    {

        // Display message only
        System.out.println(
            "Inside the method m1 by object of GFG class");

        // Calling m2() method within the same class.
        this.m2();

        // Statements to be executed if any
        return 1;
    }

    // Method 3
    // Returns nothing
    public void m2()
    {

        // Print statement
        System.out.println(
            "In method m2 came from method m1");
    }
}

// Class 2
// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating object of above class inside the class
        Test obj = new Test();

        // Calling method 2 inside main() method
        int i = obj.m1();

        // Display message only
        System.out.println(
            "Control returned after method m1 :" + i);

        // Call m2() method
        // obj.m2();
        int no_of_objects = Test.get();

        // Print statement
        System.out.print(
            "No of instances created till now : ");

        System.out.println(no_of_objects);
    }
}
# close the method for feature 201
