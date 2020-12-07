package com.projet1.models;

import java.util.Scanner;
import java.util.ArrayList;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person personne1 = new Person("elhamdi","salima",23);
		Person personne2 = new Person("El bettal","Meryame",21);
		
		Student etudiant1 = new Student(personne1,10600300);
		Student etudiant2 = new Student(personne2,98900300);
		
		Book book1 = new Book("Boite à merveilles", "Ahmed Sefrioui", 230);
		Book book2 = new Book("Le petit chaperon rouge", "Charles Perrault", 20);
		Book book3 = new Book("Antigone", "Jean Anouilh", 190);
		
		Employee employee1 = new Employee("blabla", "salima", 20, 45000);
		Employee employee2 = new Employee("blabla", "Safae", 20, 18998);

		ArrayList<Student> listStudents = new ArrayList<Student>();
		ArrayList<Employee> listEmployees = new ArrayList<Employee>();
		ArrayList<Book> listBooks = new ArrayList<Book>();
		
		
		listStudents.add(etudiant1);
		listStudents.add(etudiant2);
		
		listBooks.add(book1);
		listBooks.add(book2);
		listBooks.add(book3);
		
		listEmployees.add(employee1);
		listEmployees.add(employee2);
		
		while(true) {
		Scanner reader = new Scanner(System.in);
	    System.out.print("Manage students, employees, or books? (s/e/b) : ");
	    char choice = reader.next().charAt(0);
	   
	 
		switch (choice) {
	      case 's':
	    	  System.out.println("Student list :");
	    	  //Affichage des etudiants :
	    	  for(int i=0; i<listStudents.size() ;i++)
	    	  {
	    		  System.out.println("\t The student "+ (i+1) +":");
	    		  System.out.println(listStudents.get(i).toString());
	    	  }
 			  System.out.println("Add, update or delete ? (a/u/d) :");
 			  char choice2 = reader.next().charAt(0);
 			  switch(choice2)
 			  {
	 			  case 'a' : 
	 				 Student student1 = new Student();
		 			 System.out.println("New student : ");
		 			 System.out.println("Entrez le nom : ");
		 			 student1.setNom(reader.next()) ;
		 			 System.out.println("entrez son prenom : ");
		 			 student1.setPrenom(reader.next()) ;
		 			 System.out.println("entrez son age: ");
		 			 student1.setAge(reader.nextInt()) ;
		 			 System.out.println("entrez son matricule: ");
		 			 student1.setMatricule(reader.nextInt()) ;
		 			 listStudents.add(student1);
	 			  	break;
	 			  	
		      	  case 'u' : 
		      		for (int i = 0; i < listStudents.size(); i++) 
					{
						System.out.println(listStudents.get(i).toString()); 
					}
		 			 System.out.println("Update student : ");
		 			 System.out.println("Entrez l'index de l'etudiant : ");
		 			 int id1 = reader.nextInt();
		 			 System.out.println("Entrez le nouveau nom : ");
		 			 listStudents.get(id1).setNom(reader.next()) ;
		 			 System.out.println("entrez le nouveau prenom : ");
		 			 listStudents.get(id1).setPrenom(reader.next()) ;
		 			 System.out.println("entrez le nouvel age: ");
		 			 listStudents.get(id1).setAge(reader.nextInt()) ;
		 			 System.out.println("entrez le nouveau matricule: ");
		 			 listStudents.get(id1).setMatricule(reader.nextInt()) ;
		 			 System.out.println(listStudents.get(id1).toString());
				  	break;
				  	
				  case 'd' : 
						for (int i = 0; i < listStudents.size(); i++) 
						{
							System.out.println(listStudents.get(i).toString()); 
						}
						System.out.println("Entrez l'index de l'etudiant : ");
						int id2 = reader.nextInt();
						listStudents.remove(id2);
						System.out.println("Etudiant supprimé");
				  	break;
				}
		      break;  
	      case 'e':
	    	  System.out.println("Employees list :");
	    	  //Affichage des employees :
	    	  for(int i=0; i<listEmployees.size() ;i++)
	    	  {
	    		  System.out.println("\t The employee "+ (i+1) +":");
	    		  System.out.println(listEmployees.get(i).toString());
	    	  }
 			  System.out.println("Add, update or delete ? (a/u/d) :");
 			  char choice3 = reader.next().charAt(0);
 			  switch(choice3)
 			  {
	 			  case 'a' : 
	 				 Employee employe1 = new Employee();
		 			 System.out.println("New student : ");
		 			 System.out.println("Entrez le nom : ");
		 			 employe1.setNom(reader.next()) ;
		 			 System.out.println("entrez son prenom : ");
		 			 employe1.setPrenom(reader.next()) ;
		 			 System.out.println("entrez son age: ");
		 			 employe1.setAge(reader.nextInt()) ;
		 			 System.out.println("entrez son matricule: ");
		 			 employe1.setSalaire(reader.nextInt()) ;
		 			 listEmployees.add(employe1);
	 			  	break;
	 			  	
		      	  case 'u' : 
		      		for (int i = 0; i < listEmployees.size(); i++) 
					{
						System.out.println(listEmployees.get(i).toString()); 
					}
		 			 System.out.println("Update employee : ");
		 			 System.out.println("Entrez l'index de l'employee : ");
		 			 int id1 = reader.nextInt();
		 			 System.out.println("Entrez le nouveau nom : ");
		 			 listEmployees.get(id1).setNom(reader.next()) ;
		 			 System.out.println("entrez le nouveau prenom : ");
		 			 listEmployees.get(id1).setPrenom(reader.next()) ;
		 			 System.out.println("entrez le nouvel age: ");
		 			 listEmployees.get(id1).setAge(reader.nextInt()) ;
		 			 System.out.println("entrez le nouveau salaire: ");
		 			 listEmployees.get(id1).setSalaire(reader.nextInt()) ;
		 			 System.out.println(listEmployees.get(id1).toString());
				  	break;
				  	
				  case 'd' : 
						for (int i = 0; i < listEmployees.size(); i++) 
						{
							System.out.println(listEmployees.get(i).toString()); 
						}
						System.out.println("Entrez l'index de l'employee : ");
						int id2 = reader.nextInt();
						listEmployees.remove(id2);
						System.out.println("Employee supprimé");
				  	break;
				}
	        break;

	      case 'b':
	    	   System.out.println("Books list :");
		    	  //Affichage des livres :
		    	  for(int i=0; i<listBooks.size() ;i++)
		    	  {
		    		  System.out.println("\t The book "+ (i+1) +":");
		    		  System.out.println(listBooks.get(i).toString());
		    	  }
	 			  System.out.println("Add, update or delete ? (a/u/d) :");
	 			  char choice4 = reader.next().charAt(0);
	 			  switch(choice4)
	 			  {
		 			  case 'a' : 
		 				 Book book4 = new Book();
			 			 System.out.println("New book : ");
			 			 System.out.println("Entrez le titre : ");
			 			 book4.setTitre(reader.next()) ;
			 			 System.out.println("entrez l'auteur : ");
			 			 book4.setAuteur(reader.next()) ;
			 			 System.out.println("entrez le nombre de pages : ");
			 			 book4.setNombrePages(reader.nextInt()) ;;
			 			 listBooks.add(book4);
		 			  	break;
		 			  	
			      	  case 'u' : 
			      		for (int i = 0; i < listBooks.size(); i++) 
						{
							System.out.println(listBooks.get(i).toString()); 
						}
			 			 System.out.println("Update book : ");
			 			 System.out.println("Entrez l'index du livre : ");
			 			 int id1 = reader.nextInt();
			 			 System.out.println("Entrez le nouveau titre : ");
			 			 listBooks.get(id1).setTitre(reader.next()) ;
			 			 System.out.println("entrez le nouvel auteur : ");
			 			 listBooks.get(id1).setAuteur(reader.next()) ;
			 			 System.out.println("entrez le nombre de pages : ");
			 			 listBooks.get(id1).setNombrePages(reader.nextInt()) ;
			 			 System.out.println(listBooks.get(id1).toString());
					  	break;
					  	
					  case 'd' : 
							for (int i = 0; i < listBooks.size(); i++) 
							{
								System.out.println(listBooks.get(i).toString()); 
							}
							System.out.println("Entrez l'index du livre : ");
							int id2 = reader.nextInt();
							listBooks.remove(id2);
							System.out.println("Livre supprimé");
					  	break;
					}
	        break;

	        
	      default:
	        System.out.printf("Error! section is not correct");
	        return;
	        
	    	}

		}
		
	}
	
}