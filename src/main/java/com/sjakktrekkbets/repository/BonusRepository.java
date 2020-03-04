package com.sjakktrekkbets.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sjakktrekkbets.model.Bonus;

@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface BonusRepository extends PagingAndSortingRepository<Bonus, Long> {


	
	

}
