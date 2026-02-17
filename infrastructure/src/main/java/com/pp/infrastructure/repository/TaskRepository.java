package com.pp.infrastructure.repository;

import com.pp.domain.entity.Task;
import com.pp.domain.enums.Priority;
import com.pp.domain.enums.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findTasksByProjectId(Long projectId);
    List<Task> findTasksByAssigneeId(Long assigneeId);
    List<Task> findTasksByTaskStatusAndPriority(TaskStatus taskStatus, Priority priority);
    @Query("SELECT t FROM Task t WHERE t.dueDate < :now AND t.taskStatus != :status")
    List<Task> findOverdueTasks(@Param("now") LocalDateTime now, @Param("status") TaskStatus status);
}
