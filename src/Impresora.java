public class Impresora extends Informatico implements Oferta{
    private Integer impresionesPorMinuto;

    public Impresora(Integer impresionesPorMinuto) {
        this.impresionesPorMinuto = impresionesPorMinuto;
    }

    public Impresora(String fabricante, String nombre, Integer stock, Double precio, Integer impresionesPorMinuto) {
        super(fabricante, nombre, stock, precio);
        this.impresionesPorMinuto = impresionesPorMinuto;
    }

    public Integer getImpresionesPorMinuto() {
        return impresionesPorMinuto;
    }

    public void setImpresionesPorMinuto(Integer impresionesPorMinuto) {
        this.impresionesPorMinuto = impresionesPorMinuto;
    }

    ///2) Para cada clase generar un método ToString donde contenga toda la información de la misma
    @Override
    public String toString() {

        return super.toString()+ "Impresora{" +
                "impresionesPorMinuto=" + impresionesPorMinuto +
                '}';
    }


    @Override
    public Double descuentoEspecial(Integer descuento) {

        return super.getPrecio()-((super.getPrecio()*descuento)/100);

    }
}
