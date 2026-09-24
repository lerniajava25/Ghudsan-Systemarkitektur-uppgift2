package org.example.ghudsansystemarkitekturuppgift2.manualconstructor;

import org.example.ghudsansystemarkitekturuppgift2.Car;
import org.example.ghudsansystemarkitekturuppgift2.Engine;

public class Part1Main {
    public static void main(String[] args) {
        System.out.println("--- Part 1: Manual Constructor Injection ---");

        // [Part 1 - Question 2 Solution]: In a Main class, manually instantiate
        // the dependencies and pass them into constructors.
        Engine engine = new V8Engine();
        Car car = new SportsCar(engine);

        // [Part 1 - Question 3 Solution]: Run the application and confirm that dependencies are correctly wired.
        car.drive();
    }
}


