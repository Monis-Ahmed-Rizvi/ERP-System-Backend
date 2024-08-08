package com.example.erp.controller;

import com.example.erp.model.Group;
import com.example.erp.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/groups")
public class GroupController {
    @Autowired
    private GroupService groupService;
    
    @PostMapping
    public ResponseEntity<Group> createGroup(@RequestBody Group group) {
        return ResponseEntity.ok(groupService.createGroup(group));
    }
    
    @GetMapping("/{name}")
    public ResponseEntity<Group> getGroup(@PathVariable String name) {
        return ResponseEntity.ok(groupService.findByName(name));
    }
}