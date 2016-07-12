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

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        setDenominador(denominador);
    }

    
    
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
    
    
    public Racional sumar(Racional otro){
        return new Racional(numerador * otro.getDenominador() + otro.getNumerador() * denominador,
        denominador * otro.getDenominador());
    }
    
    public boolean esMenorQue(Racional otro){
        return numerador * otro.getDenominador() < otro.getNumerador() * denominador;
    }
    
    public Racional obtenerMayor(Racional otro){
        if(this.esMenorQue(otro)){
            return otro;
        }else{
            return this;
        }
    }
    
    
    public String toString(){
        return String.format("%d/%d", this.numerador, this.denominador);
    }
    
    
    
}
