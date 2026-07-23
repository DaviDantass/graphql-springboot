package com.davidantasdev.graphql.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.davidantasdev.graphql.entity.Post;

@Repository
public class PostRepository {

    private final Map<String, Post> posts = new HashMap<>();

    public void save(Post post) {
        posts.put(post.id(), post);
    }

    public Post postById(String id) {
        return posts.get(id);
    }

    public Collection<Post> findAll() {
        return posts.values();
    }
}