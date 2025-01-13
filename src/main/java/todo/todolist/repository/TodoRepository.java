package todo.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todo.todolist.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
