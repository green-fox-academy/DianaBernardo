package com.reddit.reddit;

import com.reddit.reddit.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication {

  public static void main(String[] args) {
    SpringApplication.run(RedditApplication.class, args);
  }

}

