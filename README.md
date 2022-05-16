# Practica5
Practica 5 de entronos de Desarrollo por Abril Frongia (@AbrilF) y Daniel Sastre(@DSastreHernandez)

## Interfaz ICalculadora
...
public interface ICalculadora {
    // Esta es la interfaz

    public float sumar(float a, float b);

    public float restar(float a, float b);

    public float multiplicar(float a, float b);

    public float dividir(float a, float b);
}
...

## Clase Calculadora
...
package org.example;

public class Calculadora implements ICalculadora{
    //Con un contstructor vacio y todos sus metodos
    public Calculadora() {}

    @Override
    public float sumar(float a, float b) { return a+b; }

    @Override
    public float restar(float a, float b) {
        return a-b;
    }

    @Override
    public float multiplicar(float a, float b) {
        return a*b;
    }

    @Override
    public float dividir(float a, float b) {
        return a/b;
    }
}
...

## Clase CalculadoraTest
...
package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void sumar() {
        Calculadora calculadora = new Calculadora();

        float resultado = calculadora.sumar(4,3);
        assertEquals(7, resultado,0);

        float resultado2 = calculadora.sumar(8,2);
        assertEquals(10,resultado2,0);

        float resultado3 = calculadora.sumar(7,11);
        assertEquals(18,resultado3,0);
    }

    @Test
    public void restar() {
        Calculadora calculadora = new Calculadora();

        float resultado = calculadora.restar(4,3);
        assertEquals(1, resultado,0);

        float resultado2 = calculadora.restar(8,2);
        assertEquals(6,resultado2,0);

        float resultado3 = calculadora.restar(7,11);
        assertEquals(-4,resultado3,0);
    }

    @Test
    public void multiplicar() {
        Calculadora calculadora = new Calculadora();

        float resultado = calculadora.multiplicar(4,3);
        assertEquals(12, resultado,0);

        float resultado2 = calculadora.multiplicar(8,2);
        assertEquals(16,resultado2,0);

        float resultado3 = calculadora.multiplicar(7,11);
        assertEquals(77,resultado3,0);
    }

    @Test
    public void dividir() {
        Calculadora calculadora = new Calculadora();

        float resultado = calculadora.dividir(4,3);
        assertEquals(1.3333333730697632, resultado,0);

        float resultado2 = calculadora.dividir(8,2);
        assertEquals(4,resultado2,0);

        float resultado3 = calculadora.dividir(7,11);
        assertEquals(0.6363636255264282,resultado3,0);
    }
}
...

## Resultado de los tests
![Captura desde 2022-05-16 14-28-36](https://user-images.githubusercontent.com/91556389/168595552-eb990be2-c9fe-406d-845e-a9bcc2ab1560.png)

## Ramas

![ramas drawio](https://user-images.githubusercontent.com/91556389/168597771-4e251f8e-1fef-40d2-abec-3e909076b1d9.png)

