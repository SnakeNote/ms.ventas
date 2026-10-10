package com.pcfactory.ventas.repository;

import com.pcfactory.ventas.model.ventaProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface VentaProductoRepository extends JpaRepository<ventaProducto, Long> {

}

