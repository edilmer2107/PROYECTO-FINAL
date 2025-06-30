
package Entidades;

public class Producto {
    private static int contInstancias = 0;
    private int id;
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

    public Producto() {
        Producto.contInstancias++;
        this.id = Producto.contInstancias;
    }

    public Producto(String nombre, String categoria, double precio, int stock) {
        Producto.contInstancias++;
        this.id = Producto.contInstancias;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
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
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return this.nombre +" "+ this.precio;
    }
    
    public String verDatos(){
        return  "Nombre: " + this.nombre +  "\n" +
                "Categoria: " + this.categoria +  "\n" +
                "Precio: " + this.precio +  "\n" +
                "Stock: " + this.stock +  "\n";
    }
    
    
    
    
    
    
}
