package poop6;

/**
 * @author EIMV
 */
public class Persona {
    private int edad;
    private String direccion, nombre, apellido;

    public Persona() {
    }

    public Persona(int edad, String direccion, String nombre, String apellido) {
        this.edad = edad;
        this.direccion = direccion;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void hablar(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre:" + nombre + ", Apellido:"
                       + "" + apellido + ", Edad:" + edad +", Direccion: " 
                       + direccion + '}';    
    }


}
