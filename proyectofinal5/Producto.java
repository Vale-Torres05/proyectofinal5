package proyectofinal5;

public class Producto {
    
     private String tipoCarro;
    private int codigo;
    private String marca;
    private boolean estado;
    private String descripcion;
    private double precio;

    public Producto(String tipoCarro, int codigo, String marca, boolean estado, String descripcion, double precio) {
        this.tipoCarro = tipoCarro;
        this.codigo = codigo;
        this.marca = marca;
        this.estado = estado;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Producto() {
        this.tipoCarro = "";
        this.codigo = 0;
        this.marca = "";
        this.estado = true;
        this.descripcion = "";
        this.precio = 0;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Tipo carro: " + this.tipoCarro
                + "\nCodigo: " + this.codigo
                + "\nMarca: " + this.marca
                + "\nEstado: " + this.estado
                + "\nDescripcion: " + this.descripcion
                + "\nPrecio: " + this.precio
                + "\n");
    }
    
}
