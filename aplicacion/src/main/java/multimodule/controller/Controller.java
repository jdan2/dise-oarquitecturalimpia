package multimodule.controller;

import multimodule.domine.RecursoDTO;
import multimodule.service.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/recursos")
public class Controller {

      @Autowired
    Servicio servicio ;

    @PostMapping("/crear")
    public ResponseEntity<RecursoDTO> create(@RequestBody RecursoDTO recursoDTO) {
        return new ResponseEntity<>(servicio.crearrecurso(recursoDTO), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<RecursoDTO>> findAll() {
        return new ResponseEntity(servicio.obtenerTodos(), HttpStatus.OK);
    }
}
