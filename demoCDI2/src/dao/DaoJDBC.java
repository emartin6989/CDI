package dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import dao.NotificationTypeDao.TypeDao;

@NotificationTypeDao(TypeDao.JDBC)
public class DaoJDBC implements IDao {

	@Override
	public String appelDao() {
		return "Bonjour, je suis bien dans la Dao JDBC";
	}

	@PostConstruct
	public void logApresConstruction() {
		System.out.println("Après création Dao JDBC");
	}

	@PreDestroy
	public void logAvantDestruction() {
		System.out.println("Avant destruction Dao JDBC");
	}
}
