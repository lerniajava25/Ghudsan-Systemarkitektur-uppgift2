package org.example.ghudsansystemarkitekturuppgift2.weld;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.example.ghudsansystemarkitekturuppgift2.Car;
import org.example.ghudsansystemarkitekturuppgift2.Engine;

/**
 * [Part 3 - Question 3 Solution]: @ApplicationScoped hantering.
 */
@ApplicationScoped
public class WeldCar implements Car {
    private final Engine engine;
    private final DependentWorker worker;
    private final SingletonLogger logger;

    /**
     * [Part 3 - Question 3 Solution]: @Inject på konstruktorn.
     * @WeldQualifier talar om för Weld att välja just WeldEngine istället för Part 1:s motor.
     */
    @Inject
    public WeldCar(@WeldQualifier Engine engine, DependentWorker worker, SingletonLogger logger) {
        this.engine = engine;
        this.worker = worker;
        this.logger = logger;
    }

    @Override
    public void drive() {
        logger.log("Ignition sequence started.");
        System.out.println("Driving: " + engine.start());
        worker.doWork();
        logger.log("Trip finished safely.");
    }
}

