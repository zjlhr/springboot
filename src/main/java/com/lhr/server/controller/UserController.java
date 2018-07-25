package com.lhr.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lhr.common.Success;
import com.lhr.server.entity.User;
import com.lhr.server.service.UserService;

import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 添加用户
	 *
	 * @param user
	 *            用户对象
	 * @since 2016年9月21日21:01:50
	 */
	@RequestMapping("/addUser")
	@ApiOperation(notes = "添加用户", value = "添加一个用户", httpMethod = "POST")
	@ApiImplicitParams({})
	public Success addUser(User user) {
		return this.userService.saveUser(user);
	}

	/**
	 * 修改用户
	 *
	 * @param user
	 *            用户对象
	 * @since 2016年9月21日21:01:50
	 */
	@RequestMapping("/updateUser")
	@ApiOperation(notes = "修改用户", value = "修改一个用户", httpMethod = "POST")
	@ApiImplicitParams({})
	public Success updateUser(User user) {
		return this.userService.updateUser(user);
	}
}
