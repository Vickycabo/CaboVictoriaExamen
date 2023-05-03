public abstract class Mueble extends Producto{

    public Mueble (){}

    public Mueble (String nombre,Integer stock,Double precio){
        super(stock,nombre,precio);

    }

    ///2) Para cada clase generar un método ToString donde contenga toda la información de la misma
    @Override
    public String toString() {
        return super.toString();
    }


}
