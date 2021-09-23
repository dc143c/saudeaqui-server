package com.saudeaqui.apiserver.service;

import com.saudeaqui.apiserver.dto.MessageResponseDTO;
import com.saudeaqui.apiserver.entity.Project;
import com.saudeaqui.apiserver.repository.ProjectRepository;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    private ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public MessageResponseDTO createProject(Project project){
        Project savedProject = projectRepository.save(project);
        return MessageResponseDTO
                .builder()
                .message("Project generated successfully on ID: " + savedProject.getId())
                .build();
    }
}
