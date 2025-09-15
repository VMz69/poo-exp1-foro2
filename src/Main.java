import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;

public class Main {
    private static ArrayList<Equipo> equipos = new ArrayList<>();
    public static Object[] opciones = {"Desktop", "Laptop", "Tablet"}; //opciones para pintar dentro de botones de JOptionDialog

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            // Cargar imagen de logo desde recursos
            ImageIcon icono = new ImageIcon(Main.class.getResource("/resources/logo.png"));

            // Crear Componente JLabel con HTML, imagen y texto centrado
            JLabel bienvenida = new JLabel(
                    "<html>" +
                            "<div style='text-align:center;'>" +
                            "<h1 style='color: darkblue;'>TODO-PC</h1>" +
                            "<img src='" + icono.toString() + "' width='80' height='80'><br>" +
                            "<h3 style='color: gray;'>Gestión de equipos en Tienda</h3>" +
                            "<hr style='border:1px solid darkblue; width:80%;'>" +
                            "<p style='font-size:14px; color: black;'>¡Bienvenido a la aplicación de gestión de equipos!</p>" +
                            "<p style='font-size:14px; color: black;'>Seleccione una opción del menú:</p>" +
                            "<br>" +
                            "<p style='font-size:14px; color: black;'>1. Registrar equipo</p>" +
                            "<p style='font-size:14px; color: black;'>2. Ver equipos</p>" +
                            "<p style='font-size:14px; color: black;'>3. Salir</p>" +
                            "<br>" +
                            "<p style='font-size:12px; color: gray;'>© 2025 TODO-PC. Todos los derechos reservados.</p>" +
                            "</div>" +
                            "</html>",
                    JLabel.CENTER
            );
            bienvenida.setFont(new Font("Arial", Font.BOLD, 16));
            bienvenida.setForeground(Color.DARK_GRAY);


            String opcion = JOptionPane.showInputDialog(null, bienvenida, "Menu", JOptionPane.PLAIN_MESSAGE);
            if (opcion != null && !opcion.trim().isEmpty()) {
                try {
                    int opcionMenu = Integer.parseInt(opcion.trim()); // parse seguro
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
                            JOptionPane.showMessageDialog(null, "Opción inválida!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un número válido!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese el número de una opción válida!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static void registrarEquipo() {
        //Componente JLabel para pintar dentro del optionDialog
        JLabel label = new JLabel("<html><br>Seleccionar el tipo de equipo que desea registrar:<br><hr><br></html>");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setForeground(Color.DARK_GRAY);

        //optionDialog
        int tipo = JOptionPane.showOptionDialog(
                null,      // Componente padre
                label,                   // Mensaje
                "Seleccionar",          // Título
                JOptionPane.DEFAULT_OPTION, // Tipo de opción (OK_CANCEL, YES_NO, etc.)
                JOptionPane.QUESTION_MESSAGE, // Tipo de mensaje (ícono)
                null,                   // Icono personalizado (null = por defecto)
                opciones,               // Botones
                "Desktop"               // Opción seleccionada por defecto
        );

        // Si el usuario cancela
        if (tipo == -1) {
            return;
        }

        String fabricante = JOptionPane.showInputDialog("Fabricante:");
        String modelo = JOptionPane.showInputDialog("Modelo:");
        String microprocesador = JOptionPane.showInputDialog("Microprocesador:");

        if (fabricante == null || modelo == null || microprocesador == null || fabricante.trim().isEmpty() || modelo.trim().isEmpty() || microprocesador.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No pueden quedar campos vacios!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        switch (tipo) {
            case 0:
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
            case 1:
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
            case 2:
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

    private static void mostrarEquipos() {
        JLabel label = new JLabel("<html><br>Seleccionar el tipo de equipo que desea consultar:<br><hr><br></html>");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setForeground(Color.DARK_GRAY);

        int tipo = JOptionPane.showOptionDialog(
                null,
                label,
                "Seleccionar",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                "Desktop"
        );

        // Si el usuario cancela
        if (tipo == -1) {
            return;
        }

        StringBuilder detalles = new StringBuilder();

        for (Equipo equipo : equipos) {
            if ((tipo == 0 && equipo instanceof Desktop) || (tipo == 1 && equipo instanceof Laptop) || (tipo == 2 && equipo instanceof Tablet)) {

                detalles.append(equipo.obtenerDetalles()).append("\n\n");
            }
        }

        if (detalles.length() == 0) {
            JOptionPane.showMessageDialog(null, "No hay equipos de este tipo registrados!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, detalles.toString(), "Equipos", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
