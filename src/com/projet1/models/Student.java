package com.projet1.models;

public class Student extends Person {

	private int matricule;
	
	//Constructors 
	public Student(String nom, String prenom, int age, int matricule ) {
		super(nom, prenom, age);
		this.matricule= matricule;
	}
	
	public Student(Person p, int matricule ) {
		super(p.getNom(), p.getPrenom(), p.getAge());
		this.matricule= matricule;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	//Getters & setters
	public int getMatricule() {
		return matricule;
	}
	
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	@Override
	public String toString()
	{
		return super.toString() + "\t Matricule : "+ this.matricule;
	}
}

