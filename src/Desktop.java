public class Desktop extends Equipo{
    private String memoria;
    private String tarjetaGrafica;
    private String tamanoTorre;
    private String capacidadDisco;

    public Desktop(String fabricante, String modelo, String microprocesador, String memoria, String tarjetaGrafica, String tamanoTorre, String capacidadDisco){
        super(fabricante, modelo, microprocesador);
        this.memoria = memoria;
        this.tarjetaGrafica = tarjetaGrafica;
        this.tamanoTorre = tamanoTorre;
        this.capacidadDisco = capacidadDisco;
    }

    public String obtenerDetalles(){
        return "Fabricante: " + fabricante + "\nModelo: " + modelo + "\nMicroprocesador: " + microprocesador +
                "\nMemoria: " + memoria + "\nTarjeta gráfica: " + tarjetaGrafica + "\nTamaño de torre: " + tamanoTorre +
                "\nCapacidad de disco duro: " + capacidadDisco ;
    }
}
