package pe.edu.uni.fiis.susti.service;

import pe.edu.uni.fiis.susti.daomain.Venta;

import java.util.List;

/**
 * Created by furiusus on 7/8/17.
 */
public interface VentaService {
    public Venta guardarVenta(Venta venta);
    public List<Venta> mostrarVenta(Venta venta);
}
