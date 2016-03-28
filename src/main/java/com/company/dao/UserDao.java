package com.company.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
	@Update("/* ping */ SELECT 1")
	public void ping();

	@Insert("INSERT INTO users (userid, passwd) VALUES (#{userid}, PASSWORD(#{password}))")
	public void register(@Param("userid") String userid,@Param("password") String password);
}
