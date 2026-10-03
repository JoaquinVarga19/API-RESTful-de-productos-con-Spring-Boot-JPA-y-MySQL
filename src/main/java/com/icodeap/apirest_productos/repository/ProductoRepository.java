package com.icodeap.apirest_productos.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.icodeap.apirest_productos.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    
    
}
