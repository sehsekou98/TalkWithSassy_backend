package com.sekou.LIM.repository;

import com.sekou.LIM.enity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
