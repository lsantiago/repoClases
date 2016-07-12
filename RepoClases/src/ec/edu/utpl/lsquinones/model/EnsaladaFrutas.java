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
public class EnsaladaFrutas {
    private String[] listaFrutas = {"melones", "piñas"};
    private int porciones = 4;

    public EnsaladaFrutas(String[] ingredientes, int numporciones){
        listaFrutas = ingredientes;
        porciones = numporciones;
    }

    public EnsaladaFrutas() {
    }
    


    public String[] getListaFrutas() {
        return listaFrutas;
    }

    public int getPorciones() {
        return porciones;
    }

    public void setListaFrutas(String[] listaFrutas) {
        this.listaFrutas = listaFrutas;
    }

    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }
    
    public String servir(){
        if(this.porciones > 0){
            this.porciones--;
            return "Buen provecho";
        }else{
            return "Lo siento";
        }
    }
    
}
