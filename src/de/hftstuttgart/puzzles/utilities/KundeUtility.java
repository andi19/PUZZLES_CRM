package de.hftstuttgart.puzzles.utilities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import de.hftstuttgart.puzzles.model.Kunde;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public enum KundeUtility {
	INSTANCE;
	private static EntityManager em = DatenbankConnectionUtility.getEntityManager();
	
	@SuppressWarnings("unchecked")
	public static ObservableList<Kunde> loadAllKunden() {
		ObservableList<Kunde> kundeList = FXCollections.observableArrayList();
		Query q = em.createQuery("select t from KUNDE_TABLE t");
		List<Kunde> kList = q.getResultList();
		for (Kunde kunde : kList) {
			kundeList.add(kunde);
		}
		return kundeList;
	}
	
	public static void addKunde(Kunde kunde){
		em.getTransaction().begin();
		em.persist(kunde);
		em.getTransaction().commit();		
	}

	public static void editKunde(Kunde kunde){
		em.getTransaction().begin();
		em.merge(kunde);
		em.getTransaction().commit();		
	}
	
	public static void deleteKunde(Kunde kunde){
		em.getTransaction().begin();
		em.remove(em.merge(kunde));
		em.getTransaction().commit();
	}

}
