package com.sjakktrekkbets.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sjakktrekkbets.model.User;

@RepositoryRestResource(excerptProjection = User.class)
@CrossOrigin(origins = "*")
public interface UserRepository extends JpaRepository<User, Long>{
	
	public User  findByEmail(String email);

	@Query(value ="select * from user where status = \"ACTIVE\" ", nativeQuery = true)
	public List<User> findAllActiveUsers();
}
