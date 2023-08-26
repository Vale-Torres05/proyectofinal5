package proyectofinal5;

import javax.swing.JOptionPane;

public class listaProductos {
    
    public Producto[] registro;
    
    public listaProductos() {
        this.registro = new Producto[3];
        this.registro[0] = new Producto("Corolla",100,"Toyota", true, "Sedan", 1000000000);
        this.registro[1] = new Producto("Tucson",101,"Hyundai", true, "SUV", 1500000);
        this.registro[2] = new Producto("M3",203,"BMW", true, "Deportivo", 2000000);
    }
    
    

    public void leerRegistro() {
        for (int i = 0; i < this.registro.length; i++) {
            this.registro[i].mostrarProducto();

        }
    }
    
        public void agregarProducto() {
        Producto[] registro_N = new Producto[this.registro.length + 1];
        for (int i = 0; i < this.registro.length; i++) {
            registro_N[i] = this.registro[i];

        }

        String tipo = JOptionPane.showInputDialog("Digite el tipo del producto");
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del producto"));
        String mar = JOptionPane.showInputDialog("Digite la marca del producto");
        boolean est = true;
        String desc = JOptionPane.showInputDialog("Digite la descripcion del producto");
        double prec = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio del producto"));
        registro_N[registro_N.length - 1] = new Producto(tipo, cod, mar, est, desc, prec);
        this.registro = registro_N;
        
    }
        
        
       
        
        
        
         public void eliminarProducto() {
        String productoEliminar = JOptionPane.showInputDialog("Ingrese el tipo de carro que desea eliminar: ");

        int opcionEliminar = -1;
        for (int i = 0; i < this.registro.length; i++) {
            if (this.registro[i].getTipoCarro().equalsIgnoreCase(productoEliminar)) {
                opcionEliminar = i;
                break;

            }

        }

        if (opcionEliminar == -1) {
            JOptionPane.showMessageDialog(null, "El tipo de carro no se encuentra, error.");
            return;
        }

        Producto[] registro_N = new Producto[this.registro.length - 1];
        int contador = 0;
        for (int i = 0; i < this.registro.length; i++) {
            if (i != opcionEliminar) {
                registro_N[contador] = this.registro[i];
                contador++;

            }

        }

        this.registro = registro_N;
        JOptionPane.showMessageDialog(null, "El producto ha sido eliminado.");

    }
    
}
