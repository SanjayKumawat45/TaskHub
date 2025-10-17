package com.taskhub.taskhub_backend.repository;

import com.taskhub.taskhub_backend.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
