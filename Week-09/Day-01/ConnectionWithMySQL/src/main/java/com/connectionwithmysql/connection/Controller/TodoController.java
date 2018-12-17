package com.connectionwithmysql.connection.Controller;

import com.connectionwithmysql.connection.Repository.TodoRepository;
import com.connectionwithmysql.connection.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TodoController {

  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping("/todo")
  public String select(Model model, @RequestParam(value = "isActive", required = false) Boolean done) {
    if (done != null) {
      model.addAttribute("todos", todoRepository.findByDone(done));
    } else {
      model.addAttribute("todos", todoRepository.findAll());
    }
    return "todolist";
  }

  @RequestMapping(value = {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    //todoRepository.save(new Todo());
    return "todolist";
  }

  @GetMapping("/add")
  public String addTodo(Model model, @ModelAttribute("todo") Todo todo) {
    model.addAttribute("todo", todo);
    return "addtodo";
  }

  @PostMapping("/add")
  public String addTask(@ModelAttribute("todo") Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo";
  }

  @GetMapping("/{id}/delete")
  public ModelAndView delete(@PathVariable Long id) {
    todoRepository.deleteById(id);
    return new ModelAndView("redirect:/todo");
  }

  @GetMapping("/{id}/edit")
  public String edit(@PathVariable Long id, Model model) {
    model.addAttribute("todo", todoRepository.findById(id));
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public ModelAndView editTodo(@ModelAttribute("todo") Todo todo, Model model) {
    todoRepository.save(todo);
    return new ModelAndView("redirect:/todo");
  }
}
