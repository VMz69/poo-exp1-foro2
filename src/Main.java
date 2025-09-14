import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Equipo> equipos = new ArrayList<>();

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            String opcion = JOptionPane.showInputDialog(null, "1. Registrar equipo\n2. Ver equipos\n3. Salir", "Menu", JOptionPane.QUESTION_MESSAGE);
            if (opcion != null && !opcion.trim().isEmpty()) {
                int opcionMenu = Integer.parseInt(opcion);
                switch (opcionMenu) {
                    case 1:
                        registrarEquipo();
                        break;
                    case 2:
                        mostrarEquipos();
                        break;
                    case 3:
                        continuar = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion invalida!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Ingrese el numero de una opcion valida!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static void registrarEquipo() {
        String tipo = JOptionPane.showInputDialog(null, "Tipo de Equipo:\n1. Desktop\n2. Laptop\n3. Tablet", "Seleccionar tipo de equipo", JOptionPane.QUESTION_MESSAGE);
        if (tipo != null && !tipo.trim().isEmpty()) {
            int tipoEquipo = Integer.parseInt(tipo);
            String fabricante = JOptionPane.showInputDialog("Fabricante:");
            String modelo = JOptionPane.showInputDialog("Modelo:");
            String microprocesador = JOptionPane.showInputDialog("Microprocesador:");

            if (fabricante == null || modelo == null || microprocesador == null || fabricante.trim().isEmpty() || modelo.trim().isEmpty() || microprocesador.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No pueden quedar campos vacios!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            switch (tipoEquipo) {
                case 1:
                    String memoria = JOptionPane.showInputDialog("Memoria:");
                    String tarjetaGrafica = JOptionPane.showInputDialog("Tarjeta Grafica:");
                    String tamanoTorre = JOptionPane.showInputDialog("Tamano de Torre:");
                    String capacidadDisco = JOptionPane.showInputDialog("Capacidad de Disco Duro:");
                    if (memoria == null || capacidadDisco == null || tamanoTorre == null || tarjetaGrafica == null || memoria.trim().isEmpty() || tamanoTorre.trim().isEmpty() || tarjetaGrafica.trim().isEmpty() || capacidadDisco.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No pueden quedar campos vacios!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    Desktop desktop = new Desktop(fabricante, modelo, microprocesador, memoria, tarjetaGrafica, tamanoTorre, capacidadDisco);
                    equipos.add(desktop);
                    JOptionPane.showMessageDialog(null, "Equipo registrado!", "Info", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    memoria = JOptionPane.showInputDialog("Memoria:");
                    String tamanoPantalla = JOptionPane.showInputDialog("Tamano de Pantalla:");
                    capacidadDisco = JOptionPane.showInputDialog("Capacidad de Disco Duro:");
                    if (memoria == null || capacidadDisco == null || tamanoPantalla == null || memoria.trim().isEmpty() || capacidadDisco.trim().isEmpty() || tamanoPantalla.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No pueden quedar campos vacios!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    Laptop laptop = new Laptop(fabricante, modelo, microprocesador, memoria, tamanoPantalla, capacidadDisco);
                    equipos.add(laptop);
                    JOptionPane.showMessageDialog(null, "Equipo registrado!", "Info", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    String tamanoDiagonal = JOptionPane.showInputDialog("Tamano Diagonal de Pantalla:");
                    String tipoPantalla = JOptionPane.showInputDialog("Tipo de Pantalla (Capacitiva/Resistiva):");
                    String memoriaNAND = JOptionPane.showInputDialog("Tamano de Memoria NAND:");
                    String sistemaOperativo = JOptionPane.showInputDialog("Sistema Operativo:");
                    if (tamanoDiagonal == null || tipoPantalla == null || memoriaNAND == null || sistemaOperativo == null || tamanoDiagonal.trim().isEmpty() || tipoPantalla.trim().isEmpty() || memoriaNAND.trim().isEmpty() || sistemaOperativo.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No pueden quedar campos vacios!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    Tablet tablet = new Tablet(fabricante, modelo, microprocesador, tamanoDiagonal, tipoPantalla, memoriaNAND, sistemaOperativo);
                    equipos.add(tablet);
                    JOptionPane.showMessageDialog(null, "Equipo registrado!", "Info", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Ingrese el numero de una opcion valida!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void mostrarEquipos(){
        String tipo = JOptionPane.showInputDialog(null, "Tipo de equipo:\n1. Desktops\n2. Laptops\n3. Tablets", "Seleccionar tipo de equipo", JOptionPane.QUESTION_MESSAGE);
        if(tipo != null && !tipo.trim().isEmpty()){
            int tipoEquipo = Integer.parseInt(tipo);
            String detalles = "";

            for(Equipo equipo : equipos){
                if(tipoEquipo == 1 && equipo instanceof Desktop){
                    detalles += equipo.obtenerDetalles() + "\n\n";
                } else if (tipoEquipo == 2 && equipo instanceof Laptop){
                    detalles += equipo.obtenerDetalles() + "\n\n";
                } else if(tipoEquipo == 3 && equipo instanceof Tablet){
                    detalles += equipo.obtenerDetalles() + "\n\n";
                }
            }
            if(detalles.isEmpty()){
                JOptionPane.showMessageDialog(null, "No hay equipos de este tipo registrados!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, detalles, "Equipos", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Ingrese el numero de una opcion valida!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}