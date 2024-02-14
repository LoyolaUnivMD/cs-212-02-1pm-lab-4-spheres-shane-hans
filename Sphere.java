
/** Programmers:  [your names here]
* Course:  CS 212
* Due Date:
* Lab Assignment:
* Problem Statement:
* Data In:
* Data Out:
* Credits: [Is your code based on an example in the book, in class, or something else?
*            Reminder: you should never take code from the Internet or another person
*/


class Sphere {
    private double radius, x, y, z;
    // General Constructor
    public Sphere(double radius, double x, double y, double z) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Default Constructor
    public Sphere(){
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
    // Distance method
    // Collision method
    public static void main(String[] args) {
       System.out.println("Spheres Go Here");


    }
}
