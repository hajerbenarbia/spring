package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.User;

public interface UserService {
	User saveUser (User user);
	User updateUser  (User user);
	void deleteUser (User user);
	void deleteUserById(Long id);
	User getUser(Long id);
	List<User> getAllUsers();
 
}
