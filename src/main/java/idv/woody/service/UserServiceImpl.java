package idv.woody.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;

import idv.woody.model.User;
import idv.woody.model.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	private static final int MAX_LOGIN_RETRY = 3;
	
	@Override
	public User login(String username, String password) throws Exception {
		Optional<User> userOptional = userDao.find(username);
		String loginFailedMsg = "Username/password not match";
		if (!userOptional.isPresent()) {
			throw new Exception(loginFailedMsg);
		}
		User user = userOptional.get();
		if (!user.getPassword().equals(password) || user.getRetryTimes() > MAX_LOGIN_RETRY) {
			throw new Exception(loginFailedMsg);
		}
		return user;
	}

	@Override
	public void saveOrUpdate(User user) {
		userDao.saveOrUpdate(user);
	}

}
