package goit.MODUL12javaDev.services;

import goit.MODUL12javaDev.entities.NoteEntity;
import goit.MODUL12javaDev.reposetories.INoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CRUDNoteService {

    private final INoteRepository noteRepository;

    public NoteEntity createNote(NoteEntity note) {
        return noteRepository.save(note);
    }

    public Optional<NoteEntity> readById(Long id) {
        return noteRepository.findById(id);
    }

    public void deleteById(Long id) {
        noteRepository.deleteById(id);
    }

    public void updateById(NoteEntity note) {
        NoteEntity currentNote = noteRepository.findById(note.getId()).get();
        currentNote.setTitle(note.getTitle());
        currentNote.setContent(note.getContent());
        noteRepository.save(currentNote);
    }


    public List<NoteEntity> getAllNotes() {
        List<NoteEntity> notes = new ArrayList<>();
        noteRepository.findAll().forEach(note -> notes.add(note));
        return notes;
    }
}