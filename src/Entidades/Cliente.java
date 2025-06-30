    
package Entidades;

public class Cliente {
    private static int contInstancias = 0;
    private int id;
    private String nombre, apellidos, dni, telef, direccion, correo;

    public Cliente() {
       Cliente.contInstancias++;
       this.id = Cliente.contInstancias;
    }

    public Cliente(String nombre, String apellidos, String dni, String telef, String direccion, String correo) {
        Cliente.contInstancias++;
        this.id = Cliente.contInstancias;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telef = telef;
        this.direccion = direccion;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelef() {
        return telef;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return this.apellidos+ " " + this.nombre;
    } 
    
    
    public String verDatos(){
        return  "Nombre: " + nombre +  "\n" +
                "Apellidos: " + apellidos +  "\n" +
                "DNI: " + dni +  "\n" +
                "Telefono: " + telef +  "\n" +
                "Direccion: " + direccion +  "\n" +
                "Correo: " + correo +"\n";
    }
}