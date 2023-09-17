package goit.MODUL12javaDev.reposetories;

import goit.MODUL12javaDev.entities.NoteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INoteRepository extends CrudRepository<NoteEntity, Long> {
}