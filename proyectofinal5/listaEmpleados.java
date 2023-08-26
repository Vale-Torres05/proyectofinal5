package proyectofinal5;

import javax.swing.JOptionPane;

public class listaEmpleados {
    
    public Empleado[] registro;

    public listaEmpleados() {
        this.registro = new Empleado[3];
        this.registro[0] = new Empleado("Valeria", "118990487", 5000.0, "Ingeniera en software");
        this.registro[1] = new Empleado("Valeria", "123456789", 500.0, "Ingeniera en software");
        this.registro[2] = new Empleado("Isaac", "123456789", 500.0, "Ingeniero en software");
    }

    public void leerRegistroEmpleados() {
        for (int i = 0; i < this.registro.length; i++) {
            this.registro[i].mostrarEmpleado();

        }
    }
    

    public void agregarEmpleado() {
        Empleado[] registro_N = new Empleado[this.registro.length + 1];
        for (int i = 0; i < this.registro.length; i++) {
            registro_N[i] = this.registro[i];

        }

        String nom = JOptionPane.showInputDialog("Digite el nombre del empleado: ");
        String cedu = JOptionPane.showInputDialog("Digite la cedula del empleado: ");
        double sal = Integer.parseInt(JOptionPane.showInputDialog("Digite el salario del empleado: "));
        String puesto = JOptionPane.showInputDialog("Digite el puesto del empleado: ");
        
        registro_N[registro_N.length - 1] = new Empleado(nom, cedu, sal, puesto);
        this.registro = registro_N;
    }

    public void eliminarEmpleado() {
        String empleadoEliminar = JOptionPane.showInputDialog("Ingrese el nombre del empleado a eliminar: ");

        int opcionEliminar = -1;
        for (int i = 0; i < this.registro.length; i++) {
            if (this.registro[i].getNombre().equalsIgnoreCase(empleadoEliminar)) {
                opcionEliminar = i;
                break;

            }

        }

        if (opcionEliminar == -1) {
            JOptionPane.showMessageDialog(null, "El empleado no se encuentra, error.");
            return;
        }

        Empleado[] registro_N = new Empleado[this.registro.length - 1];
        int contador = 0;
        for (int i = 0; i < this.registro.length; i++) {
            if (i != opcionEliminar) {
                registro_N[contador] = this.registro[i];
                contador++;

            }

        }

        this.registro = registro_N;
        JOptionPane.showMessageDialog(null, "El empleado ha sido eliminado.");

    }

    public void modificarEmpleadoEspecifico() {
        String nombreEmpleado = JOptionPane.showInputDialog("Digite el nombre del empleado que desea modificar");

        Empleado empleadoModificar = null;
        for (Empleado empleado : this.registro) {
            if (empleado.getNombre().equals(nombreEmpleado)) {
                empleadoModificar = empleado;
                break;
            }
        }

        if (empleadoModificar != null) {
     
            String nuevoNombre = JOptionPane.showInputDialog("Digite el nuevo nombre del empleado: ");
            String nuevaCedula = JOptionPane.showInputDialog("Digite la nueva cedula del empleado: ");
            double nuevoSalario = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuevo salario del empleado: "));
            String nuevoPuesto = JOptionPane.showInputDialog("Digite el nuevo puesto del empleado: ");

            empleadoModificar.setNombre(nuevoNombre);
            empleadoModificar.setCedula(nuevaCedula);
            empleadoModificar.setSalario(nuevoSalario);
            empleadoModificar.setPuesto(nuevoPuesto);

            JOptionPane.showMessageDialog(null, "Empleado modificado con exito.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro un empleado con el nombre que indico");
        }
    }
}
