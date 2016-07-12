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
public class Mensaje {
    private String fecha;
    private String descripcion;
    private String nombre;

    public Mensaje(String fecha, String descripcion, String nombre) {
        this.fecha = fecha;
        setDescripcion(descripcion);
        this.nombre = nombre;
    }

    public Mensaje() {
    }
    
    public Mensaje(String descripcion, String nombre){
        setDescripcion(descripcion);
        this.nombre = nombre;
    }
    
    
    public String getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setDescripcion(String descripcion) {
        if(descripcion != null){
            this.descripcion = descripcion;
        }else{
            System.out.println("Descripción incorrecta");
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
