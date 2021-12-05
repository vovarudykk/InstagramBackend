package com.example.InstagramBackend.Service;

import com.example.InstagramBackend.Entity.Post;

import java.util.List;

public interface PostService {
    List<Post> getPosts();

    Post getPostById(long id);
}
