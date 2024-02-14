
/** Programmers:  [Shane and Hans]
* Course:  CS 212
* Due Date: February 18, 2024
* Lab Assignment: 4
* Problem Statement: Create a new class named Sphere and use it to create sphere objects and to detect sphere collisions.
* Data In: none
* Data Out: Surface area and volue
* Credits: [Is your code based on an example in the book, in class, or something else?
*            Reminder: you should never take code from the Internet or another person
*/


class Sphere {
    public String name;
    public double radius, x, y, z;
    // General Constructor
    public Sphere(String name, double radius, double x, double y, double z) {
        this.name = name;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Default Constructor
    public Sphere(){
        this.name = "Unknown";
        this.radius = 1;
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    // Surface area method
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    // Volume method
    public double volume() {
        return (double) 4/3 * Math.PI * Math.pow(radius, 3);
    }
    // Distance method
    public double distance(double x_2, double y_2, double z_2) {
        return Math.sqrt(Math.pow((x - x_2), 2) + Math.pow((y - y_2), 2) + Math.pow((z - z_2), 2));
    }
    // Collision method
    public boolean collision(double radius_2, double x_2, double y_2, double z_2){
        return distance(x_2, y_2, z_2) < (radius + radius_2);
    }
    public static void main(String[] args) {
       System.out.println("Spheres Go Here");


    }
}
