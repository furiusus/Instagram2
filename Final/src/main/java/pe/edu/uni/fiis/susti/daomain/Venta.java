package pe.edu.uni.fiis.susti.daomain;

/**
 * Created by furiusus on 7/8/17.
 */
public class Venta {
    private String nombre;
    private String producto;
    private static Double igv = 0.18;
    private Double total;
    private Integer cantidad;

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public static Double getIgv() {
        return igv;
    }

    public static void setIgv(Double igv) {
        Venta.igv = igv;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
