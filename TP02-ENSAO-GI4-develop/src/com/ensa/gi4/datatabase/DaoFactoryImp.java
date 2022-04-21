package com.ensa.gi4.datatabase;

import java.util.ArrayList;
import java.util.List;

import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.impl.GestionMaterielServiceImpl;

public class DaoFactoryImp implements DaoFactory {
	
	private List<Materiel> listeMateriel;
	
	public DaoFactoryImp ()
	{
		listeMateriel = new ArrayList<>();

	}
	@Override
	public List<Materiel> getListeMateriel() {
		return this.listeMateriel;
	}

	@Override
	public void setListeMateriel(List<Materiel> liste) {
                   this.listeMateriel = liste;
	}

	@Override
	public GestionMaterielServiceImpl getMateriel() {
		return new GestionMaterielServiceImpl(this);
	}

}
