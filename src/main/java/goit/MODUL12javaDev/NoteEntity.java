package goit.MODUL12javaDev;

import java.util.concurrent.ThreadLocalRandom;

public class NoteEntity {
    private Long id;

    private String title;

    private String content;

    public NoteEntity(String title, String content) {
        id = ThreadLocalRandom.current().nextLong(1, 10);
        this.title = title;
        this.content = content;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Note{" + "id=" + id + ", title='" + title + '\'' + ", content='" + content + '\'' + '}';
    }
}