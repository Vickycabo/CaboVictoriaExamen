import java.util.ArrayList;
import java.util.List;

public class Comercio {

    private List<Producto> misProductos;

    public Comercio() {
        this.misProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        misProductos.add(producto);

    }

    public void tipoDeInstancia (){
        for (Producto producto:misProductos){
            if(producto instanceof Silla){
                System.out.println("Este producto es una silla "+producto);
            }
            if(producto instanceof Escritorio){
                System.out.println("Este producto es un escritorio "+ producto);
            }
            if (producto instanceof  Impresora){
                System.out.println("Este producto es una impresora "+ producto);
            }
            if (producto instanceof  Notebook){
                System.out.println("Este producto es una notebook "+ producto);
            }

        }

    }

    /// Se solicita actualizar el valor de los precios del array del ejercicio 3. Esto se debe realizar a través
    //de un método de la clase. Cree un bucle en donde se actualizan con los siguientes valores e imprima
    //ambos valores(sin aumento y con aumento):
    //● Sillas = 5%
    //● Escritorios = 10%
    //● Impresoras = 15%
    //● Notebooks = 20%

    public void actualizaPrecio (){
        for (Producto producto:misProductos){
            if(producto instanceof Silla){
                System.out.println("El valor de la silla sin aumento es de:  "+producto.getPrecio());
                producto.setPrecio(producto.getPrecio()*0.05+producto.getPrecio());
                System.out.println("El valor de la silla con aumento es de:  "+producto.getPrecio());
            }
            if(producto instanceof Escritorio){
                System.out.println("El valor del escritorio sin aumento es de:  "+producto.getPrecio());
                producto.setPrecio(producto.getPrecio()*0.10+producto.getPrecio());
                System.out.println("El valor del escritorio con aumento es de:  "+producto.getPrecio());
            }
            if (producto instanceof  Impresora){
                System.out.println("El valor de la impresora sin aumento es de:  "+producto.getPrecio());
                producto.setPrecio(producto.getPrecio()*0.15+producto.getPrecio());
                System.out.println("El valor de la impresora con aumento es de:  "+producto.getPrecio());
            }
            if (producto instanceof  Notebook){
                System.out.println("El valor de la notebook sin aumento es de:  "+producto.getPrecio());
                producto.setPrecio(producto.getPrecio()*0.20+producto.getPrecio());
                System.out.println("El valor de la notebook con aumento es de:  "+producto.getPrecio());
            }

        }

    }

    @Override
    public String toString() {
        return "Comercio{" +
                "Estos son mis productos=" + misProductos +
                '}';
    }
}
