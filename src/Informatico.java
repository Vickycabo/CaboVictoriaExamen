public abstract class Informatico extends Producto{
    private String fabricante;

    public Informatico (){}
    public Informatico (String fabricante,String nombre,Integer stock,Double precio){
        super(stock,nombre,precio);
        this.fabricante=fabricante;

    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    ///2) Para cada clase generar un método ToString donde contenga toda la información de la misma
    @Override
    public String toString() {
        return super.toString()+ "Informatico{" +
                " el fabricante es: '" + fabricante + '\'' +
                '}';
    }


}
