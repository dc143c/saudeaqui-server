package com.saudeaqui.apiserver.controller;

import com.saudeaqui.apiserver.dto.MessageResponseDTO;
import com.saudeaqui.apiserver.entity.Project;
import com.saudeaqui.apiserver.repository.ProjectRepository;
import com.saudeaqui.apiserver.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/project")
public class ProjectsController {

    private ProjectService projectService;

    @GetMapping
    public String getStatus(){
        return "API Online";
    }

    @Autowired
    public void ProjectService(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createProject(@RequestBody Project project){
        return projectService.createProject(project);
    }
}
