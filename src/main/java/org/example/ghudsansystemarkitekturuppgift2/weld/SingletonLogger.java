package org.example.ghudsansystemarkitekturuppgift2.weld;
import jakarta.inject.Singleton;

/**
 * [Part 3 - Question 3 Solution]: Annotate your classes with CDI annotations.
 * •@Singleton – alternative to @ApplicationScoped.
 */
@Singleton
public class SingletonLogger {
    public void log(String msg) {
        System.out.println("[Singleton Log]: " + msg);
    }
}

