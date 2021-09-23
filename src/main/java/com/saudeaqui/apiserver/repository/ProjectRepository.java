package com.saudeaqui.apiserver.repository;

import com.saudeaqui.apiserver.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {


}
