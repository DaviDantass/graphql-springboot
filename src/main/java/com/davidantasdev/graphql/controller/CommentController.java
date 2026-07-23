package com.davidantasdev.graphql.controller;

import java.util.Collection;

import com.davidantasdev.graphql.entity.Comment;
import com.davidantasdev.graphql.entity.Post;
import com.davidantasdev.graphql.service.CommentService;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @QueryMapping
    public Comment commentById(@Argument String id) {
        return commentService.commentById(id);
    }

    @MutationMapping
    public Collection<Comment> createComment(@Argument String content, @Argument String postId) {
        return commentService.createComment(content, postId);
    }

    @SchemaMapping(typeName = "Post", field = "comments")
    public Collection<Comment> comments(Post post) {
        System.out.println("Comments: ");
        return commentService.findByPost(post.id());
    }
}
