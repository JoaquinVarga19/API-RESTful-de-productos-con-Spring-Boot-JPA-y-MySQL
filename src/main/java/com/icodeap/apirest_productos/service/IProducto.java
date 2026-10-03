package com.icodeap.apirest_productos.service;
import com.icodeap.apirest_productos.entity.Producto;
import java.util.List;

public interface IProducto {

    Producto save(Producto producto);
    List<Producto> findAll();
 

}