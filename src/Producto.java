public abstract class Producto {
    private Integer stock;
    private String nombre;
    private Double precio;

    public Producto (){}
    public Producto (Integer stock, String nombre, Double precio){
        this.stock=stock;
        this.nombre=nombre;
        this.precio=precio;
    }

    public void setStock(Integer stock) {
        this.stock = stock;

    }

    public Integer getStock() {

        return stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    ///2) Para cada clase generar un método ToString donde contenga toda la información de la misma
    @Override
    public String toString() {
        return ".Producto{" +
                "stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
