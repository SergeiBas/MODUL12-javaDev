package goit.MODUL12javaDev.controllers;

import goit.MODUL12javaDev.entities.NoteEntity;
import goit.MODUL12javaDev.services.CRUDNoteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/note")
public class NoteController {

    private CRUDNoteService noteService;

    public NoteController(CRUDNoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping(value = "/list")
    public ModelAndView getListOfNotes() {
        ModelAndView model = new ModelAndView("notes/index");
        model.addObject("notes", noteService.listAll());
        return model;
    }

    @PostMapping(path = "/delete")
    public String deleteNote(@RequestParam("id") Long id) {
        noteService.deleteById(id);
        return "redirect:/note/list";
    }

    @GetMapping(value = "/edit")
    public ModelAndView editNote(@RequestParam("id") Long id) {
        ModelAndView edit = new ModelAndView("notes/editing-note");
        NoteEntity byId = noteService.getById(id);
        edit.addObject("note", byId);
        return edit;
    }

    @PostMapping(path = "/edit")
    public String updateNote(@ModelAttribute("note") NoteEntity updateNote) {
        noteService.update(updateNote);
        return "redirect:/note/list";
    }

    @GetMapping(value = "/create")
    public String createNote() {
        return "notes/creating-note";
    }

    @PostMapping(path = "/create")
    public String updateListOfNodes(@ModelAttribute("note") NoteEntity newNote) {
        noteService.add(newNote);
        return "redirect:/note/list";
    }
}