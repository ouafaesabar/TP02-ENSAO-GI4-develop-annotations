package com.ensa.gi4.datatabase;

import java.util.List;

import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.impl.GestionMaterielServiceImpl;

public interface DaoFactory {
     public List<Materiel> getListeMateriel();
     public void setListeMateriel (List<Materiel> liste);
     public Materiel getMateriel (String nom);
     
}
