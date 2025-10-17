package com.taskhub.taskhub_backend.repository;

import com.taskhub.taskhub_backend.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
