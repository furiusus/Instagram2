package pe.edu.uni.fiis.susti.dao.impl;

import org.springframework.stereotype.Repository;
import pe.edu.uni.fiis.susti.dao.VentaDao;
import pe.edu.uni.fiis.susti.dao.SimpleJdbc;
import pe.edu.uni.fiis.susti.daomain.Venta;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by furiusus on 7/8/17.
 */
@Repository
public class VentaDaoImplement extends SimpleJdbc implements VentaDao {
    @Override
    public Venta guardarCompra(Venta venta) {
        String sql="INSERT INTO VENTA(CLIENTE, PRODUCTO, CANTIDAD, TOTAL)\n" +
                "    VALUES (?,?,?,?,?);";
        getJdbcTemplate().update(sql,
                new Object[]{
                    venta.getNombre(),venta.getProducto(),venta.getCantidad(),venta.getTotal()
                });
        return venta;
    }

    @Override
    public List<Venta> mostrarCompra(Venta venta) {
        String sql="SELECT CLIENTE,PRODUCTO,CANTIDAD,IGV,TOTAL FROM VENTA";
        List<Venta> ventas = new ArrayList<Venta>();
        List<Map<String,Object>> lista= getJdbcTemplate().queryForList(sql);
        if(lista != null && lista.size()>0){
            for (int i = 0; i < lista.size(); i++) {
                Venta ventaObj = new Venta();
                ventaObj.setNombre((String)lista.get(i).get("NOMBRE"));
                ventaObj.setProducto((String)lista.get(i).get("PRODUCTO"));
                ventaObj.setCantidad((Integer)lista.get(i).get("CANTIDAD"));
                ventaObj.setTotal((Double)lista.get(i).get("CANTIDAD"));
                ventas.add(ventaObj);
            }
        }
        return null;
    }
}
