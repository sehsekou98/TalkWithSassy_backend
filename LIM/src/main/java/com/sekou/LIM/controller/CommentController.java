package com.sekou.LIM.controller;

import com.sekou.LIM.enity.Comment;
import com.sekou.LIM.repository.CommentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    private final CommentRepository commentRepository;

    public CommentController(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @GetMapping
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @PostMapping
    public  Comment createComment(@RequestBody Comment comment) {
        return commentRepository.save(comment);
    }
}
