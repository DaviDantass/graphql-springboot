package com.davidantasdev.graphql.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.davidantasdev.graphql.entity.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class CommentRepository {
    private final Map<String, Comment> comments = new HashMap<>();

    public void save(Comment comment) {
        comments.put(comment.id(), comment);
    }

    public Comment commentById(String id) {
        return comments.get(id);
    }

    public Collection<Comment> findByPost(String postId){
        return comments.values().stream().filter(comment -> comment.postId().equals(postId)).toList();
    }

    public Collection<Comment> findAll() {
        return comments.values();
    }

}
