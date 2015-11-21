package idv.woody.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.google.common.base.Optional;

@Repository
public class UserDao {
	private Map<String, User> userMap = new HashMap<String, User>();
	public void saveOrUpdate(User user) {
		userMap.put(user.getUsername(), user);
	}
	
	public Optional<User> find(String username) {
		return Optional.fromNullable(userMap.get(username));
	}

	public void removeAll() {
		userMap.clear();
	}
}
