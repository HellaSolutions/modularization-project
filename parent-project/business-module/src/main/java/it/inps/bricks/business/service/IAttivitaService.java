package it.inps.bricks.business.service;

import java.util.List;

import it.inps.bricks.model.Attivita;
import it.inps.bricks.model.Task;

public interface IAttivitaService {
	
	List<Attivita> getAll();
	void save(Attivita attivita);
	boolean addTask(Attivita attivita, Task task);

}
