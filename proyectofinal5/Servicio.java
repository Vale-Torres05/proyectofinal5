package proyectofinal5;

public class Servicio {
    
      private String tipo;
    private String descripcion;
    private double costo;

    public Servicio(String tipo, String descripcion, double costo) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public Servicio() {
        this.tipo = "";
        this.descripcion = "";
        this.costo = 0;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void mostrarServicio() {
        System.out.println("Tipo: " + this.tipo
                + "\nDescripcion: " + this.descripcion
                + "\nCosto: " + this.costo
                + "\n");
    }
    
}
