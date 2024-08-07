package com.lilo.service;

import com.lilo.domain.User;

public interface UserService {
	User findById(long id);

	User findByEmail(String email);

	void save(User user);

	void update(User user);

	void nullifyPartyIdForAllUsers();

	void deleteById(long id);
}
