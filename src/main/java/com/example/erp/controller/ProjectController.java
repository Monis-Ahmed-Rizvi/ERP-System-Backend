package com.example.erp.controller;

import com.example.erp.model.Project;
import com.example.erp.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    
    @PostMapping
    public ResponseEntity<Project> createProject(@Valid @RequestBody Project project) {
        return ResponseEntity.ok(projectService.createProject(project));
    }
    
    @GetMapping("/{name}")
    public ResponseEntity<Project> getProject(@PathVariable String name) {
        return ResponseEntity.ok(projectService.findByName(name));
    }
}