package pe.edu.uni.fiis.susti.dao.impl;

import pe.edu.uni.fiis.susti.dao.CompraDao;
import pe.edu.uni.fiis.susti.dao.SimpleJdbc;
import pe.edu.uni.fiis.susti.daomain.Compra;

/**
 * Created by furiusus on 7/8/17.
 */
public class CompraDaoImplement extends SimpleJdbc implements CompraDao {
    @Override
    public Compra guardarCompra(Compra compra) {
        String sql="INSERT INTO COMPRA(NOMBRE,RUC,PRODUCTO,CANTIDAD,TOTAL)\n" +
                "    VALUES(?,?,?,?,?);";
        getJdbcTemplate().update(sql,
                new Object[]{
                    compra.getNombre(),compra.getRuc(),compra.getProducto(),compra.getCantidad(),compra.getTotal()
                });
        return compra;
    }
}
