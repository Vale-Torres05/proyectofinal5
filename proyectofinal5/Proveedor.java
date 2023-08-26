package proyectofinal5;

public class Proveedor {
    
    private String marcaVehiculo;

    public Proveedor(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public Proveedor() {
        this.marcaVehiculo = "";
    }

    
    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public void mostrarProveedor() {
        System.out.println("Marca Vehiculo: " + this.marcaVehiculo
                + "\n");
    }
    
}
