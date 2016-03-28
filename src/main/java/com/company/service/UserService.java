package com.company.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.LogDao;
import com.company.dao.UserDao;

@Service
public class UserService {
	private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

	@Autowired
	UserDao userDao;
	
	@Autowired
	LogDao logDao;
	
	public void register() {
		LOG.info("registering...");
		
		userDao.ping();
		logDao.ping();
	}
}
