package org.example.ghudsansystemarkitekturuppgift2.weld;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.example.ghudsansystemarkitekturuppgift2.Car;

public class Part3Main {
    public static void main(String[] args) {
        System.out.println("--- Part 3: Using Weld (CDI) ---");

        // [Part 3 - Question 4 Solution]: Replace your custom container with Weld. Start Weld...
        Weld weld = new Weld();
        try (WeldContainer container = weld.initialize()) {

            // [...Question 4 Continued]: ...and ask it for your top-level class.
            Car car = container.select(Car.class).get();

            // [Part 3 - Question 5 Solution]: Run the application and compare the behavior with Part 1 and Part 2.
            car.drive();
        }
    }
}



