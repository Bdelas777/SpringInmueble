package com.bdelas.springbootmicroservice1inmueble2.model;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/*
***Relacion del modelo de inmuebles
* */
@Data
@Entity
@Table(name="inmueble")
public class Inmueble {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name="nombre", length = 150, nullable = false)
    private String nombre;

    @Column(name="direccion", length = 500, nullable = false)
    private String direccion;

    @Column(name="foto", length = 1200, nullable = true)
    private String picture;

    @Column(name="precio",  nullable = false)
    private String precio;

    @Column(name="fecha_creacion",  nullable = false)
    private LocalDateTime fechaCreacion;

}
