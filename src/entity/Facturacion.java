package entity;

import java.util.Date;
import java.util.List;

public class Facturacion {

    private int idFactura;

    private int idCliente;

    private List<Producto> productos;

    private Date fechaVenta;

    private double total;

    public Facturacion() {
    }

    public Facturacion(int idFactura, int idCliente, List<Producto> productos, Date fechaVenta, double total) {
        this.idFactura = idFactura;
        this.idCliente = idCliente;
        this.productos = productos;
        this.fechaVenta = fechaVenta;
        this.total = total;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
