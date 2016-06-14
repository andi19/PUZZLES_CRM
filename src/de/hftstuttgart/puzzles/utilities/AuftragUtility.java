package de.hftstuttgart.puzzles.utilities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import de.hftstuttgart.puzzles.model.Auftrag;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public enum AuftragUtility {
	INSTANCE;
	private static EntityManager em = DatenbankConnectionUtility.getEntityManager();

	@SuppressWarnings("unchecked")
	public static ObservableList<Auftrag> loadAllAuftraege() {
		ObservableList<Auftrag> auftragList = FXCollections.observableArrayList();
		Query q = em.createQuery("select t from AUFTRAG_TABLE t");
		List<Auftrag> aufList = q.getResultList();
		for (Auftrag auftrag : aufList) {
			auftragList.add(auftrag);
		}
		return auftragList;
	}

	public static void addArtikel(Auftrag auftrag) {
		em.getTransaction().begin();
		em.persist(auftrag);
		em.getTransaction().commit();
	}

	public static void editArtikel(Auftrag auftrag) {
		em.getTransaction().begin();
		em.merge(auftrag);
		em.getTransaction().commit();
	}

	public static void deleteArtikel(Auftrag auftrag) {
		em.getTransaction().begin();
		em.remove(em.merge(auftrag));
		em.getTransaction().commit();
	}
}
