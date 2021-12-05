package com.example.InstagramBackend.Repository;
import com.example.InstagramBackend.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends JpaRepository<Post, Long>{
}
