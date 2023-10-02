package com.crudJavaUser.userJavaCrud.service;

import com.crudJavaUser.userJavaCrud.model.User;
import com.crudJavaUser.userJavaCrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {

    User create(User userToCreate);

    User findById(Long id);

    List<User> findAll();

    User deleteUserById(Long id);

}
