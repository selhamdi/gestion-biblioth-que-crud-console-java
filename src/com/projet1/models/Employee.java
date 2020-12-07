package com.projet1.models;

public class Employee extends Person {
	
	private double salaire;
	
	public Employee()
	{
		
	}
	
	public Employee(String nom, String prenom, int age, double salaire ) {
		super(nom, prenom, age);
		this.salaire = salaire;
	}
	
	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString()
	{
		return super.toString() + "\t Salaire : "+ this.salaire;
	}
}