package multimodul.controller;

import multimodule.domine.RecursoDTO;
import multimodule.service.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.example.multimodul")
@RestController
@RequestMapping("/recursos")
public class Controller {

    @Autowired
    Servicio servicio ;

    @PostMapping("/crear")
    public ResponseEntity<RecursoDTO> create(@RequestBody RecursoDTO recursoDTO) {
        return new ResponseEntity<>(servicio.crearrecurso(recursoDTO), HttpStatus.CREATED);
    }
}
