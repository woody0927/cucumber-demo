package idv.woody.service;

import idv.woody.model.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemoryService {
	
	@Autowired
	private UserDao userDao;
	
	public void rollbackChanges() {
		userDao.removeAll();
	}
}
