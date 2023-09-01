package homeWork;

import java.util.UUID;

public class Document {

    private final UUID id;
    private final String name;
    private final String content;

    public Document(String name, String content) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.content = content;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
