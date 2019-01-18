package com.reddit.reddit.Services;

import com.reddit.reddit.Post;
import com.reddit.reddit.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

  PostRepository postRepository;

  @Autowired
  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public List<Post> getAll() {
    return (List<Post>) postRepository.findAll();
  }

  public Post get(Long id) {
    Optional<Post> post = postRepository.findById(id);
    if (post.isPresent()) {
      return post.get();
    }
    throw new IndexOutOfBoundsException();
  }

  public void addPost(Post post) {
    postRepository.save(post);
  }

  public Post upVote(Long id) {
    Post uprated = postRepository.findById(id).get();
    uprated.setVotes(postRepository.findById(id).get().getVotes() + 1);
    postRepository.save(uprated);
    return uprated;
  }

  public Post downVote(Long id) {
    Post downrated = postRepository.findById(id).get();
    downrated.setVotes(postRepository.findById(id).get().getVotes() - 1);
    postRepository.save(downrated);
    return downrated;
  }

  public String login(@ModelAttribute("name") String name, Model model) {
  model.addAttribute("name", name);
  return "redirect:/?name=" + name;
  }
}
