package com.sjakktrekkbets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sjakktrekkbets.model.Bookie;
import com.sjakktrekkbets.model.Sport;

@RepositoryRestResource(excerptProjection = Sport.class)
@CrossOrigin(origins = "*")
public interface SportRepository extends JpaRepository<Sport, Integer>{
}
