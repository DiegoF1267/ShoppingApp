package cl.inacap.shoppingapp.dao;

import java.util.List;

import cl.inacap.shoppingapp.dto.Productos;

public interface ProductosDAO {
    List<Productos> getAll();
    Productos save(Productos p);
}
