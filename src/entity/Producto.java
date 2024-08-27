package entity;

public class Producto {
    
    private int idProducto;
    
    private String nombre;
    
    private double precio;
    
    private int idProveedor;

    public Producto() {
    }

    public Producto(int idProducto, String nombre, double precio, int idProveedor) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.idProveedor = idProveedor;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    
    
    
}
