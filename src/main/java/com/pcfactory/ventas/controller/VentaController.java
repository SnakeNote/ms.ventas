package com.pcfactory.ventas.controller;

import com.pcfactory.ventas.dto.VentaProductoRequest;
import com.pcfactory.ventas.model.ventaProducto;
import com.pcfactory.ventas.service.VentaProductoService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {

    @Autowired
    private VentaProductoService ventaProductoService;

    @PostMapping
    public ResponseEntity<List<ventaProducto>> registrarVenta(
            @RequestBody
            @NotEmpty(message = "La venta debe contener al menos un producto")
            List<@NotNull @Valid ventaProducto> request
    ) {
        List<ventaProducto> productosGuardados =
                ventaProductoService.registrarVenta(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(productosGuardados);
    }
}
