package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculadora {

    @Test
    void testSuma() {
        Calculadora Calculadora = new Calculadora();
        float resultado = Calculadora.sumar(4,3);
        Assert.assertEquals(7, resultado,0);
    }

    @Test
    void testResta() {
        Calculadora Calculadora = new Calculadora();
        float resultado = Calculadora.restar(4,3);
        Assert.assertEquals(1,resultado,0);
    }

    @Test
    void testMultiplicar() {
        Calculadora Calculadora = new Calculadora();
        float resultado = Calculadora.multiplicar(4,3);
        Assert.assertEquals(12, resultado,0);
    }

     @Test
    void testDividir() {
        Calculadora Calculadora = new Calculadora();
        float resultado = Calculadora.dividir(4,3);
        Assert.assertEquals(1, resultado,0);
     }
}
