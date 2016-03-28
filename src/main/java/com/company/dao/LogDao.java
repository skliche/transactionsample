package com.company.dao;

import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface LogDao {
	@Update("/* ping */ SELECT 1")
	public void ping();
}
