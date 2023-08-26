package proyectofinal5;

public class Cliente {
    
          private String nombre;
    private String cedula;
    private String direccion;
    private int telefono;
    private String correo;

    public Cliente(String nombre, String cedula, String direccion, int telefono, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

   public Cliente() { 
       this.nombre = ""; 
       this.cedula = ""; 
       this.direccion = ""; 
       this.telefono = 0; 
       this.correo = ""; 
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void mostrarCliente() {
        System.out.println("Nombre: " + this.nombre
                + "\nCedula: " + this.cedula
                + "\nDireccion: " + this.direccion
                + "\nTelefono: " + this.telefono
                + "\nCorreo: " + this.correo
                + "\n\n\n");
    }
}
