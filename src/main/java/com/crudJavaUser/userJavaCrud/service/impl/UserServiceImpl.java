package com.crudJavaUser.userJavaCrud.service.impl;

import com.crudJavaUser.userJavaCrud.model.User;
import com.crudJavaUser.userJavaCrud.repository.UserRepository;
import com.crudJavaUser.userJavaCrud.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User create(User userToCreate) {
        return userRepository.save(userToCreate);
    }
}
