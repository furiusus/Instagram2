package pe.edu.uni.fiis.susti.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.uni.fiis.susti.dao.VentaDao;
import pe.edu.uni.fiis.susti.daomain.Venta;
import pe.edu.uni.fiis.susti.service.VentaService;

import java.util.List;

/**
 * Created by furiusus on 7/8/17.
 */
public class VentaServiceImplement implements VentaService {
    @Autowired
    private VentaDao ventaDao;
    @Override
    public Venta guardarVenta(Venta venta) {
        return ventaDao.guardarCompra(venta);
    }

    @Override
    public List<Venta> mostrarVenta(Venta venta) {
        return ventaDao.mostrarCompra(venta);
    }
}
