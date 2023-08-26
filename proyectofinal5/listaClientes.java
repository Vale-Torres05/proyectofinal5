package proyectofinal5;

import javax.swing.JOptionPane;

public class listaClientes {
    
    public Cliente[] registro;

    public listaClientes() {
        this.registro = new Cliente[3];
        this.registro[0] = new Cliente("Valeria MA", "118029292", "San Jose, Curridabat", 88146728, "valema@gmail.com");
        this.registro[1] = new Cliente("Valeria MS", "116897643", "San Jose, Desamparados", 89974314, "valems@gmail.com");
        this.registro[2] = new Cliente("Julian", "143530223", "Heredia, Belen", 60387289, "julian@gmail.com");
    }

    public void leerRegistro() {
        for (int i = 0; i < this.registro.length; i++) {
            this.registro[i].mostrarCliente();

        }
    }

    public void agregarCliente() {
        Cliente[] registro_N = new Cliente[this.registro.length + 1];
        for (int i = 0; i < this.registro.length; i++) {
            registro_N[i] = this.registro[i];

        }

        String nom = JOptionPane.showInputDialog("Digite el nombre del cliente");
        String cedu = JOptionPane.showInputDialog("Digite la cedula del cliente");
        String di = JOptionPane.showInputDialog("Digite la direccion del cliente");
        int tel = Integer.parseInt(JOptionPane.showInputDialog("Digite el telefono del cliente"));
        String corr = JOptionPane.showInputDialog("Digite el correo del cliente");
        registro_N[registro_N.length - 1] = new Cliente(nom, cedu, di, tel, corr);
        this.registro = registro_N;
    }

    public void eliminarCliente() {
        String clienteEliminar = JOptionPane.showInputDialog("Ingrese el nombre del cliente a eliminar: ");

        int opcionEliminar = -1;
        for (int i = 0; i < this.registro.length; i++) {
            if (this.registro[i].getNombre().equalsIgnoreCase(clienteEliminar)) {
                opcionEliminar = i;
                break;

            }

        }

        if (opcionEliminar == -1) {
            JOptionPane.showMessageDialog(null, "El cliente no se encuentra, error.");
            return;
        }

        Cliente[] registro_N = new Cliente[this.registro.length - 1];
        int contador = 0;
        for (int i = 0; i < this.registro.length; i++) {
            if (i != opcionEliminar) {
                registro_N[contador] = this.registro[i];
                contador++;

            }

        }

        this.registro = registro_N;
        JOptionPane.showMessageDialog(null, "El cliente ha sido eliminado.");

    }

    public void modificarClienteEspecifico() {
        String nombreCliente = JOptionPane.showInputDialog("Digite el nombre del cliente que desea modificar");

        Cliente clienteModificar = null;
        for (Cliente cliente : this.registro) {
            if (cliente.getNombre().equals(nombreCliente)) {
                clienteModificar = cliente;
                break;
            }
        }

        if (clienteModificar != null) {

            String nuevoNombre = JOptionPane.showInputDialog("Digite el nuevo nombre del cliente");
            String nuevaCedula = JOptionPane.showInputDialog("Digite la nueva cedula del cliente");
            String nuevaDireccion = JOptionPane.showInputDialog("Digite la nueva direccion del cliente");
            int nuevoTelefono = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuevo telefono del cliente"));
            String nuevoCorreo = JOptionPane.showInputDialog("Digite el nuevo correo del cliente");

            clienteModificar.setNombre(nuevoNombre);
            clienteModificar.setDireccion(nuevaDireccion);
            clienteModificar.setTelefono(nuevoTelefono);
            clienteModificar.setCorreo(nuevoCorreo);

            JOptionPane.showMessageDialog(null, "Cliente modificado con exito.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro un cliente con el nombre que indico");
        }
    }
    
}
