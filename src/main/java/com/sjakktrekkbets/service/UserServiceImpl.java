package com.sjakktrekkbets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjakktrekkbets.dto.RegisterRequest;
import com.sjakktrekkbets.model.User;
import com.sjakktrekkbets.model.VerificationToken;
import com.sjakktrekkbets.repository.UserRepository;
import com.sjakktrekkbets.repository.VerificationTokenRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Autowired
	private VerificationTokenRepository tokenRepository;

	@Override
	public User registerNewUserAccount(RegisterRequest registerRequest) {


		return repository
				.save(new User(registerRequest.getName(), registerRequest.getEmail(), registerRequest.getCountry(), User.INACTIVE_STATUS, registerRequest.getPassword(), User.ROLE_USER));
	}

	private boolean emailExist(String email) {
		User user = repository.findByEmail(email);
		if (user != null) {
			return true;
		}
		return false;
	}

	@Override
	public User getUser(String verificationToken) {
		User user = tokenRepository.findByToken(verificationToken).getUser();
		return user;
	}

	@Override
	public VerificationToken getVerificationToken(String VerificationToken) {
		return tokenRepository.findByToken(VerificationToken);
	}

	@Override
	public void saveRegisteredUser(User user) {
		repository.save(user);
	}

	@Override
	public void createVerificationToken(User user, String token) {
		VerificationToken myToken = new VerificationToken(token, user);
		tokenRepository.save(myToken);
	}

	@Override
	public User findByEmail(String email) {
		return repository.findByEmail(email);
	}

	@Override
	public void updateUser(User user) {
		repository.save(user);

	}

	@Override
	public List<User> findActiveUsers() {
		return repository.findAllActiveUsers();
	}
}
