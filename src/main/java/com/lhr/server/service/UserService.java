package com.lhr.server.service;

import com.lhr.common.Success;
import com.lhr.server.entity.User;

public interface UserService {

	public Success saveUser(User user);

	public Success updateUser(User user);
}
