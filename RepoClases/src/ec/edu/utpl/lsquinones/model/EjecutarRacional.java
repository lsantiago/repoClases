/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.utpl.lsquinones.model;

/**
 *
 * @author Santiago Quiñones
 */
public class EjecutarRacional {
    public static void main(String[] args) {
        Racional x = new Racional(1, 3);
        Racional y = new Racional(5, 7);
        Racional z = new Racional(3, 2);
        
    
        Racional r = x.sumar(y).sumar(z);
        
        System.out.println("Numerador de r: " + r.getNumerador());
        System.out.println("Denominador de r: " + r.getDenominador());
        System.out.println("El mayor entre x y y es:" + x.obtenerMayor(y).toString());
        
        
       
    }
}
