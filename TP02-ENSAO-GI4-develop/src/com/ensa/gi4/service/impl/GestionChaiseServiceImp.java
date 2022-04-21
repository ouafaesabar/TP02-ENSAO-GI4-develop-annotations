package com.ensa.gi4.service.impl;

import java.util.List;
import java.util.Scanner;

import com.ensa.gi4.datatabase.DaoFactory;
import com.ensa.gi4.datatabase.DaoFactoryImp;
import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionChaiseService;

public class GestionChaiseServiceImp implements GestionChaiseService {
	
	private DaoFactory daoFactory;
	
    public GestionChaiseServiceImp (DaoFactory daoFactory){
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
		
		
		// la chaise à ajouter
		materiel = new Chaise();
		System.out.println("Veuillez saisir le nom de la chaise");
		Scanner scanner = new Scanner(System.in);
        String chaise = scanner.next();
        materiel.setName(chaise);
        
        //initialiser la liste
        List<Materiel> liste = this.daoFactory.getListeMateriel();
        
        //ajouter l'element à la liste
       liste.add(materiel);
	}

	@Override
	public void supprimerMateriel() {
		// la chaise à supprimer
				System.out.println("Veuillez saisir le nom de la chaise");
				Scanner scanner = new Scanner(System.in);
		        String chaise = scanner.next();
		        
		        
		      //initialiser la liste
		        List<Materiel> liste = this.daoFactory.getListeMateriel();
		         
		      //parcourir la liste et supprimer l'element de l'element
		        for (int i=0 ; i<liste.size() ; i++) {
		            if (liste instanceof Chaise) {
		        	  if(liste.get(i).getName().equals(chaise))
					  {
						liste.remove(liste.get(i));
					  }
		        	}
		        }		
	}

	@Override
	public void modifierMateriel() {
		// la chaise à modifier
		System.out.println("Veuillez saisir le nom de la chaise");
		Scanner scanner = new Scanner(System.in);
        String chaise = scanner.next();
        
        
      //initialiser la liste
        List<Materiel> liste = this.daoFactory.getListeMateriel();
         
      //parcourir la liste et modifier l'element 
        for (int i=0 ; i<liste.size() ; i++) {
        	if (liste instanceof Chaise) {
        	   if(liste.get(i).getName().equals(chaise))
			     {
        		 liste.get(i).setName(chaise);					}
                 }	
        }
	}

	@Override
	public void chercherMateriel() {
		// la chaise à modifier
		System.out.println("Veuillez saisir le nom du livre");
		Scanner scanner = new Scanner(System.in);
        String chaise = scanner.next();
        
        
      //initialiser la liste
        List<Materiel> liste = this.daoFactory.getListeMateriel();
        boolean a = false;
         
      //parcourir la liste et chercher l'element 
        for (int i=0 ; i<liste.size() ; i++) {
           if (liste instanceof Chaise) {
        	  if(liste.get(i).getName().equals(chaise))
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
		// TODO Auto-generated method stub
		
	}
	@Override
	public Materiel getMateriel(String nom) {
        return daoFactory.getMateriel(nom);
    }

}
