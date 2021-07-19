package multimodule.mapper;

import multimodule.format.RecursoFormat;
import multimodule.model.Recurso;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RecursoMapper {

    public Recurso fromDTO(RecursoFormat recursoFormat) {
        Recurso recurso = new Recurso();
        recurso.setId(recursoFormat.getId());
        recurso.setNombre(recursoFormat.getNombre());
        recurso.setTipo(recursoFormat.getTipo());
        return recurso;
    }


    public RecursoFormat fromModel(Recurso recurso) {
        RecursoFormat recursoDTO = new RecursoFormat();
        recursoDTO.setId(recurso.getId());
        recursoDTO.setNombre(recurso.getNombre());
        recursoDTO.setTipo(recurso.getTipo());
        return recursoDTO;
    }
    public List<RecursoFormat> fromCollectionList(List<Recurso> collection) {
        if (collection == null) {
            return null;

        }
        List<RecursoFormat> list = new ArrayList(collection.size());
        Iterator listTracks = collection.iterator();

        while(listTracks.hasNext()) {
            Recurso recursos = (Recurso)listTracks.next();
            list.add(fromModel(recursos));
        }

        return list;
    }
}
