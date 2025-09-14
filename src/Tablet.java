public class Tablet extends Equipo{
    private String tamanoDiagonal;
    private String tipoPantalla;
    private String memoriaNAND;
    private String sistemaOperativo;


    public Tablet(String fabricante, String modelo, String microprocesador, String tamanoDiagonal, String tipoPantalla, String memoriaNAND, String sistemaOperativo) {
        super(fabricante, modelo, microprocesador);
        this.tamanoDiagonal = tamanoDiagonal;
        this.tipoPantalla = tipoPantalla;
        this.memoriaNAND = memoriaNAND;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String obtenerDetalles(){
        return "Fabricante: " + fabricante + "\nModelo: " + modelo + "\nMicroprocesador: " + microprocesador +
                "\nTamaño diagonal de pantalla: " + tamanoDiagonal + "\n¿Capacitiva/Resistiva?: " + tipoPantalla +
                "\nTamaño memoria NAND: " + memoriaNAND + "\nSistema Operativo: " + sistemaOperativo;
    }
}
