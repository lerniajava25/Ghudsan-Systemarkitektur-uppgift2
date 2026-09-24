package org.example.ghudsansystemarkitekturuppgift2.manualconstructor;

import org.example.ghudsansystemarkitekturuppgift2.Engine;

/**
 * [Part 1 - Question 1 Solution]: Multiple implementations.
 * A concrete implementation of the Engine interface.
 */
public class V8Engine implements Engine {
    @Override
    public String start() {
        return "Manual V8 Engine roaring!";
    }
}

