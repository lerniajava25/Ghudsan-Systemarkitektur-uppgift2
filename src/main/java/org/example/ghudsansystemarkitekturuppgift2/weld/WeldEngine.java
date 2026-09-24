package org.example.ghudsansystemarkitekturuppgift2.weld;

import jakarta.enterprise.context.ApplicationScoped;
import org.example.ghudsansystemarkitekturuppgift2.Engine;

/**
 * [Part 3 - Question 3 Solution]: Annotate your classes with CDI annotations.
 * •@ApplicationScoped – the bean lives for the entire lifecycle of the application.
 * Använder @WeldQualifier för att Weld ska veta att denna hör till Part 3.
 */
@ApplicationScoped
@WeldQualifier
public class WeldEngine implements Engine {
    @Override
    public String start() {
        return "Weld Managed V8 Engine roaring!";
    }
}

