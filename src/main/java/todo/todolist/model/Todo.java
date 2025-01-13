package todo.todolist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincremento do id
    private Long id;

    private String description; // Descrição da tarefa
    private boolean done;       // Status de conclusão

    // Construtor sem argumentos
    public Todo() {}

    // Construtor com parâmetros
    public Todo(Long id, String description, boolean done) {
        this.id = id;
        this.description = description;
        this.done = done;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
