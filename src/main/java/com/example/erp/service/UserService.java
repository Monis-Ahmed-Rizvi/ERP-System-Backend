package com.example.erp.service;

import com.example.erp.model.User;
import com.example.erp.model.Group;
import com.example.erp.repository.UserRepository;
import com.example.erp.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private GroupRepository groupRepository;
    
    public User createUser(User user, String groupName) {
        Group group = groupRepository.findByName(groupName);
        if (group == null) {
            group = new Group();
            group.setName(groupName);
            groupRepository.save(group);
        }
        user.setGroup(group);
        return userRepository.save(user);
    }
    
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
