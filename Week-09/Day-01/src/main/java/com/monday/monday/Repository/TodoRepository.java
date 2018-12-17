package com.monday.monday.Repository;

import com.monday.monday.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAllByTitle(String title);
}
