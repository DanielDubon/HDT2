package Tests;

import Model.PostfizCalculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class PostfizCalculatorTest {

    //Tests sketch
    private PostfizCalculator calculator = new PostfizCalculator();
    private int resultado;
    @Test
    public void suma() {
        resultado = calculator.suma(1,3);
        assertEquals(4,resultado);

    }

    @Test
    public void resta() {
        resultado = calculator.resta(4,2);
        assertEquals(2,resultado);

    }

    @Test
    public void multiplicacion() {
        resultado = calculator.multiplicacion(5,5);
        assertEquals(25,resultado);
    }

    @Test
    public void division() {
        resultado = calculator.division(10,2);
        assertEquals(5,resultado);
    }
}