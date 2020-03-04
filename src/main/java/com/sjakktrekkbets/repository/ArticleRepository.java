package com.sjakktrekkbets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sjakktrekkbets.model.Article;

@RepositoryRestResource(excerptProjection = Article.class)
@CrossOrigin(origins = "*")
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
