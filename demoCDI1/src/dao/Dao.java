package dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dao implements IDao {

	@Override
	public String appelDao() {
		return "Bonjour, je suis bien dans la Dao";
	}

	@PostConstruct
	public void logApresConstruction() {
		System.out.println("Apr�s cr�ation Dao");
	}

	@PreDestroy
	public void logAvantDestruction() {
		System.out.println("Avant destruction Dao");
	}
}
