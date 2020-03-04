package com.sjakktrekkbets.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sjakktrekkbets.model.Bet;

@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface BetsRepository extends PagingAndSortingRepository<Bet, Long> {

	@Query("SELECT b FROM Bet b WHERE b.status != null order by kickOffDate desc")
	List<Bet> findSettledBets();
	
	@Query("SELECT b FROM Bet b WHERE  b.kickOffDate > CURRENT_DATE() order by b.kickOffDate ASC")
	List<Bet> findNewBets(Pageable pageable);
	
	@Query(value = "SELECT SUM(b.stake) FROM bet b WHERE b.status IN (\"LOST\", \"WON\")", nativeQuery = true)
	Integer getUnitsOut();
	
	@Query(value = "SELECT SUM(b.stake * b.odds) FROM bet b WHERE b.status=\"WON\" ", nativeQuery = true)
	BigDecimal getUnitsIn();
	
	@Query(value = "SELECT SUM(b.stake * b.odds) - SUM(b.stake) FROM bet b WHERE b.status=\"WON\" ", nativeQuery = true)
	BigDecimal getTotalEarning();
	
	@Query(value = "SELECT SUM(b.stake) FROM bet b WHERE b.status=\"LOST\" ", nativeQuery = true)
	BigDecimal getTotalLoss();
	
	@Query(value = "SELECT COUNT(*) FROM bet WHERE status=\"WON\" ", nativeQuery = true)
	Integer getCountWon();
	
	@Query(value = "SELECT COUNT(*) FROM bet WHERE status=\"LOST\" ", nativeQuery = true)
	Integer getCountLost();
	
	@Query(value = "SELECT COUNT(*) FROM bet WHERE status IN (\"LOST\", \"WON\") ", nativeQuery = true)
	Integer getCountLostAndWon();
	
	@Query(value = "SELECT COUNT(*) FROM bet ", nativeQuery = true)
	Integer getCountAll();
	
	@Modifying
	@Query("UPDATE Bet b SET b.image = :imageName WHERE b.betId = :betId ")
	void updateImage(@Param("betId") Long betId, @Param("imageName") String imageName);
	
	
	
	

}
