package com.ensa.gi4.controller;

import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionMaterielService;

import java.util.Scanner;

public class GestionMaterielController {

    private GestionMaterielService gestionMaterielService;
    private Materiel materiel;


    public void afficherMenu() {
        System.out.println("1- pour lister le materiel, entrer 1");
        System.out.println("2- pour ajouter un nouveau materiel, entrer 2");
        System.out.println("3- pour supprimer un nouveau materiel, entrer 3");
        System.out.println("4- pour chercher un nouveau materiel, entrer 4");
        System.out.println("5- pour modifier un nouveau materiel, entrer 5");
        System.out.println("6- pour allouer un nouveau materiel, entrer 6");
        System.out.println("0- pour sortir de l'application, entrer 0");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        if ("0".equals(next)) {
            sortirDeLApplication();
        } else if ("1".equals(next)) {
        	gestionMaterielService.listerMateriel();
        	} else if ("2".equals(next)) {
            // ajouter nouveau matériel
        		
        		gestionMaterielService.ajouterNouveauMateriel(materiel);
        } else if ("3".equals(next)) {
            // supprimer nouveau matériel
        		
        		gestionMaterielService.supprimerMateriel();
        } else if ("4".equals(next)) {
            // modifier nouveau matériel
        		
        		gestionMaterielService.chercherMateriel();
        } else if ("5".equals(next)) {
            // modifier nouveau matériel
        		
        		gestionMaterielService.modifierMateriel();
        } else if ("6".equals(next)) {
            // allouer nouveau matériel
        		
        		gestionMaterielService.allouerMateriel();
        } 
        	else {
            System.out.println("choix invalide");
        }
    }

    private void sortirDeLApplication() {
        System.exit(0);
    }

    public void setGestionMaterielService(GestionMaterielService gestionMaterielService) {
        // injection par accesseur
        this.gestionMaterielService = gestionMaterielService;
    }
}
