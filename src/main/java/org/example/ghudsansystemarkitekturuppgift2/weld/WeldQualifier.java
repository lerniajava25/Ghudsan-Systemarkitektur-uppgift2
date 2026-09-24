package org.example.ghudsansystemarkitekturuppgift2.weld;


import jakarta.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * [Part 3 - Extra skydd]: En egen Qualifier som talar om för Weld
 * exakt vilka klasser som hör till just Part 3 för att undvika krockar.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
public @interface WeldQualifier {
}


