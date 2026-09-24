package org.example.ghudsansystemarkitekturuppgift2.minidicontainer;

import java.lang.reflect.Constructor;

/**
 * [Part 2 - Question 1 Solution]: Create a simple “container” class with a
 * method to return an instance of a requested class.
 */
public class MiniDIContainer {

    public <T> T getInstance(Class<T> clazz) throws Exception {
        // Hint: Reflection will be useful. You can assume each class has only one constructor.
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        Constructor<?> constructor = constructors[0];
        Class<?>[] parameterTypes = constructor.getParameterTypes();

        // Base case: If the constructor has no parameters, instantiate it immediately
        if (parameterTypes.length == 0) {
            return clazz.getDeclaredConstructor().newInstance();
        }

        Object[] constructorArgs = new Object[parameterTypes.length];

        // [Part 2 - Question 2 Solution]: If the requested class has a constructor with parameters,
        // the container should recursively request those dependencies as well.
        for (int i = 0; i < parameterTypes.length; i++) {
            Class<?> dependencyType = parameterTypes[i];

            // Map the interface requirements dynamically to our part 1 manual constructor classes
            if (dependencyType == org.example.ghudsansystemarkitekturuppgift2.Engine.class) {
                dependencyType = org.example.ghudsansystemarkitekturuppgift2.manualconstructor.V8Engine.class;
            }

            // Recursive invocation to resolve deep dependencies
            constructorArgs[i] = getInstance(dependencyType);
        }

        return (T) constructor.newInstance(constructorArgs);
    }
}


