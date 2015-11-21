package idv.woody.service;

import static org.junit.Assert.assertEquals;
import idv.woody.model.User;
import idv.woody.model.UserDao;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class UserServiceTest {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void login() throws Exception{
		User user = new User();
		user.setUsername(RandomStringUtils.randomAlphanumeric(8));
		user.setPassword(RandomStringUtils.randomAlphanumeric(8));
		userDao.saveOrUpdate(user);
		assertEquals(user, userService.login(user.getUsername(), user.getPassword()));
	}
}
