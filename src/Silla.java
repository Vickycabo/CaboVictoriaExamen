public class Silla extends Mueble implements Oferta{
    private Boolean ruedas;

    public Silla (){}

    public Silla (Boolean ruedas,Integer stock,Double precio, String nombre){
        super(nombre,stock,precio);
        this.ruedas=ruedas;

    }

    public Boolean getRuedas() {
        return ruedas;
    }

    public void setRuedas(Boolean ruedas) {
        this.ruedas = ruedas;
    }

    ///2) Para cada clase generar un método ToString donde contenga toda la información de la misma
    @Override
    public String toString() {
        return super.toString()+ "Silla{" +
                "cantidad de ruedas=" + ruedas +
                '}';
    }


    @Override
    public Double descuentoEspecial(Integer descuento) {
        return super.getPrecio()-((super.getPrecio()*descuento)/100);
    }
}
