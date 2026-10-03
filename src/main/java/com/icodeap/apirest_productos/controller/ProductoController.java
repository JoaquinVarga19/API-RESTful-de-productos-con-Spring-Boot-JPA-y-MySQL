package com.icodeap.apirest_productos.controller;

import org.springframework.web.bind.annotation.RestController;
import com.icodeap.apirest_productos.entity.Producto;
import com.icodeap.apirest_productos.service.IProducto;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class ProductoController {

    private IProducto iProducto;

    public ProductoController(IProducto iProducto) {
        this.iProducto = iProducto;
    }

    /*
    Endpoint para guardar un producto
    */
    @PostMapping
    public Producto save(@RequestBody Producto producto) {
        return iProducto.save(producto);
    }

    /*
    Endpoint para obtener todos los productos
    */
    @GetMapping 
    public List<Producto> findAll() {
        return iProducto.findAll();
    }

    /*
    Endpoint para obtener un producto por su ID
    */
    @GetMapping("/{id}")
    public Producto findById(@PathVariable Integer id) {
        return iProducto.findById(id);
    }

    /*
    Endpoint para eliminar un producto por su ID
    */
    @DeleteMapping("/{idProducto}") 
    public void deleteById(@PathVariable("idProducto") Integer id) {
        iProducto.deleteById(id);
    }

    /*
    Endpoint para actualizar un producto
    */
    @PutMapping
    public Producto update(@RequestBody Producto producto) {
        return iProducto.update(producto);
    }
}
