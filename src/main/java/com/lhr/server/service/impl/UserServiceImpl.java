package com.lhr.server.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhr.common.Success;
import com.lhr.server.dao.UserMapper;
import com.lhr.server.entity.User;
import com.lhr.server.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserMapper userMapper;

	@Override
	public Success saveUser(User user) {
		int c = this.userMapper.insert(user);
		logger.debug("新增数量：{}", c);
		if (c == 1) {
			return new Success(true, "200", "保存成功");
		} else {
			return new Success(false, "500", "保存失败");
		}
	}

	@Override
	public Success updateUser(User user) {
		int c = this.userMapper.updateByPrimaryKey(user);
		logger.debug("更新数量：{}", c);
		if (c == 1) {
			return new Success(true, "200", "更新成功");
		} else {
			return new Success(false, "500", "更新失败");
		}
	}

}
