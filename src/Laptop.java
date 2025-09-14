public class Laptop extends Equipo{
    private String memoria;
    private String tamanoPantalla;
    private String capacidadDisco;

    public Laptop(String fabricante, String modelo, String microprocesador, String memoria, String tamanoPantalla, String capacidadDisco) {
        super(fabricante, modelo, microprocesador);
        this.memoria = memoria;
        this.tamanoPantalla = tamanoPantalla;
        this.capacidadDisco = capacidadDisco;
    }

    public String obtenerDetalles() {
        return "Fabricante: " + fabricante + "\nModelo: " + modelo + "\nMicroprocesador: " + microprocesador +
                "\nMemoria: " + memoria + "\nTamaño pantalla: " + tamanoPantalla + "\nCapacidad de disco duro: " + capacidadDisco;
    }
}
