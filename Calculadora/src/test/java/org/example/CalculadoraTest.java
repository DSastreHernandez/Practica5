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