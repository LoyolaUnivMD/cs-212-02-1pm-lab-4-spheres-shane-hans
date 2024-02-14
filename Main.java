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

import java.util.Scanner;

class Main {
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
        System.out.println("Enter an x coordinate: ");
        while (!input.hasNextDouble()) {
            System.out.println("Enter a double value: ");
            input.next();
        }
        double loc_x = input.nextDouble();

        System.out.println("Enter a y coordinate: ");
        while (!input.hasNextDouble()) {
            System.out.println("Enter a double value: ");
            input.next();
        }
        double loc_y = input.nextDouble();

        System.out.println("Enter a z coordinate: ");
        while (!input.hasNextDouble()) {
            System.out.println("Enter a double value: ");
            input.next();
        }
        double loc_z = input.nextDouble();

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
