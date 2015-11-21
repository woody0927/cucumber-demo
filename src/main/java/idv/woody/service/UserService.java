package idv.woody.service;

import idv.woody.model.User;

public interface UserService {
	User login(String username, String password) throws Exception;
	void saveOrUpdate(User user);
}
