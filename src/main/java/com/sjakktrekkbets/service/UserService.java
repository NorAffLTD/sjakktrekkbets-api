package com.sjakktrekkbets.service;

import java.util.List;

import com.sjakktrekkbets.dto.RegisterRequest;
import com.sjakktrekkbets.model.User;
import com.sjakktrekkbets.model.VerificationToken;

public interface UserService {

	public User registerNewUserAccount(RegisterRequest registerRequest);

	public User getUser(String verificationToken);

	public void updateUser(User user);

	public void saveRegisteredUser(User user);

	public User findByEmail(String email);

	public void createVerificationToken(User user, String token);

	public VerificationToken getVerificationToken(String VerificationToken);

	public List<User> findActiveUsers();

}
