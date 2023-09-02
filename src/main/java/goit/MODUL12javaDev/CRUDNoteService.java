package goit.MODUL12javaDev;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CRUDNoteService {
    private Map<Long, NoteEntity> notes;

    public CRUDNoteService() {
        notes = new HashMap<>();
    }

    public List<NoteEntity> listAll() {
        return notes.values().stream().toList();
    }

    public NoteEntity add(NoteEntity note) {
        notes.put(note.getId(), note);
        return note;
    }

    public void deleteById(Long id) {
        if (notes.remove(id) == null) {
            throw new RuntimeException("Note with id = " + id + " doesn't exist!");
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