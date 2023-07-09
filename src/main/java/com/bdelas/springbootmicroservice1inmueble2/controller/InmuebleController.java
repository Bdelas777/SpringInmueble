package com.bdelas.springbootmicroservice1inmueble2.controller;

import com.bdelas.springbootmicroservice1inmueble2.model.Inmueble;
import com.bdelas.springbootmicroservice1inmueble2.service.InmuebleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/inmueble")
public class InmuebleController {
    @Autowired
    private InmuebleService inmuebleService;

    // Guardar datos
    @PostMapping
    public ResponseEntity<?> saveInmueble(@RequestBody Inmueble inmueble){
        return new ResponseEntity<>(
                inmuebleService.saveInmueble(inmueble),
                HttpStatus.CREATED
                );
    }
    // Eliminar datos
    @DeleteMapping("{idInmueble}")
    public ResponseEntity<?> deleteInmueble(@PathVariable Long idInmueble){
        inmuebleService.deleteInmueble(idInmueble);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Leer todo
    @GetMapping
    public ResponseEntity<?>getAllInmuebles(){
        return ResponseEntity.ok(inmuebleService.findAllInmuebles());
    }
}
