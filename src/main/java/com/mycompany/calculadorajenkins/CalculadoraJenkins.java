/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorajenkins;

import servicios.calculadoraServicios;

/**
 *
 * @author gerda
 */
public class CalculadoraJenkins {

    public static void main(String[] args) {
        calculadoraServicios CS = new calculadoraServicios();
        
        System.out.println(CS.suma(2, 3));
        System.out.println(CS.resta(5, 2));
        System.out.println(CS.multi(5, 5));
        System.out.println(CS.division(10, 2));
    }
}
