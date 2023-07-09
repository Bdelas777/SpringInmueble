package com.bdelas.springbootmicroservice1inmueble2.repository;

import com.bdelas.springbootmicroservice1inmueble2.model.Inmueble;
import org.springframework.data.jpa.repository.JpaRepository;

// JPA pide 2 parametros identidad y id
public interface InmuebleRepository extends JpaRepository <Inmueble, Long>{

}
