package service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import dao.IDao;
import dao.NotificationTypeDao;
import dao.NotificationTypeDao.TypeDao;

public class ServiceImpl implements IService {
	@Inject
	@NotificationTypeDao(TypeDao.JPA)
	private IDao dao;

	@Override
	public String appelDao() {
		return dao.appelDao();
	}

	@PostConstruct
	public void logApresConstruction() {
		System.out.println("Après création Service");
	}

	@PreDestroy
	public void logAvantDestruction() {
		System.out.println("Avant destruction Service");
	}

}
