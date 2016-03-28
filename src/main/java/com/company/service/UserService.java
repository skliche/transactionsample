package com.company.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.LogDao;
import com.company.dao.UserDao;

@Service
public class UserService {
	private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

	@Autowired
	UserDao userDao;
	
	@Autowired
	LogDao logDao;
	
	@Transactional
	public void register(String userId, String password) {
		LOG.info("registering...");
		
		// persist the user
		userDao.register(userId, password);
		
		// log registration
		logDao.createLogEntry("user with id " + userId + " has been registered");
		
		// now crash ;) 
		throw new IllegalStateException("something bad happened");
		
	}
}
