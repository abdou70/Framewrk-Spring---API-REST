package sn.senForageSpringApi.entities;

import javax.persistence.Column;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pharmacie")
public class Pharmacie {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String nom;
	@Column
	private String quartier;
	@Column
	private String ville;
	@Column
	private int etat;
	
	
	
	public Pharmacie() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Pharmacie(int id, String nom, String quartier, String ville, int etat) {
		super();
		this.id = id;
		this.nom = nom;
		this.quartier = quartier;
		this.ville = ville;
		this.etat = etat;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getQuartier() {
		return quartier;
	}



	public void setQuartier(String quartier) {
		this.quartier = quartier;
	}



	public String getVille() {
		return ville;
	}



	public void setVille(String ville) {
		this.ville = ville;
	}



	public int getEtat() {
		return etat;
	}



	public void setEtat(int etat) {
		this.etat = etat;
	}
	
	

}
