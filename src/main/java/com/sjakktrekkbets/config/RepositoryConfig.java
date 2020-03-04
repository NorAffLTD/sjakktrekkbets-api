package com.sjakktrekkbets.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.sjakktrekkbets.events.ArticleEventHandler;
import com.sjakktrekkbets.events.BetEventHandler;
import com.sjakktrekkbets.events.BookieEventHandler;
import com.sjakktrekkbets.model.Article;
import com.sjakktrekkbets.model.Banner;
import com.sjakktrekkbets.model.Bet;
import com.sjakktrekkbets.model.Bonus;
import com.sjakktrekkbets.model.Bookie;
import com.sjakktrekkbets.model.League;
import com.sjakktrekkbets.model.Sport;
import com.sjakktrekkbets.model.User;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Bet.class);
		config.exposeIdsFor(Bookie.class);
		config.exposeIdsFor(Sport.class);
		config.exposeIdsFor(Article.class);
		config.exposeIdsFor(User.class);
		config.exposeIdsFor(League.class);
		config.exposeIdsFor(Bonus.class);
		config.exposeIdsFor(Banner.class);
	}

	@Bean
	BetEventHandler betEventHandler() {
		return new BetEventHandler();
	}

	@Bean
	ArticleEventHandler articleEventHandler() {
		return new ArticleEventHandler();
	}

	@Bean
	BookieEventHandler bookieEventHandler() {
		return new BookieEventHandler();
	}
}
