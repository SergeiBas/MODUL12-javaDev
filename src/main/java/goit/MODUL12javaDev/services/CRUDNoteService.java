package goit.MODUL12javaDev.services;

import goit.MODUL12javaDev.entities.NoteEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CRUDNoteService {
    private Map<Long, NoteEntity> notes;
    private Long nextId;

    public CRUDNoteService() {
        notes = new HashMap<>(Map.of(
                1L, new NoteEntity(1L, "Title", "Text")));
        nextId = (long) notes.size();
    }

    public List<NoteEntity> listAll() {
        return notes.values().stream().toList();
    }

    public NoteEntity add(NoteEntity note) {
        nextId++;
        note.setId(nextId);
        notes.put(nextId, note);
        return note;
    }

    public void deleteById(Long id) {
        if (notes.remove(id) == null) {
            throw new RuntimeException("Note with id = " + id + " doesn't exist!");
        } else {
            notes.remove(id);
        }
    }

    public void update(NoteEntity note) {
        if (notes.containsKey(note.getId())) {
            NoteEntity currentNote = notes.get(note);
            currentNote.setTitle(note.getTitle());
            currentNote.setContent(note.getContent());
        } else {
            throw new RuntimeException("Note with id = " + note.getId() + " doesn`t exist!");
        }
    }

    public NoteEntity getById(Long id) {
        return notes.get(id);
    }
}
