package proyectofinal5;

import java.util.Date;

public class Ventas {
    
     private int numVenta;
    private double montoFacturado;
    private Producto producto;
    private String metodoPago;
    private Cliente infoComprador;
    private Empleado infoVendedor;
    private Date fecha;

    public Ventas(int numVenta, double montoFacturado, Producto producto, String metodoPago, Cliente infoComprador, Empleado infoVendedor, Date fecha) {
        this.numVenta = numVenta;
        this.montoFacturado = montoFacturado;
        this.producto = producto;
        this.metodoPago = metodoPago;
        this.infoComprador = infoComprador;
        this.infoVendedor = infoVendedor;
        this.fecha = fecha;
    }

    public Ventas() {
        this.numVenta = numVenta;
        this.montoFacturado = montoFacturado;
        this.producto = producto;
        this.metodoPago = metodoPago;
        this.infoComprador = infoComprador;
        this.infoVendedor = infoVendedor;
        this.fecha = fecha;
    }

    public int getNumVenta() {
        return numVenta;
    }

    public void setNumVenta(int numVenta) {
        this.numVenta = numVenta;
    }

    public double getMontoFacturado() {
        return montoFacturado;
    }

    public void setMontoFacturado(double montoFacturado) {
        this.montoFacturado = montoFacturado;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Cliente getInfoComprador() {
        return infoComprador;
    }

    public void setInfoComprador(Cliente infoComprador) {
        this.infoComprador = infoComprador;
    }
    
    public Empleado getInfoVendedor() {
        return infoVendedor;
    }

    public void setInfoVendedor(Empleado infoVendedor) {
        this.infoVendedor = infoVendedor;
    } 

    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    } 
    
    public String toString() { 
         return "Numero de Venta: " + this.numVenta + " Monto facturado: " + this.montoFacturado + " Producto: " + this.producto.getTipoCarro() + " Metodo de pago: " + this.getMetodoPago();
    }
    
}
