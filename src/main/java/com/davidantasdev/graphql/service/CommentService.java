package com.davidantasdev.graphql.service;

import java.util.Collection;
import java.util.UUID;

import com.davidantasdev.graphql.repository.CommentRepository;
import org.springframework.stereotype.Service;

import com.davidantasdev.graphql.entity.Comment;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    public Comment commentById(String id) {
        return commentRepository.commentById(id);
    }

    public Collection<Comment> findByPost(String postId){
        return commentRepository.findByPost(postId);
    }

    public Collection<Comment> createComment(String content, String postId) {
        var newComment = new Comment(UUID.randomUUID().toString(), content, postId);
        commentRepository.save(newComment);
        return commentRepository.findAll();
    }
}
