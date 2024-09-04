package org.example;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculadoraTest {
    private static Calculadora calculadora;
    @BeforeAll
    static void setUp() {
        calculadora = new Calculadora();
    }
    @Test
    void adicionarTest(){
        double resultado = calculadora.calcular(1,1,'+');
        assertEquals(2, resultado);
    }
    @Test
    void subtrairTest() {
        double resultado = calculadora.calcular(1, 1, '-');
        assertEquals(0, resultado);
    }
    @Test
    void multiplicarTest(){
        double resultado = calculadora.calcular(2,5,'*');
        assertEquals(10, resultado);
    }
    @Test
    void dividirTest(){
        double resultado = calculadora.calcular(10,5,'/');
        assertEquals(2, resultado);
    }
}
