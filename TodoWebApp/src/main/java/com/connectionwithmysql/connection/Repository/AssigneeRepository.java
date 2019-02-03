package com.connectionwithmysql.connection.Repository;

import com.connectionwithmysql.connection.Assignee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
  List<Assignee> findByName(String name);


}
