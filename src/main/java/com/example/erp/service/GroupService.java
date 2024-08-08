package com.example.erp.service;

import com.example.erp.model.Group;
import com.example.erp.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;
    
    public Group createGroup(Group group) {
        return groupRepository.save(group);
    }
    
    public Group findByName(String name) {
        return groupRepository.findByName(name);
    }
}