package sn.senForageSpringApi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sn.senForageSpringApi.entities.Pharmacie;

@Repository
public interface IPharmacie extends JpaRepository<Pharmacie, Integer>{
	
	
	@Query("SELECT c FROM Pharmacie c WHERE c.ville=:ville")
	public List<Pharmacie>getAllPharmacieByVille(@Param("ville") String ville);
	@Query("SELECT c FROM Pharmacie c WHERE c.quartier=:quartier")
	public List<Pharmacie>getAllPharmacieByQuartier(@Param("quartier") String quartier);
	

}
