package com.draka.dao;

import java.util.List;
import com.draka.domain.User;


public interface UserDao {
public void saveUser ( User user );
public List<User> getUser();



}

