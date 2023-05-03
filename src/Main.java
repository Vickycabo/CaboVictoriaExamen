import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ///3) Crear una instancia de cada clase y agregarla a un List. Luego recorrerlo mostrando por pantalla el
        ///tipo de instancia que es.
        Silla silla1=new Silla(false,10,10000d,"De Madera");
        Escritorio escritorio1=new Escritorio(50,100,"alpino",5,10000d);
        Impresora impresora1=new Impresora("Epson","P58",8,7000d,100);
        Notebook notebook1=new Notebook("Lenovo","V15",4,150000d,250);
        Comercio miComercio=new Comercio();
        miComercio.agregarProducto(silla1);
        miComercio.agregarProducto(escritorio1);
        miComercio.agregarProducto(impresora1);
        miComercio.agregarProducto(notebook1);
        miComercio.tipoDeInstancia();
        /// 4) La empresa nos encarga otra tarea. Nos dice que tanto las Impresoras como las Sillas se encuentran
        //  de oferta. Y que para cada cliente se puede aplicar un descuento especial. Se debe indicar por parámetro
        //  el porcentaje de descuento y retornar el precio del producto con el descuento aplicado. Se tendrá en
        // cuenta la forma en que solucionan este punto.
        System.out.println("El valor de la silla con decuento es: "+silla1.descuentoEspecial(10));
        System.out.println("El valor de la impresora con decuento es: "+impresora1.descuentoEspecial(10));
        ///5) Se solicita actualizar el valor de los precios del array del ejercicio 3. Esto se debe realizar a través
        //de un método de la clase. Cree un bucle en donde se actualizan con los siguientes valores e imprima
        //ambos valores(sin aumento y con aumento):
        miComercio.actualizaPrecio();

    }



}
