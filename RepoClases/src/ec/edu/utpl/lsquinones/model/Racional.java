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
public class Racional {
    private int numerador;
    private int denominador;

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        if(denominador != 0){
            this.denominador = denominador;
        }else{
           throw new IllegalArgumentException("El denominador no puede ser 0.");
        }
        
    }
    
    
    
    
    
}
