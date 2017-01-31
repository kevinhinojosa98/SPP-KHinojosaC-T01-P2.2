/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Kevin Gerardo Hinojosa Castellanos A01411383  IMT
package spp.khinojosac.t01.pkg22;

import java.util.Scanner;

/**
 *
 * @author Kevin Hinojosa
 */
public class SPPKHinojosaCT0122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculadora de perímetro y superficie de un rectángulo");
        
        //Variables. 
        double base, altu;
        double per, sup;
        
            
        System.out.println("Introduce la base ");
        base = teclado.nextDouble();
        System.out.println("Introduce la altura ");
        altu = teclado.nextDouble();
        //
        //Operaciones Lógicas.
        per = (base + altu + base + altu);
        sup = (base * altu);
        
        System.out.println("Perimetro: " + per);
      
        System.out.println("Superficie: " + sup);
        
        
   
        // TODO code application logic here
    }
    
}
