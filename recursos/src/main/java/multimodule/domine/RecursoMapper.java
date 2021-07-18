package multimodule.domine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RecursoMapper {

    public Recurso fromDTO(RecursoDTO recursoDTO) {
        Recurso recurso = new Recurso();
        recurso.setId(recursoDTO.getId());
        recurso.setNombre(recursoDTO.getNombre());
        recurso.setTipo(recursoDTO.getTipo());
        return recurso;
    }


    public RecursoDTO fromModel(Recurso recurso) {
        RecursoDTO recursoDTO = new RecursoDTO();
        recursoDTO.setId(recurso.getId());
        recursoDTO.setNombre(recurso.getNombre());
        recursoDTO.setTipo(recurso.getTipo());
        return recursoDTO;
    }
    public List<RecursoDTO> fromCollectionList(List<Recurso> collection) {
        if (collection == null) {
            return null;

        }
        List<RecursoDTO> list = new ArrayList(collection.size());
        Iterator listTracks = collection.iterator();

        while(listTracks.hasNext()) {
            Recurso recursos = (Recurso)listTracks.next();
            list.add(fromModel(recursos));
        }

        return list;
    }
}
