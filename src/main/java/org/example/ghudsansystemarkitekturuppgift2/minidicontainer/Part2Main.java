package org.example.ghudsansystemarkitekturuppgift2.minidicontainer;
import org.example.ghudsansystemarkitekturuppgift2.manualconstructor.SportsCar;

public class Part2Main {
    public static void main(String[] args) {
        System.out.println("--- Part 2: A Minimal DI Container ---");
        try {
            MiniDIContainer container = new MiniDIContainer();

            // [Part 2 - Question 3 Solution]: Demonstrate this by asking the container only
            // for a top-level class and verifying that the entire dependency graph is created automatically.
            SportsCar car = container.getInstance(SportsCar.class);
            car.drive();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

