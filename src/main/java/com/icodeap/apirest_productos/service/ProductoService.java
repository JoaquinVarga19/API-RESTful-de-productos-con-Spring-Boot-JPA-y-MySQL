package com.icodeap.apirest_productos.service;

import org.springframework.stereotype.Service;

import com.icodeap.apirest_productos.entity.Producto;
import com.icodeap.apirest_productos.repository.ProductoRepository;
import java.util.List;

@Service 
public class ProductoService implements IProducto {

    private ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }   

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override 
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override 
    public Producto findById(Integer id) {
        return productoRepository.findById(id).get();
    }

    @Override
    public void deleteById(Integer id) {
        productoRepository.deleteById(id);
    }
    
    @Override 
    public Producto update(Producto producto) {
        Producto productoBDD = productoRepository.findById(producto.getId()).get();

        productoBDD.setNombre(producto.getNombre());
        productoBDD.setDetalle(producto.getDetalle());
        productoBDD.setPrecio(producto.getPrecio());
        
        return productoRepository.save(productoBDD);
    }
    
}
