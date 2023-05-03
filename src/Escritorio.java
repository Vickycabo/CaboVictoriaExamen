public class Escritorio extends Mueble{
    private Integer alto;
    private Integer ancho;

    public Escritorio(){}
    public Escritorio(Integer alto,Integer ancho,String nombre,Integer stock,Double precio){
        super(nombre, stock,precio);
        this.alto=alto;
        this.ancho=ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return super.toString()+ "Escritorio{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                '}';
    }


}
