package com.projet1.models;

public class Person {

	private String nom;
	private String prenom;
	private int age;
	
	public Person()
	{
		
	}
	public Person(String nom, String prenom, int age) 
	{
		this.nom =nom;
		this.prenom =prenom;
		this.age=age;
	}
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	public String getNom()
	{
		return nom;
	}
	
	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}
	
	public String getPrenom()
	{
		return prenom;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	@Override
	public String toString() 
	{
		return "Nom :"+this.nom + "\t Prenom :"+ this.prenom + "\t Age :"+ this.age +"\t";
	}
	
}


