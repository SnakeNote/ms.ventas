package com.pcfactory.ventas.service;

import com.pcfactory.ventas.dto.VentaProductoRequest;
import com.pcfactory.ventas.model.ventaProducto;
import com.pcfactory.ventas.repository.VentaProductoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service


public class VentaProductoService {
    @Autowired
    private VentaProductoRepository ventaProductoRepository;

    /*@Transactional
    public List<ventaProducto> registrarVenta(
            List<ventaProducto> productos = new ArrayList<>();

        for (VentaProductoRequest item : request) {
        ventaProducto producto = new ventaProducto();

        producto.setNombreCliente(item.getNombreCliente());
        producto.setIdCliente(item.getIdCliente());
        producto.setIdProducto(item.getIdProducto());
        producto.setNombreProducto(item.getNombreProducto());
        producto.setPrecio(item.getPrecio());
        producto.setCantidad(item.getCantidad());

        productos.add(producto);
    }

        return ventaProductoRepository.saveAll(productos);


    ) {
        return ventaProductoRepository.saveAll(productos);
    }

    @Transactional
    public List<ventaProducto> obtenerProductosVendidos() {
        return ventaProductoRepository.findAll();
    }*/

}
