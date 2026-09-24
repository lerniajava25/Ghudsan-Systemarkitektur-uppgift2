package org.example.ghudsansystemarkitekturuppgift2.manualconstructor;

import org.example.ghudsansystemarkitekturuppgift2.Car;
import org.example.ghudsansystemarkitekturuppgift2.Engine;

/**
 * [Part 1 - Question 1 Solution]: A should have a dependency on B.
 * SportsCar (A) keeps a strict dependency on Engine (B) via a final field.
 * Hint: Focus on constructor injection — no setters, no static factories.
 */
public class SportsCar implements Car {
    private final Engine engine;

    // Direct Constructor Injection
    public SportsCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("Driving: " + engine.start());
    }
}
