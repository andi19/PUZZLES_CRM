package de.hftstuttgart.puzzles.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "STATUS_TABLE")
public enum Status {
	abholbereit, inArbeit, ausgeliefert, auftragerstellt;
}
