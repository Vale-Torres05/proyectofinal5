package proyectofinal5;

import javax.swing.JOptionPane;

public class listaProveedores {
    
    public Proveedor[] registro;

    public listaProveedores() {
        this.registro = new Proveedor[3];
        this.registro[0] = new Proveedor("TOYOTA");
        this.registro[1] = new Proveedor("NISSAN");
        this.registro[2] = new Proveedor("BMW");
    }

    public void leerRegistroProveedores() {
        for (int i = 0; i < this.registro.length; i++) {
            this.registro[i].mostrarProveedor();

        }
    }

    public void agregarProveedor() {
        Proveedor[] registro_N = new Proveedor[this.registro.length + 1];
        for (int i = 0; i < this.registro.length; i++) {
            registro_N[i] = this.registro[i];

        }

        String marca = JOptionPane.showInputDialog("Digite el nombre del nuevo proveedor (marca vehiculo): ");

        registro_N[registro_N.length - 1] = new Proveedor(marca);
        this.registro = registro_N;
    }
    
    
    
    
    public void modificarProovedorEspecifico() {
        String nombreProveedor = JOptionPane.showInputDialog("Digite el nombre del proveedor que desea modificar");

        Proveedor proveedorModificar = null;
        for (Proveedor proveedor : this.registro) {
            if (proveedor.getMarcaVehiculo().equals(nombreProveedor)) {
                proveedorModificar = proveedor;
                break;
            }
        }

        if (proveedorModificar != null) {

            String nuevoProveedor = JOptionPane.showInputDialog("Digite el nuevo nombre del proveedor: ");
            
            proveedorModificar.setMarcaVehiculo(nuevoProveedor);


            JOptionPane.showMessageDialog(null, "Proveedor modificado con exito.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro un proveedor con el nombre que indico");
        }
    }

    public void eliminarProveedor() {
        String proveedorEliminar = JOptionPane.showInputDialog("Ingrese el proveedor (marca vehiculo) a eliminar: ");

        int opcionEliminar = -1;
        for (int i = 0; i < this.registro.length; i++) {
            if (this.registro[i].getMarcaVehiculo().equalsIgnoreCase(proveedorEliminar)) {
                opcionEliminar = i;
                break;

            }

        }

        if (opcionEliminar == -1) {
            JOptionPane.showMessageDialog(null, "El proveedor no se encuentra, error.");
            return;
        }

        Proveedor[] registro_N = new Proveedor[this.registro.length - 1];
        int contador = 0;
        for (int i = 0; i < this.registro.length; i++) {
            if (i != opcionEliminar) {
                registro_N[contador] = this.registro[i];
                contador++;

            }

        }

        this.registro = registro_N;
        JOptionPane.showMessageDialog(null, "El proveedor ha sido eliminado.");

    }
    
}
