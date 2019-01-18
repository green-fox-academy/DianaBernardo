package com.reddit.reddit.Repositories;

import com.reddit.reddit.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository <Post, Long> {

  List<Post> findByTitle(String title);

}
