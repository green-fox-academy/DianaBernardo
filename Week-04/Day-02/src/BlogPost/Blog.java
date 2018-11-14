package BlogPost;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Blog {
    List<BlogPost> blogPosts;

    public Blog() {
        this.blogPosts = new ArrayList<>();
    }

    public void add(BlogPost blogPost) {
        blogPosts.add(blogPost);
    }

    public void delete(int index) {
        blogPosts.remove(index);
    }

    public void update(int index, BlogPost post) {
        blogPosts.add(index, post);
    }

    @Override
    public String toString() {
        return "This is a blog" + blogPosts;
    }
}
