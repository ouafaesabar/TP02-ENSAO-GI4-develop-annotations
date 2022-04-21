package com.ensa.gi4.service.impl;

import java.util.List;
import java.util.Scanner;

import com.ensa.gi4.datatabase.DaoFactory;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionChaiseService;
import com.ensa.gi4.service.api.GestionLivreService;
import com.ensa.gi4.service.api.GestionMaterielService;

public class GestionMaterielServiceImpl implements GestionMaterielService {
    // bd goes here
	
	private DaoFactory daoFactory;
    private GestionLivreService gestionLivreService ;
    private GestionChaiseService gestionChaiseService ;
    
    
    
	
	public GestionMaterielServiceImpl (DaoFactory dao) {
		this.daoFactory = dao;
	}
    @Override
    public void init() {
        System.out.println("inititialisation du service");
    }

    @Override
    public void listerMateriel() {
    	List<Materiel> liste = daoFactory.getListeMateriel();
    	for (int i=0 ; i<liste.size() ; i++) {
        	
        System.out.println(liste.get(i).getName());
    	}
    }

    @Override
    public void ajouterNouveauMateriel(Materiel materiel) {
    	gestionLivreService = new GestionLivreServiceImp(daoFactory);
        gestionChaiseService = new GestionChaiseServiceImp(daoFactory);

        System.out.println("1- pour ajouter un nouveau livre, entrer 1");
        System.out.println("2- pour ajouter un nouveau chaise, entrer 2");
        Scanner scanner = new Scanner(System.in);
        String mat = scanner.next();

        if ("1".equals(mat)) {
            gestionLivreService.
                    ajouterNouveauMateriel(materiel);
        } else if ("2".equals(mat)) {
            gestionChaiseService.ajouterNouveauMateriel(materiel);
        }
    }
    
    @Override
    public Materiel getMateriel(String nom) {
        return daoFactory.getMateriel(nom);
    }

	@Override
	public void supprimerMateriel() {
		gestionLivreService = new GestionLivreServiceImp(daoFactory);
        gestionChaiseService = new GestionChaiseServiceImp(daoFactory);

        System.out.println("1- pour supprimer un materiel de type livre, entrer 1");
        System.out.println("2- pour suprimer un materiel de type chaise, entrer 2");
        Scanner scanner = new Scanner(System.in);
        String mat = scanner.next();

        if ("1".equals(mat)) {
            gestionLivreService.
            supprimerMateriel();
        } else if ("2".equals(mat)) {
            gestionChaiseService.supprimerMateriel();
        }		
	}

	@Override
	public void modifierMateriel() {
		gestionLivreService = new GestionLivreServiceImp(daoFactory);
        gestionChaiseService = new GestionChaiseServiceImp(daoFactory);

        System.out.println("1- pour modifier un materiel de type livre, entrer 1");
        System.out.println("2- pour modifier un materiel de type chaise, entrer 2");
        Scanner scanner = new Scanner(System.in);
        String mat = scanner.next();

        if ("1".equals(mat)) {
            gestionLivreService.
            modifierMateriel();
        } else if ("2".equals(mat)) {
            gestionChaiseService.modifierMateriel();
        }
		
	}

	@Override
	public void chercherMateriel() {
		gestionLivreService = new GestionLivreServiceImp(daoFactory);
        gestionChaiseService = new GestionChaiseServiceImp(daoFactory);

        System.out.println("1- pour chercher un materiel de type livre, entrer 1");
        System.out.println("2- pour chercher un materiel de type chaise, entrer 2");
        Scanner scanner = new Scanner(System.in);
        String mat = scanner.next();

        if ("1".equals(mat)) {
            gestionLivreService.
            chercherMateriel();
        } else if ("2".equals(mat)) {
            gestionChaiseService.chercherMateriel();
        }		
	}

	@Override
	public void allouerMateriel() {
		// TODO Auto-generated method stub
		gestionLivreService = new GestionLivreServiceImp(daoFactory);
        gestionChaiseService = new GestionChaiseServiceImp(daoFactory);

        System.out.println("1- pour allouer un materiel de type livre, entrer 1");
        System.out.println("2- pour allouer un materiel de type chaise, entrer 2");
        Scanner scanner = new Scanner(System.in);
        String mat = scanner.next();

        if ("1".equals(mat)) {
            gestionLivreService.
            allouerMateriel();
        } else if ("2".equals(mat)) {
            gestionChaiseService.allouerMateriel();
        }
        
		
	}
}
