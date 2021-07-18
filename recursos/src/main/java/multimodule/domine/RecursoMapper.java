package multimodule.domine;

public class RecursoMapper {

    public Recurso fromDTO(RecursoDTO recursoDTO) {
        Recurso recurso = new Recurso();
        recurso.setId(recursoDTO.getId());
        recurso.setTipo(recursoDTO.getTipo());
        return recurso;
    }


    public RecursoDTO fromModel(Recurso recurso) {
        RecursoDTO recursoDTO = new RecursoDTO();
        recursoDTO.setId(recurso.getId());
        recursoDTO.setTipo(recurso.getTipo());
        return recursoDTO;
    }
}
