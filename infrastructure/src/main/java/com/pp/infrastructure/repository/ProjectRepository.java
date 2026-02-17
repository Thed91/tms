package com.pp.infrastructure.repository;

import com.pp.domain.entity.Project;
import com.pp.domain.enums.ProjectStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findProjectsByOwnerId(Long ownerId);
    List<Project> findProjectsByProjectStatus(ProjectStatus projectStatus);
    List<Project> findProjectsByOwnerIdAndProjectStatus(Long ownerId, ProjectStatus projectStatus);
}
