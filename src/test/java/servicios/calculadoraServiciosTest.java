/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package servicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gerda
 */
public class calculadoraServiciosTest {
    
     static calculadoraServicios instance ;
    
    public calculadoraServiciosTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
      instance = new calculadoraServicios();
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of suma method, of class calculadoraServicios.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        double num1 = 2;
        double num2 = 1;
       
        double expResult = 4;
        double result = instance.suma(num1, num2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of resta method, of class calculadoraServicios.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        double num1 = 5;
        double num2 = 2;
        
        double expResult =3;
        double result = instance.resta(num1, num2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of multi method, of class calculadoraServicios.
     */
    @Test
    public void testMulti() {
        System.out.println("multi");
        double num1 = 2;
        double num2 = 2;
        
        double expResult = 4;
        double result = instance.multi(num1, num2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of division method, of class calculadoraServicios.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        double num1 = 10;
        double num2 = 5;
       
        double expResult = 2;
        double result = instance.division(num1, num2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
   
    }
    
}
