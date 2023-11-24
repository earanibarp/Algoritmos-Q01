/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package encapsulamiento;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author earanibarp
 */
public class CuadrilateroTest {
    
    public CuadrilateroTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcularArea method, of class Cuadrilatero.
     */
    @Test
    public void testCalcularArea() {
        System.out.println("calcularArea");
        Cuadrilatero cuadrilatero = new Cuadrilatero(3, 5);
        float expResult = 15.0F;
        float result = cuadrilatero.calcularArea();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of calcularPerimetro method, of class Cuadrilatero.
     */
    @Test
    public void testCalcularPerimetro() {
        System.out.println("calcularPerimetro");
        Cuadrilatero instance = null;
        float expResult = 0.0F;
        float result = instance.calcularPerimetro();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
