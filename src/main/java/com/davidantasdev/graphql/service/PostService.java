package com.davidantasdev.graphql.service;

import java.util.Collection;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.davidantasdev.graphql.entity.Post;
import com.davidantasdev.graphql.repository.PostRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository repository;

    public Post postById(String id) {
        return repository.postById(id);
    }

    public Collection<Post> createPost(String content) {
        Post newPost = new Post(UUID.randomUUID().toString(), content);
        repository.save(newPost);
        return repository.findAll();
    }
}