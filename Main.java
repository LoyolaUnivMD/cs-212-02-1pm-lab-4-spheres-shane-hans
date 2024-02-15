/** Programmers:  Shane and Hans
* Course:  CS 212
* Due Date: 2/18
* Lab Assignment: 4
* Problem Statement: Detect sphere collisions
* Data In: 3d coordinate
* Data Out: Surface areas and volumes of each planet, collisions between spheres, closest point to user location
* Credits: n/a [Is your code based on an example in the book, in class, or something else?
*            Reminder: you should never take code from the Internet or another person
*/

import java.util.Scanner;

class Main {
    public static double checkDouble(Scanner input, String prompt) {
        System.out.println(prompt);
        while (!input.hasNextDouble()) {
            System.out.println("Enter a double value: ");
            input.next();
        }
        return input.nextDouble();
    }
    public static void main(String[] args) {
       System.out.println("Music of the Spheres\n");


       // Initialize three spheres
        Sphere sun = new Sphere("sun", 43.26, 0.0, 0.0, 0.0);
        Sphere earth = new Sphere("earth", 0.395, 26.0, 42.0, 79.0);
        Sphere planetX = new Sphere("planetX", 1.4, 25.3, 43.1, 77.8);

       // Print surface area and volume of the three spheres
        System.out.println(sun.name + ":\nSurface Area - " + sun.surfaceArea() + "\nVolume - " + sun.volume() + "\n");
        System.out.println(earth.name + ":\nSurface Area - " + earth.surfaceArea() + "\nVolume - " + earth.volume() + "\n");
        System.out.println(planetX.name + ":\nSurface Area - " + planetX.surfaceArea() + "\nVolume - " + planetX.volume() + "\n");

        // Collision check
        if (sun.collision(earth.radius, earth.x, earth.y, earth.z)) {
            System.out.println("The sun and earth's spheres have collided.\n");
        }
        if (sun.collision(planetX.radius, planetX.x, planetX.y, planetX.z)) {
            System.out.println("The sun and planetX's spheres have collided.\n");
        }
        if (planetX.collision(earth.radius, earth.x, earth.y, earth.z)) {
            System.out.println("PlanetX and earth's spheres have collided.\n");
        }

        // Get user input for a 3D location
        Scanner input = new Scanner(System.in);

        double loc_x = checkDouble(input, "Enter an x coordinate: ");
        double loc_y = checkDouble(input, "Enter a y coordinate: ");
        double loc_z = checkDouble(input, "Enter a z coordinate: ");


        // Check which sphere the user's location is closest to
        double distanceToSun = sun.distance(loc_x, loc_y, loc_z);
        double distanceToEarth = earth.distance(loc_x, loc_y, loc_z);
        double distanceToPlanetX = planetX.distance(loc_x, loc_y, loc_z);
        if (distanceToSun < distanceToEarth && distanceToSun < distanceToPlanetX) {
            System.out.println("The location is closest to the Sun.");
        } else if (distanceToEarth < distanceToSun && distanceToEarth < distanceToPlanetX) {
            System.out.println("The location is closest to the Earth.");
        } else {
            System.out.println("The location is closest to planetX.");
        }

    }
}
