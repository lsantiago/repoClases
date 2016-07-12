

package ec.edu.utpl.lsquinones.model;

/**
 *
 * @author Jean Mosquera
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;

    public Estudiante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    
    
}
