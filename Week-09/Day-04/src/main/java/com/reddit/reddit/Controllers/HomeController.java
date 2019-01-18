package com.reddit.reddit.Controllers;

import com.reddit.reddit.Post;
import com.reddit.reddit.RedditApplication;
import com.reddit.reddit.Repositories.PostRepository;
import com.reddit.reddit.Services.PostService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

  PostService service;

  private PostRepository postRepository;

  @Autowired
  public HomeController(PostRepository postRepository, PostService service) {
    this.postRepository = postRepository;
    this.service = service;
  }

  @RequestMapping("/")
  public String login(String name, Model model) {
    service.login(name, model);
    return "login";
  }

  @RequestMapping("/posts")
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
