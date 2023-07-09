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
    private String names;

    @Column(name="direccion", length = 500, nullable = false)
    private String direction;

    @Column(name="foto", length = 1200, nullable = true)
    private String picture;

    @Column(name="precio",  nullable = false)
    private String price;

    @Column(name="fecha_creacion",  nullable = false)
    private LocalDateTime creationDate;

}
