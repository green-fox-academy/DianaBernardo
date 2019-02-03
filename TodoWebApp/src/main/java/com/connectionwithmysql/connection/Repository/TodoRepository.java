package com.connectionwithmysql.connection.Repository;

import com.connectionwithmysql.connection.Assignee;
import com.connectionwithmysql.connection.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

 // List<Todo> findByTitle();

  List<Todo> findByDone(Boolean done);


  List<Todo> findAllByTitleContains(String query);

  List<Todo> findAllByAssignee(Assignee assignee);

  List<Todo> findTodosByAssignee(Assignee assignee);
}
