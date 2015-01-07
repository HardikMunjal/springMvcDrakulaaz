package com.draka.service;

import java.util.List;
import com.draka.domain.User;
public interface UserService {
public void addUser(User user);
public List<User> getUser();
}