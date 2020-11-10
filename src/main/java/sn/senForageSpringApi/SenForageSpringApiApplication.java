package sn.senForageSpringApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sn.senForageSpringApi.dao.IPharmacie;
import sn.senForageSpringApi.entities.Pharmacie;

@SpringBootApplication
public class SenForageSpringApiApplication implements CommandLineRunner{
	
	@Autowired
	private IPharmacie pharmaciedao;

	public static void main(String[] args) {
		SpringApplication.run(SenForageSpringApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Pharmacie pharmacie = new Pharmacie();
		
		pharmacie.setNom("dial-diop");
		pharmacie.setQuartier("Plateau");
		pharmacie.setVille("Dakar");
		pharmacie.setEtat(1);
		
		pharmaciedao.save(pharmacie);
		pharmaciedao.findAll().forEach(c->System.out.println(c.getVille()));
		
	}

}
