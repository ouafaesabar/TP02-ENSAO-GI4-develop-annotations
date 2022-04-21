package com.ensa.gi4.service.impl;

import java.util.List;
import java.util.Scanner;

import com.ensa.gi4.datatabase.DaoFactory;
import com.ensa.gi4.datatabase.DaoFactoryImp;
import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionLivreService;

public class GestionLivreServiceImp implements GestionLivreService {
	
	private DaoFactory daoFactory;
	
    public GestionLivreServiceImp (DaoFactory daoFactory){
    	this.daoFactory = daoFactory;
    }

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listerMateriel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterNouveauMateriel(Materiel materiel) {
		// TODO Auto-generated method stub
		// le livre à ajouter
				materiel = new Livre();
				System.out.println("Veuillez saisir le nom du livre");
				Scanner scanner = new Scanner(System.in);
		        String livre = scanner.next();
		        materiel.setName(livre);
		        
		        //initialiser la liste
		        List<Materiel> liste = this.daoFactory.getListeMateriel();
		        
		        //ajouter l'element à la liste
		       liste.add(materiel);
	}

	@Override
	public void supprimerMateriel() {
		// le livre à supprimer
		System.out.println("Veuillez saisir le nom du livre");
		Scanner scanner = new Scanner(System.in);
        String livre = scanner.next();
        
        
      //initialiser la liste
        List<Materiel> liste = this.daoFactory.getListeMateriel();
         
      //parcourir la liste et supprimer l'element de l'element
        for (int i=0 ; i<liste.size() ; i++) {
        	if(liste instanceof Livre){
        	   if(liste.get(i).getName().equals(livre))
			   {
				liste.remove(liste.get(i));
			   }
        	}
        }
        
        
	}

	@Override
	public void modifierMateriel() {
		// le livre à modifier
				System.out.println("Veuillez saisir le nom du livre");
				Scanner scanner = new Scanner(System.in);
		        String livre = scanner.next();
		        
		        
		      //initialiser la liste
		        List<Materiel> liste = this.daoFactory.getListeMateriel();
		         
		      //parcourir la liste et modifier l'element 
		        for (int i=0 ; i<liste.size() ; i++) {
		        	if(liste instanceof Livre){
		        	    if(liste.get(i).getName().equals(livre))
					     {
		        		 liste.get(i).setName(livre);					}
		                 }
		        	
		        }
	}

	@Override
	public void chercherMateriel() {
		// le livre à modifier
		System.out.println("Veuillez saisir le nom du livre");
		Scanner scanner = new Scanner(System.in);
        String livre = scanner.next();
        
        
      //initialiser la liste
        List<Materiel> liste = this.daoFactory.getListeMateriel();
        boolean a = false;
         
      //parcourir la liste et chercher l'element 
        for (int i=0 ; i<liste.size() ; i++) {
        	if(liste instanceof Livre){
        	   if(liste.get(i).getName().equals(livre))
			    {
                    a = true;        
                }	
        }
        if (a=true) {
        	System.out.println("l'element existe");
        }
        else {
        	System.out.println("l'element n'existe");
        }
        }
	}
		
	

	@Override
	public void allouerMateriel() {
		List<Materiel> liste = daoFactory.getListeMateriel();
        Materiel materielAlloue;
        String mat;

        System.out.println("Nom de livre a allouer : ");
        Scanner scanner = new Scanner(System.in);
        mat = scanner.next();

        for(int i = 0;i<liste.size();i++){
			if(liste instanceof Livre){
				if(liste.get(i).getName().equals(mat))
				{
					System.out.println("Combien de temps tu veux allouer ce livre : ");
					mat = scanner.next();
					materielAlloue = liste.get(i);

					int nextInt = Integer.parseInt(mat);
					Materiel materielAllouerFinal = materielAlloue;
					System.out.println("ce livre : "+liste.get(i).getName()+" est alloue");		
	}
	}
        }
	}

	public Materiel getMateriel(String nom) {
        return daoFactory.getMateriel(nom);
    }
}


