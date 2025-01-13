package todo.todolist.service;

import org.springframework.stereotype.Service;
import todo.todolist.model.Todo;
import todo.todolist.repository.TodoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Optional<Todo> getTodoById(Long id) {
        return todoRepository.findById(id);
    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo updateTodo(Long id, Todo todoDetails) {
        return todoRepository.findById(id).map(todo -> {
            todo.setDescription(todoDetails.getDescription());
            todo.setDone(todoDetails.isDone());
            return todoRepository.save(todo);
        }).orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
