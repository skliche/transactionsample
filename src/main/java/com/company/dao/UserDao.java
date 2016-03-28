package com.company.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
	@Select("/* ping */ SELECT 1")
	public void ping();
}
