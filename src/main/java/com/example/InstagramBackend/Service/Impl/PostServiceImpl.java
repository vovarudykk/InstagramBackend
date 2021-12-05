package com.example.InstagramBackend.Service.Impl;

import com.example.InstagramBackend.Entity.Post;
import com.example.InstagramBackend.Repository.PostRepo;
import com.example.InstagramBackend.Service.PostService;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class PostServiceImpl implements PostService {
    private final PostRepo postRepo;

    public PostServiceImpl(PostRepo userRepo) {
        this.postRepo = userRepo;
    }

    @Override
    public List<Post> getPosts() {
        return postRepo.findAll();
    }

    @Override
    public Post getPostById(long id) {
        return postRepo.findById(id).orElseThrow(null);
    }
}
