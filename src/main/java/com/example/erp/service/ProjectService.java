package com.example.erp.service;

import com.example.erp.model.Project;
import com.example.erp.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;
    
    public Project createProject(Project project) {
        return projectRepository.save(project);
    }
    
    public Project findByName(String name) {
        return projectRepository.findByName(name);
    }
}