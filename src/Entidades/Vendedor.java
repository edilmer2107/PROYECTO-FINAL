package entidades;

public class Vendedor {
    private static int contInstancias=0;
    private int id;
    private String nombres;
    private String apellidos;
    private String dni;
    private String correo;

    public Vendedor() {
        Vendedor.contInstancias++;
       this.id = Vendedor.contInstancias;
    }

    public Vendedor(String nombres, String apellidos, String dni, String correo) {
        Vendedor.contInstancias++;
       this.id = Vendedor.contInstancias;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return this.nombres + this.apellidos;
    }

    public String verDatos(){
        return  "Nombres: " + nombres +  "\n" +
                "Apellidos: " + apellidos +  "\n" +
                "DNI: " + dni +  "\n" +
                "Correo: " + correo +"\n";
    }
   
}