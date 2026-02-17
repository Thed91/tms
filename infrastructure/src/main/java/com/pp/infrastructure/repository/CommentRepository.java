package com.pp.infrastructure.repository;

import com.pp.domain.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findCommentsByTaskId(long taskId);
    List<Comment> findCommentsByUserId(long userId);
}
