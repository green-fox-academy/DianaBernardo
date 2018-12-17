package com.monday.monday.Controller;

import com.monday.monday.Repository.TodoRepository;
import com.monday.monday.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController implements CommandLineRunner {

  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping("/todo")
  public String showTodo() {
    return "todo";
  }

  @RequestMapping(value = {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    //todoRepository.save(new Todo());
    return "todolist";
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Learn Object Relational Mapping", true, false));
    todoRepository.save(new Todo("Learn SQL", false, false));
    todoRepository.save(new Todo("Buy Christmas presents", true, true));
  }
}
