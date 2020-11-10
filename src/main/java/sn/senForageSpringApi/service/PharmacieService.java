package sn.senForageSpringApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sn.senForageSpringApi.dao.IPharmacie;
import sn.senForageSpringApi.entities.Pharmacie;

@RestController
public class PharmacieService {
	
	@Autowired
	private IPharmacie pharmaciedao;
	
	@RequestMapping(value="Pharmacie/liste" , method=RequestMethod.GET)
	public List<Pharmacie> getAll(){
		return pharmaciedao.findAll();
		
	}
	
	@RequestMapping(value="Pharmacie/liste/{ville}" , method=RequestMethod.GET)
	public List<Pharmacie> getAllPharmacieByVille(@PathVariable String ville){
		return pharmaciedao.getAllPharmacieByVille(ville);
		
	}
	
	@RequestMapping(value="Pharmacie/liste/{quartier}" , method=RequestMethod.GET)
	public List<Pharmacie> getAllPharmacieByQuartier(@PathVariable String quartier){
		return pharmaciedao.getAllPharmacieByQuartier(quartier);
		
	}
	
	@RequestMapping(value="Pharmacie/liste/save" , method=RequestMethod.POST)
	public List<Pharmacie> save(Pharmacie pharmacie){
		 pharmaciedao.save(pharmacie);
		return pharmaciedao.findAll();
	}
	
	@RequestMapping(value="Pharmacie/liste/delete/{id}" , method=RequestMethod.DELETE)
	public List<Pharmacie> delete(@PathVariable int id){
		if(pharmaciedao.findById(id) != null) {
		 pharmaciedao.deleteById(id);
		}
		return pharmaciedao.findAll();
	}
	
	  @RequestMapping(value="Pharmacie/liste/update/{id}" , method=RequestMethod.PUT) 
	  public List<Pharmacie> update(@PathVariable int id , Pharmacie pharmacie){
	       pharmacie.setId(id);
			/*
			 * pharmacie.setNom("nom"); pharmacie.setQuartier("quartier");
			 * pharmacie.setVille("ville"); pharmacie.setEtat(1);
			 */
	       pharmaciedao.save(pharmacie);
	       
	       return pharmaciedao.findAll(); 
	  }
	 
}
