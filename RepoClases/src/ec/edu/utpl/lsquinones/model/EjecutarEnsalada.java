/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.utpl.lsquinones.model;

import java.util.Arrays;

/**
 *
 * @author Santiago Quiñones
 */
public class EjecutarEnsalada {
    public static void main(String[] args) {
        String[] lista = {"manzana", "pera", "banana"};
        
        EnsaladaFrutas ensalada = new EnsaladaFrutas(lista, 10);
        System.out.println("Número de porciones: " + ensalada.getPorciones());
        System.out.println("Lista de ingredientes: " + 
                Arrays.deepToString(ensalada.getListaFrutas()));
        
        System.out.println(ensalada.servir());
        System.out.println(ensalada.servir());
        System.out.println(ensalada.servir());
        System.out.println(ensalada.servir());
        ensalada.setPorciones(1);
        System.out.println(ensalada.servir());
        System.out.println(ensalada.servir());
        
    }
}
