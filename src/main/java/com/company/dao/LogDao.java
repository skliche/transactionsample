package com.company.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface LogDao {
	@Update("/* ping */ SELECT 1")
	public void ping();

	@Insert("INSERT INTO logs (entry) VALUES (#{entry})")
	public void createLogEntry(String entry);
}
