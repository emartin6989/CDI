package dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import dao.NotificationTypeDao.TypeDao;

@NotificationTypeDao(TypeDao.JPA)
public class DaoJPA implements IDao {

	@Override
	public String appelDao() {
		return "Bonjour, je suis bien dans la Dao JPA";
	}

	@PostConstruct
	public void logApresConstruction() {
		System.out.println("Après création Dao JPA");
	}

	@PreDestroy
	public void logAvantDestruction() {
		System.out.println("Avant destruction Dao JPA");
	}

}
