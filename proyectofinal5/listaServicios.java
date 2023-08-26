package proyectofinal5;

public class listaServicios {
    
      public Servicio[] registro;

    public listaServicios() {
        this.registro = new Servicio[3];
        this.registro[0] = new Servicio("Afinacion", "La afinacion menor es sencilla, pues solo consta del cambio de aceite y filtros"
                + "\n, ademas de la revisian de puntos de seguridad, como luces, estado de la bateria, frenos, anticongelante, etc. "
                + "\nLa afinacion mayor puede llegar a ser más meticulosa, ya que debe incluir servicios como la limpieza del cuerpo "
                + "\nde aceleracion, limpieza de inyectores, cambio de filtro de combustible (cuando aplica), cambio de bujías, y todos "
                + "\nlos cambios de la afinacion menor.", 150000);
        this.registro[1] = new Servicio("Alineacion y balanceo", "La alineacion permite que la “pisada” de la llanta sea "
                + "\nsiempre la misma en condiciones de manejo normal.", 100000);
        this.registro[2] = new Servicio("Servicio de frenos", "Revision de nivel de liquido de frenos, cambio de balatas "
                + "\ny/o zapatas y rotor y/o tambor (en caso de ser necesario), revision de lineas de freno, purgado, revision del "
                + "\nbooster, asi como revision del correcto vacio de los frenos.", 179000);
    }

    public void leerRegistro() {
        for (int i = 0; i < this.registro.length; i++) {
            this.registro[i].mostrarServicio();

        }
    }
    
}
