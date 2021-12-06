package com.example.InstagramBackend.Entity;
import lombok.*;
import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name="posts")
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column(name="author")
    public String author;

    @Column(name="avatar")
    public String avatar;

    @Column(name="photo")
    public String photo;

    @Column(name="description")
    public String description;

}

