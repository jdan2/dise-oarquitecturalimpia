package multimodule.controller;


import multimodule.format.RecursoFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import multimodule.service.Servicio;

import java.util.List;


@RestController
@RequestMapping("/recursos")
public class Controller {

      @Autowired
      Servicio servicio ;

    @PostMapping("/crear")
    public ResponseEntity<RecursoFormat> create(@RequestBody RecursoFormat recursoFormat) {
        return new ResponseEntity<>(servicio.crearrecurso(recursoFormat), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<RecursoFormat>> findAll() {
        return new ResponseEntity(servicio.obtenerTodos(), HttpStatus.OK);
    }
}
