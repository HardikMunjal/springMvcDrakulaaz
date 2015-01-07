package com.draka.service;

import java.util.List;

import com.draka.domain.AuthorizedUser;

public interface UserAuthorizedService {
	public void saveAuthorizedUser ( AuthorizedUser Authorizeduser );
	public List<AuthorizedUser> getAuthorizedUser();
}