package com.connectionwithmysql.connection.Repository;

import com.connectionwithmysql.connection.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

 // List<Todo> findByTitle();

  List<Todo> findByDone(Boolean done);
}
