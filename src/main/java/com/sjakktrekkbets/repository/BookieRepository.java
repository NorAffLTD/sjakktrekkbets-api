package com.sjakktrekkbets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sjakktrekkbets.model.Bookie;

@RepositoryRestResource(excerptProjection = Bookie.class)
@CrossOrigin(origins = "*")
public interface BookieRepository extends JpaRepository<Bookie, Integer>{
}
