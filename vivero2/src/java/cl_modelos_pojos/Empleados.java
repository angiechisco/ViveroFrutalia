package cl_modelos_pojos;
// Generated 12/03/2017 03:42:57 PM by Hibernate Tools 4.3.1



/**
 * Empleados generated by hbm2java
 */
public class Empleados  implements java.io.Serializable {


     private String cedula;
     private String nombre;
     private String apellido;
     private String telefono;
     private String correo;
     private String hojaVida;

    public Empleados() {
    }

    public Empleados(String cedula, String nombre, String apellido, String telefono, String correo, String hojaVida) {
       this.cedula = cedula;
       this.nombre = nombre;
       this.apellido = apellido;
       this.telefono = telefono;
       this.correo = correo;
       this.hojaVida = hojaVida;
    }
   
    public String getCedula() {
        return this.cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getHojaVida() {
        return this.hojaVida;
    }
    
    public void setHojaVida(String hojaVida) {
        this.hojaVida = hojaVida;
    }




}


