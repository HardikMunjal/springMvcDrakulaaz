package com.draka.dao;

import java.util.List;
import com.draka.domain.AuthorizedUser;


public interface UserAuthorizedDao {
public void saveAuthorizedUser ( AuthorizedUser Authorizeduser );
public List<AuthorizedUser> getAuthorizedUser();



}
