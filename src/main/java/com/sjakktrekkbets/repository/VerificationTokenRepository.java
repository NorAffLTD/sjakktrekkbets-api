package com.sjakktrekkbets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sjakktrekkbets.model.User;
import com.sjakktrekkbets.model.VerificationToken;

@RepositoryRestResource(excerptProjection = User.class)
@CrossOrigin(origins = "*")
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long>{
	
	VerificationToken findByToken(String token);
	 
    VerificationToken findByUser(User user);
}
