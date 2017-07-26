package pe.edu.uni.fiis.susti.dao;

import pe.edu.uni.fiis.susti.daomain.Venta;

import java.util.List;

/**
 * Created by furiusus on 7/8/17.
 */
public interface VentaDao {
    public Venta guardarCompra(Venta venta);
    public List<Venta> mostrarCompra(Venta venta);
}
