package com.connectionwithmysql.connection.Controller;

import com.connectionwithmysql.connection.Assignee;
import com.connectionwithmysql.connection.Repository.AssigneeRepository;
import com.connectionwithmysql.connection.Repository.TodoRepository;
import com.connectionwithmysql.connection.Todo;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TodoController {

  private TodoRepository todoRepository;

  @Autowired
  private AssigneeRepository assigneeRepository;


  @Autowired
  public TodoController(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
    this.todoRepository = todoRepository;
    this.assigneeRepository = assigneeRepository;
  }

  @GetMapping("/todo")
  public String select(Model model, @RequestParam(value = "isActive", required = false) Boolean done,
                       @RequestParam(value = "search", required = false) String title) {
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
    model.addAttribute("assignees", assigneeRepository.findAll());
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
    model.addAttribute("assignees", assigneeRepository.findAll());
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public ModelAndView editTodo(@ModelAttribute("todo") Todo todo, Model model) {
    todoRepository.save(todo);
    return new ModelAndView("redirect:/todo");
  }

  @PostMapping("/search")
  public String search(Model model, @RequestParam("search") String query) {
    model.addAttribute("todos", todoRepository.findAllByTitleContains(query));
    return "todolist";
  }

  @GetMapping("/assignees")
  public String showAssignees(Model model) {
    model.addAttribute("assignees",assigneeRepository.findAll());
    return "assignees";
  }

  @GetMapping("/{id}/deleteassignee")
  public ModelAndView deleteAssignee(@PathVariable Long id) {
    assigneeRepository.deleteById(id);
    return new ModelAndView("redirect:/assignees");
  }

  @GetMapping("/addassignee")
  public String addAssigne(Model model, @ModelAttribute("assignee") Assignee assignee) {
    model.addAttribute("assignee", assignee);
    return "addassignee";
  }

  @PostMapping("/addassignee")
  public String addAssignee2(@ModelAttribute("assignee") Assignee assignee) {
    assigneeRepository.save(assignee);
    return "redirect:/assignees";
  }

  @GetMapping("/{id}/editassignee")
  public String editassignee(@PathVariable Long id, Model model) {
    model.addAttribute("assignee", assigneeRepository.findById(id));
    return "editassignee";
  }

  @PostMapping("/{id}/editassignee")
  public ModelAndView editassignee2(@ModelAttribute("assignee") Assignee assignee, Model model) {
    assigneeRepository.save(assignee);
    return new ModelAndView("redirect:/assignees");
  }

  @GetMapping("/{id}/assignee-todos")
  public String showtodos(Model model, Assignee assignee) {
    model.addAttribute("todos", todoRepository.findTodosByAssignee(assignee));
    return "todos";
  }

}