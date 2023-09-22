package goit.MODUL12javaDev;

import goit.MODUL12javaDev.controllers.NoteController;
import goit.MODUL12javaDev.entities.NoteEntity;
import goit.MODUL12javaDev.reposetories.INoteRepository;
import goit.MODUL12javaDev.services.CRUDNoteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Modul12JavaDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(Modul12JavaDevApplication.class, args);
	}
}
