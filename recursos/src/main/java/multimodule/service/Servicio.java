package multimodule.service;

import multimodule.domine.Recurso;
import multimodule.domine.RecursoMapper;
import multimodule.domine.RecursoDTO;
import multimodule.domine.RecursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.webservices.WebServicesProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@EnableConfigurationProperties(WebServicesProperties.class)
public class Servicio {

    @Autowired
    RecursoRepository recursoRepository;

    RecursoMapper recursoMapper = new RecursoMapper();

    public RecursoDTO crearrecurso(RecursoDTO recursoDTO){
        Recurso recurso = recursoMapper.fromDTO(recursoDTO);
        return recursoMapper.fromModel(recursoRepository.save(recurso));
    }

    public List<RecursoDTO> obtenerTodos() {
        List<Recurso> recursos = (List<Recurso>) recursoRepository.findAll();
        return recursoMapper.fromCollectionList(recursos);
    }
}
