package com.fst.srt.entities;

public class Classes2 {
	private int id;
	private String departement;
	private String faculte ;
	private String type_de_formation ;	
	private String niveau ;


	public Classes2(int id,String departement, String faculte, String type_de_formation, String niveau) {
		super();
		this.id = id;
		this.departement = departement;
		this.faculte = faculte;
		this.type_de_formation = type_de_formation;
		this.niveau = niveau;
	}
	
 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getFaculte() {
		return faculte;
	}
	public void setFaculte(String faculte) {
		this.faculte = faculte;
	}
	public String getType_de_formation() {
		return type_de_formation;
	}
	public void setType_de_formation(String type_de_formation) {
		this.type_de_formation = type_de_formation;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}


	public Classes2() {
		super();
	}
	
 
	
	
}
