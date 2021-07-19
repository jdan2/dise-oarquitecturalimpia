package multimodule.service;

import multimodule.mapper.RecursoMapper;
import multimodule.model.Recurso;
import multimodule.format.RecursoFormat;
import multimodule.repository.RecursoRepository;
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

    public RecursoFormat crearrecurso(RecursoFormat recursoFormat){
        Recurso recurso = recursoMapper.fromDTO(recursoFormat);
        return recursoMapper.fromModel(recursoRepository.save(recurso));
    }

    public List<RecursoFormat> obtenerTodos() {
        List<Recurso> recursos = (List<Recurso>) recursoRepository.findAll();
        return recursoMapper.fromCollectionList(recursos);
    }
}
