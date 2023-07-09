package com.bdelas.springbootmicroservice1inmueble2.service;
import com.bdelas.springbootmicroservice1inmueble2.model.Inmueble;
import com.bdelas.springbootmicroservice1inmueble2.repository.InmuebleRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

//Sirve para reglas de negocio de la empresa
@Service
public class InmuebleServiceImpl implements InmuebleService{
    private final InmuebleRepository inmuebleRepository;

    public InmuebleServiceImpl(InmuebleRepository inmuebleRepository) {
        this.inmuebleRepository = inmuebleRepository;
    }

    // Guardar un nuevo inmueble
    @Override
    public Inmueble saveInmueble(Inmueble inmueble){
        inmueble.setFechaCreacion(LocalDateTime.now());
        return inmuebleRepository.save(inmueble);
    }

    // Eliminar un inmueble
    @Override
    public void deleteInmueble(Long idInmueble){
        inmuebleRepository.deleteById(idInmueble);
    }

    // Retorna toda la informacion
    @Override
    public List<Inmueble> findAllInmuebles(){
        return inmuebleRepository.findAll();
    }
}
