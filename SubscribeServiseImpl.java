package service.impl;

import java.util.List;

import dao.DAOException;
import dao.SubscribeDAO;
import dao.impl.SubscribeDAOImpl;
import domain.Subscribe;
import service.SubscribeService;

public class SubscribeServiseImpl implements SubscribeService {

	private SubscribeDAO subscribeDAO = new SubscribeDAOImpl();

	@Override
	public Subscribe insert(Subscribe t) throws DAOException {
		return subscribeDAO.insert(t);
	}

	@Override
	public List<Subscribe> readAll() throws DAOException {
		return subscribeDAO.readAll();
	}

	@Override
	public Subscribe readByID(int id) throws DAOException {
		return subscribeDAO.readByID(id);
	}

	@Override
	public boolean updateByID(Subscribe t) throws DAOException {
		return subscribeDAO.updateByID(t);
	}

	@Override
	public boolean delete(int id) throws DAOException {
		return subscribeDAO.delete(id);
	}

}
