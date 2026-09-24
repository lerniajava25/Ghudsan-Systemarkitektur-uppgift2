package org.example.ghudsansystemarkitekturuppgift2.weld;

import jakarta.enterprise.context.Dependent;

/**
 * [Part 3 - Question 3 Solution]: Annotate your classes with CDI annotations.
 * •@Dependent – default scope, a new instance is created each time.
 */
@Dependent
public class DependentWorker {
    public void doWork() {
        System.out.println("Dependent Worker performing tasks!");
    }
}

