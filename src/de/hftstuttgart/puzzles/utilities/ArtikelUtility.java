package de.hftstuttgart.puzzles.utilities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import de.hftstuttgart.puzzles.model.Artikel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public enum ArtikelUtility {
	INSTANCE;
	private static EntityManager em = DatenbankConnectionUtility.getEntityManager();
	
	@SuppressWarnings("unchecked")
	public static ObservableList<Artikel> loadAllArtikel() {
		ObservableList<Artikel> artikelList = FXCollections.observableArrayList();
		Query q = em.createQuery("select t from ARTIKEL_TABLE t");
		List<Artikel> artList = q.getResultList();
		for (Artikel artikel : artList) {
			artikelList.add(artikel);
		}
		return artikelList;
	}
	
	public static void addArtikel(Artikel artikel){
		em.getTransaction().begin();
		em.persist(artikel);
		em.getTransaction().commit();		
	}

	public static void editArtikel(Artikel artikel){
		em.getTransaction().begin();
		em.merge(artikel);
		em.getTransaction().commit();		
	}
	
	public static void deleteArtikel(Artikel artikel){
		em.getTransaction().begin();
		em.remove(em.merge(artikel));
		em.getTransaction().commit();
	}
}
