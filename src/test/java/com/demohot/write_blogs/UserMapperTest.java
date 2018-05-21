package com.demohot.write_blogs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.demohot.write_blogs.dao.UserMapper;
import com.demohot.write_blogs.po.User;

@RunWith(SpringRunner.class)
@ContextConfiguration({ "classpath:beans.xml" })
public class UserMapperTest {
	@Autowired
	private UserMapper userMapper;

	@Test
	public void testGet() {
		User user = userMapper.get(1);
		System.out.println(user.getUsername());
	}
}
