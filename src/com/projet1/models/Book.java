package com.projet1.models;

public class Book {

	private String titre;
	private String auteur;
	private int nombrePages;
	
	public Book()
	{
		
	}
	
	public Book(String titre, String auteur, int nombrePages)
	{
		this.titre = titre;
		this.auteur = auteur;
		this.nombrePages = nombrePages;
	}
	
	public void setTitre(String titre)
	{
		this.titre = titre;
	}
	
	public String getTitre()
	{
		return titre;
	}
	
	public void setAuteur(String auteur)
	{
		this.auteur = auteur;
	}
	
	public String getAuteur()
	{
		return auteur;
	}
	
	public void setNombrePages(int nombrePages)
	{
		this.nombrePages = nombrePages;
	}
	
	public int getNombrePages()
	{
		return nombrePages;
	}
	
	@Override
	public String toString()
	{
		return "\t Titre : "+ this.titre +"\t Auteur : "+ this.auteur +"\t Nombre de pages : "+ this.nombrePages;
	}

}
