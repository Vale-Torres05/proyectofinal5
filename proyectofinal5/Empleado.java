package proyectofinal5;

public class Empleado {
    
     private String nombre;
    private String cedula;
    private double salario;
    private String puesto;

    public Empleado(String nombre, String cedula, double salario, String puesto) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.salario = salario;
        this.puesto = puesto;
    }
    
    public Empleado() {
        this.nombre = "";
        this.cedula = "";
        this.salario = 0;
        this.puesto = "";
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void mostrarEmpleado() {
        System.out.println("Nombre: " + this.nombre
                + "\nCedula: " + this.cedula
                + "\nSalario: " + this.salario
                + "\nPuesto: " + this.puesto
                + "\n\n\n");
    }
    
}
