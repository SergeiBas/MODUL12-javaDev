package goit.MODUL12javaDev.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class NoteEntity {
    private Long id;

    private String title;

    private String content;
}