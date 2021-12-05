package com.example.InstagramBackend.Controller;

import com.example.InstagramBackend.Entity.Post;
import com.example.InstagramBackend.Service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/post")
    public ResponseEntity<?> getPosts() {
        List<Post> resultPosts = postService.getPosts();
        return ResponseEntity.ok(resultPosts);
    }

    @GetMapping("/post/{id}")
    public ResponseEntity<?> getPostById(@PathVariable("id") long id) {
        Post resultPost = postService.getPostById(id);
        return ResponseEntity.ok(resultPost);
    }
}
