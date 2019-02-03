package com.reddit.reddit.Controllers;

import com.reddit.reddit.Post;
import com.reddit.reddit.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

  PostService service;

  @Autowired
  public HomeController(PostService service) {
    this.service = service;
  }

  @GetMapping("/")
  public String login(@ModelAttribute String name, @ModelAttribute String user, Model model) {
    model.addAttribute("user", user);
    model.addAttribute("name", name);
    return "login";
  }

  @GetMapping("/posts")
  public String homepage(Model model) {
    model.addAttribute("posts", service.getAll());
    return "homepage";
  }

  @GetMapping("/submit")
  public String submit(Model model) {
    model.addAttribute("post", new Post());
    return "submit";
  }

  @PostMapping("/submit")
  public String submitPost(Post post) {
    service.addPost(post);
    return "redirect:/posts";
  }

  @GetMapping ("/{id}/upvote")
  public String upvote(@PathVariable Long id) {
    service.upVote(id);
    return "redirect:/posts";
  }

  @GetMapping ("/{id}/downvote")
  public String downvote(@PathVariable Long id) {
    service.downVote(id);
    return "redirect:/posts";
  }
}
