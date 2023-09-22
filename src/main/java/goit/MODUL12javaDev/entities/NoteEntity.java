package goit.MODUL12javaDev.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NoteEntity {
    @Getter
    @Id
    private Long id;

    private String title;

    private String content;

    public void setId(Long id) {
        this.id = id;
    }
}