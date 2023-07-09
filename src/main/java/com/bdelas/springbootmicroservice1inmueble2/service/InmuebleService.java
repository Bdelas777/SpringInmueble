package com.bdelas.springbootmicroservice1inmueble2.service;

import com.bdelas.springbootmicroservice1inmueble2.model.Inmueble;

import java.util.List;

public interface InmuebleService {
    // Guardar un inmueble
    Inmueble saveInmueble(Inmueble inmueble);

    // Eliminar un inmueble
    void deleteInmueble(Long idInmueble);

    // Retorna toda la informacion
    List<Inmueble> findAllInmuebles();
}
