package com.davidantasdev.graphql.controller;

import java.util.Collection;

import com.davidantasdev.graphql.entity.Post;
import com.davidantasdev.graphql.service.PostService;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    // @SchemaMapping(typeName = "Query", field = "postsById") -> consulta-query
    @QueryMapping
    public Post postById(@Argument String id) {
        return postService.postById(id);
    }

    //mutations
    @MutationMapping
    public Collection<Post> createPost(@Argument String content) {
        return postService.createPost(content);
    }


}
