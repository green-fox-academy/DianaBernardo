package com.reddit.reddit.Controllers;

import com.reddit.reddit.Post;
import com.reddit.reddit.RedditApplication;
import com.reddit.reddit.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

  private PostRepository postRepository;

  @Autowired
  public HomeController(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @RequestMapping("/")
  public String homepage(Model model) {
    model.addAttribute("posts", postRepository.findAll());
    return "homepage";
  }

  @GetMapping("/submit")
  public String submit(Model model) {
    model.addAttribute("post", new Post());
    return "submit";
  }

  @PostMapping("/submit")
  public String submitPost(Post post) {
    postRepository.save(post);
    return "redirect:/";
  }

  @GetMapping ("/{id}/upvote")
  public String upvote(@PathVariable Long id) {
    Post uprated = postRepository.findById(id).get();
    uprated.setVotes(postRepository.findById(id).get().getVotes() + 1);
    postRepository.save(uprated);
    return "redirect:/";
  }

  @GetMapping ("/{id}/downvote")
  public String downvote(@PathVariable Long id) {
    Post downrated = postRepository.findById(id).get();
    downrated.setVotes(postRepository.findById(id).get().getVotes() - 1);
    postRepository.save(downrated);
    return "redirect:/";
  }

}
