package com.lyl.core.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyl.core.domain.User;
import com.lyl.core.repository.UserRepository;

@Service
public class UserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

	@Autowired
	UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User insertByUser(User user) {
		LOGGER.info("新增用户：" + user.toString());
		return userRepository.save(user);
	}

	public User update(User user) {
		LOGGER.info("更新用户：" + user.toString());
		return userRepository.save(user);
	}

	public User delete(Long id) {
		User user = userRepository.findById(id).get();
		userRepository.delete(user);

		LOGGER.info("删除用户：" + user.toString());
		return user;
	}

	public User findById(Long id) {
		LOGGER.info("获取用户 ID ：" + id);
		return userRepository.findById(id).get();
	}
}
