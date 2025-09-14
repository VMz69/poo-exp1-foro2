public abstract class Equipo {
    protected String fabricante;
    protected String modelo;
    protected String microprocesador;

    public Equipo(String fabricante, String modelo, String microprocesador) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
    }

    public abstract String obtenerDetalles();
}
