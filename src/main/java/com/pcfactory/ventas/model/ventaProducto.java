package com.pcfactory.ventas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ventas_productos")
@NoArgsConstructor
@AllArgsConstructor
@Data


public class ventaProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idventaProducto;

    @Column (nullable = false, length = 255, unique = false)
    private String nombreCliente;

    @Column
    private Long idCliente;

    @Column
    private Long idProducto;

    @Column
    private Long nombreProducto;

    @Column
    private Long precio;

    @Column
    private Long cantidad;


}
