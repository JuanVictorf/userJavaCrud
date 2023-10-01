package com.crudJavaUser.userJavaCrud.service;

import com.crudJavaUser.userJavaCrud.model.User;
import com.crudJavaUser.userJavaCrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface  UserService {

    User create(User userToCreate);

}
