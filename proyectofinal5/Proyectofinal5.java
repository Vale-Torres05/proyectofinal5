package proyectofinal5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Proyectofinal5 {

    public static void main(String[] args) throws ParseException {
        
        
        Empleado em[] = new Empleado[10];
        Empleado em1 = new Empleado("Valeria", "118990487", 500.0, "Ingeniera en software");
        Empleado em2 = new Empleado("Valeria", "123456789", 500.0, "Ingeniera en software");
        Empleado em3 = new Empleado("Isaac", "123456789", 500.0, "Ingeniero en software");
        em[0] = em1;
        em[1] = em2;
        em[2] = em3;
        

        listaEmpleados empleado1 = new listaEmpleados();
        listaClientes cliente1 = new listaClientes();
        listaProveedores proveedor1 = new listaProveedores();
        listaProductos producto1 = new listaProductos();
        listaServicios servicio1 = new listaServicios();
        

        Cliente cli[] = new Cliente[20];
        Cliente cli1 = new Cliente("Gladys", "305450690","Cartago, Ochomogo", 70173867,"quesadasolanogladys@.com");
        Cliente cli2 = new Cliente("Marco", "123456789", "Cartago, La Pitahaya", 60501524, "mtorres@pricesmart.com");
        cli[0] = cli1;
        cli[1] = cli2;


        Producto prod[] = new Producto[20];
        Producto prod1 = new Producto("Corolla",100,"Toyota", true, "Sedan", 10000);
        Producto prod2 = new Producto("Tucson",101,"Hyundai", true, "SUV", 15000);
        Producto prod3 = new Producto("M3",203,"BMW", true, "Deportivo", 20000);
        prod[0] = prod1;
        prod[1] = prod2;
        prod[2] = prod3;


        Proveedor prov[] = new Proveedor[20];
        Proveedor prov1 = new Proveedor("Toyota");
        Proveedor prov2 = new Proveedor("Hyundai");
        Proveedor prov3 = new Proveedor("BMW");
        prov[0] = prov1;
        prov[1] = prov2;
        prov[3] = prov3;
                

        Ventas ven[] = new Ventas[20];
        ven[0] = new Ventas(1, prod1.getPrecio(), prod1, "Credito", cli1, em1, new SimpleDateFormat("dd/MM/yyyy").parse("12/08/2023"));
        ven[1] = new Ventas(2, prod2.getPrecio(), prod1, "Debito", cli2, em2, new SimpleDateFormat("dd/MM/yyyy").parse("11/08/2023"));

        
        String nombreUsuario = JOptionPane.showInputDialog("Escriba su nombre de usuario");
        int contrasenia = Integer.parseInt(JOptionPane.showInputDialog("Escriba su contraseña"));
        if (contrasenia == 123) {
            System.out.println("Bienvenido al sistema " + nombreUsuario);
            
            
            int opc = 1;
                    while (opc != 0) {
                        opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu principal\n"
                    + "1- Empleados\n"
                    + "2- Clientes\n"
                    + "3- Proveedores\n"
                    + "4- Productos\n"
                    + "5- Ventas\n"
                    + "0-Salir\n"
                    + "Digite su opción: ", "Menu Principal", JOptionPane.QUESTION_MESSAGE));  
                    
                    
            switch (opc) {
                case 1:

                    int op = 1;
                    while (op != 0) {
                        op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu empleados\n"
                                        + "1- Registre un empleado\n"
                                        + "2- Muestre los empleados\n"
                                        + "3- Modifica\n"
                                        + "4- Elimina\n"
                                        + "0- Salir\n"
                                        + "Digite su opción: ", "Menu Principal", JOptionPane.QUESTION_MESSAGE));
                        switch (op) {

                            case 1:
                                empleado1.agregarEmpleado();
                                break;
                            case 2:
                                empleado1.leerRegistroEmpleados();
                                break;

                            case 3:
                                empleado1.modificarEmpleadoEspecifico();
                                break;
                            case 4:
                                empleado1.eliminarEmpleado();
                                break;
                            case 0:
                                break;
                        default:
                            JOptionPane.showMessageDialog(null, "Error, opción invalida intente de nuevo", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }

                    break;

                case 2:
                     int opci = 1;
                    while (opci != 0) {
                        opci = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu clientes\n"
                                        + "1- Registre un cliente\n"
                                        + "2- Muestre los clientes\n"
                                        + "3- Modifica\n"
                                        + "4- Elimina\n"
                                        + "0- Salir\n"
                                        + "Digite su opción: ", "Menu Principal", JOptionPane.QUESTION_MESSAGE));
                        switch (opci) {

                            case 1:
                                cliente1.agregarCliente();

                                break;
                            case 2: 
                                cliente1.leerRegistro();
                                break;

                            case 3:
                                cliente1.modificarClienteEspecifico();
                                break;
                            case 4:
                                cliente1.eliminarCliente();
                                break;
                        case 0:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Error, opción invalida intente de nuevo", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }


                    break;

                case 3:
                    int opcion = 1;
                    while (opcion != 0) {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione una opción: \n"
                            + "1- Lista de proveedores\n"
                            + "2- Ingresar nuevos proveedores\n"
                            + "3- Modificar proveedor\n"
                            + "4- Eliminar proveedor\n"
                            + "0- Salir", "Menu Principal", JOptionPane.QUESTION_MESSAGE));
                        switch (opcion) {

                            case 1:
                                proveedor1.leerRegistroProveedores();
                                break;
                            case 2:
                                proveedor1.agregarProveedor();
                                break;

                            case 3:
                                proveedor1.modificarProovedorEspecifico();
                                break;
                            case 4:
                                proveedor1.eliminarProveedor();
                                break;
                            case 0:
                                break;
                        default:
                            JOptionPane.showMessageDialog(null, "Error, opción invalida intente de nuevo", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }

                    break;
                case 4:
                    System.out.println("Productos");
                    int opcion1 = 1;
                    while (opcion1 != 0) {
                    opcion1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione una opción: \n"
                            + "1- Catalogo de autos\n"
                            + "2- Lista de Servicios\n"
                            + "3- Agregar producto\n"
                            + "4- Eliminar producto\n"
                            + "0- Salir", "Menu Principal", JOptionPane.QUESTION_MESSAGE));
                   

                    switch (opcion1) {
                        case 1:
                            producto1.leerRegistro();
                            break;
                        case 2:
                            servicio1.leerRegistro();
                            break;
                        case 3:
                            producto1.agregarProducto();
                            break;
                        case 4:
                            producto1.eliminarProducto();
                            break;
                        case 0:
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Error, opción invalida intente de nuevo", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                    }
                    }
                    break;


                    
                    
                    
                    
                case 5:
                    System.out.println("Ventas");
                     int opcion2 = 1;
                    while (opcion2 != 0) {
             
                    opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione una opción: \n"
                            + "1- Ingresar Venta\n"
                            + "2- Ventas registradas\n"
                            + "3- Modificar registro\n"
                            + "4- Borrar registro\n" 
                            + "5- Ver informacion del comprador\n"
                            + "6- Ver informacion del vendedor\n"
                            + "7- Ver fecha\n"
                            + "0- Salir", "Menu Principal", JOptionPane.QUESTION_MESSAGE));
                    
                    
                    
                    switch (opcion2) {
                        case 1:
                            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de venta"));
                            double monto = Double.parseDouble(JOptionPane.showInputDialog("Digite el monto"));
                            int producto = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del producto"));
                            Producto pr = null;
                            for (int i = 0; i < prod.length; i++) {
                                if(prod[i] != null) {
                                    if(prod[i].getCodigo() == producto) {
                                        pr = prod[i];
                                    }
                                }
                            }
                            if(pr == null) {
                                JOptionPane.showMessageDialog(null, "Error, no se encontro el producto", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                                break;
                            }
                            String metodo = JOptionPane.showInputDialog("Digite el metodo de pago");
                            String comprador = JOptionPane.showInputDialog("Digite el nombre del comprador");
                            Cliente cl = null;
                            for (int i = 0; i < cli.length; i++) {
                                if(cli[i] != null) {
                                    if(cli[i].getNombre().equals(comprador)) {
                                        cl = cli[i];
                                    }
                                }
                            }
                            if(cl == null) {
                                JOptionPane.showMessageDialog(null, "Error, no se encontro el cliente", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                                break;
                            }
                            String vendedor = JOptionPane.showInputDialog("Digite el nombre del vendedor (empleado)");
                            Empleado emp = null;
                            for (int i = 0; i < em.length; i++) {
                                if(em[i] != null) {
                                    if(em[i].getNombre().equals(vendedor)) {
                                        emp = em[i];
                                    }
                                }
                            }
                            if(emp == null) {
                                JOptionPane.showMessageDialog(null, "Error, no se encontro el vendedor", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                                break;
                            }
                            Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(JOptionPane.showInputDialog("Digite la fecha de la venta en el formato dd/MM/yyyy"));
                            
                            for (int i = 0; i < ven.length; i++) {
                                if(ven[i] == null) {
                                   ven[i] = new Ventas(numero, monto, pr, metodo, cl, emp, fecha);
                                   break;
                                }
                            }
                            break;
                        
                        case 2:
                            for (int i = 0; i < ven.length; i++) {
                                if(ven[i] != null) {
                                   System.out.println(ven[i]);    
                                }
                            }
                            break;
                        
                        case 3:
                            int mod = 1;
                    while (mod != 0) {
             
                    mod = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione una opción: \n"
                            + "1- Modificar numero de venta\n"
                            + "2- Modificar monto facturado\n"
                            + "3- Modificar producto\n"
                            + "4- Modificar metodo de pago\n" 
                            + "5- Modificar comprador\n"
                            + "6- Modificar vendedor\n"
                            + "7- Modificar fecha\n"
                            + "0- Salir", "Menu Principal", JOptionPane.QUESTION_MESSAGE));
                            
                    
                           
                            for (int i = 0; i < ven.length; i++) {
                                if(ven[i] != null) {
                                   if(ven[i].getNumVenta() == mod) {                            
                                    switch (mod) {
                                        case 1:
                                            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuevo numero de venta"));
                                            ven[i].setNumVenta(num);
                                            break;
                                        case 2:
                                            double mon = Double.parseDouble(JOptionPane.showInputDialog("Digite el nuevo monto facturado"));
                                            ven[i].setMontoFacturado(mon);
                                            break;

                                        case 3:
                                           int produ = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuevo codigo del producto"));
                                           Producto prMod = null;
                                           for (int j = 0; j < prod.length; j++) {
                                                if(prod[j] != null) {
                                                    if(prod[j].getCodigo() == produ) {
                                                        prMod = prod[j];
                                                    }
                                                }
                                           }
                                            if(prMod == null) {
                                                JOptionPane.showMessageDialog(null, "Error, no se encontro el producto", "Error",
                                                    JOptionPane.ERROR_MESSAGE);
                                                break;
                                            }
                                            ven[i].setProducto(prMod);
                                    
                                            break;
                                    
                                        case 4:
                                            String met = JOptionPane.showInputDialog("Digite el nuevo metodo de pago");
                                            ven[i].setMetodoPago(met);
                                            break;

                                        case 5:
                                            String comp = JOptionPane.showInputDialog("Digite el nombre del nuevo comprador");
                                            Cliente clMod = null;
                                            for (int j = 0; j < cli.length; j++) {
                                                if(cli[j] != null) {
                                                    if(cli[j].getNombre().equals(comp)) {
                                                        clMod = cli[j];
                                                    }
                                                }
                                            }
                                            if(clMod == null) {
                                                JOptionPane.showMessageDialog(null, "Error, no se encontro el cliente", "Error",
                                                    JOptionPane.ERROR_MESSAGE);
                                                break;
                                            }
                                            ven[i].setInfoComprador(clMod);
                                            break;

                                        case 6:
                                            String vend = JOptionPane.showInputDialog("Digite el nombre del nuevo vendedor (empleado)");
                                            Empleado empMod = null;
                                            for (int j = 0; j < em.length; j++) {
                                                if(em[j] != null) {
                                                    if(em[j].getNombre().equals(vend)) {
                                                        empMod = em[j];
                                                    }
                                                }
                                            }
                                            if(empMod == null) {
                                                JOptionPane.showMessageDialog(null, "Error, no se encontro el vendedor", "Error",
                                                    JOptionPane.ERROR_MESSAGE);
                                                break;
                                            }
                                            ven[i].setInfoVendedor(empMod);
                                            break;

                                        case 7:
                                            Date fech = new SimpleDateFormat("dd/MM/yyyy").parse(JOptionPane.showInputDialog("Digite la nueva fecha de la venta en el formato dd/MM/yyyy"));
                                            ven[i].setFecha(fech);
                                            break;

                                        default:
                                            JOptionPane.showMessageDialog(null, "Error, opción invalida intente de nuevo", "Error",
                                            JOptionPane.ERROR_MESSAGE);
                                    
                                   }
                                   }
                            }
                                   break;
                               } 
                    }
                    
                            break;
                            
                        case 4:
                            int elim = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de venta a borrar"));
                            for (int i = 0; i < ven.length; i++) {
                                if(ven[i] != null) {
                                   if(ven[i].getNumVenta() == elim) {
                                       ven[i] = null;
                                       break;
                                   }
                                }
                            }

                            break;
                            
                        case 5:
                            int comp = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de venta"));
                            for (int i = 0; i < ven.length; i++) {
                                if(ven[i] != null) {
                                   if(ven[i].getNumVenta() == comp) {
                                       System.out.println(comp + " Comprador: " + ven[i].getInfoComprador().getNombre());         
                                       break;
                                   }
                                }
                            }
                            break;
                            
                        case 6:
                            int vend = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de venta"));
                            for (int i = 0; i < ven.length; i++) {
                                if(ven[i] != null) {
                                   if(ven[i].getNumVenta() == vend) {
                                       System.out.println(vend + " Vendedor: " + ven[i].getInfoVendedor().getNombre());         
                                       break;
                                   }
                                }
                            }
                            break;
                            
                        case 7:
                            int fech = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de venta"));
                            for (int i = 0; i < ven.length; i++) {
                                if(ven[i] != null) {
                                   if(ven[i].getNumVenta() == fech) {
                                       System.out.println(fech + " Fecha: " + ven[i].getFecha());         
                                       break;
                                   }
                                }
                            }
                    
                            break;
                    }
                    }
            
                    break;

               case 0:
                            System.exit(0);
                        default:
                            JOptionPane.showMessageDialog(null, "Error, opción invalida intente de nuevo", "Error",
                                    JOptionPane.ERROR_MESSAGE);
            }
                    
             }
        }
        else {
            System.out.println("Contraseña incorrecta");
        }
   
    }
    
}
