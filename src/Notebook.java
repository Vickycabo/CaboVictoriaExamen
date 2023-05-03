public class Notebook extends Informatico{
    private Integer memoria;

    public Notebook(Integer memoria) {
        this.memoria = memoria;
    }

    public Notebook(String fabricante, String nombre, Integer stock, Double precio, Integer memoria) {
        super(fabricante, nombre, stock, precio);
        this.memoria = memoria;
    }

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    ///2) Para cada clase generar un método ToString donde contenga toda la información de la misma
    @Override
    public String toString() {
        return super.toString()+ "Notebook{" +
                "memorial=" + memoria +
                '}';
    }
}
