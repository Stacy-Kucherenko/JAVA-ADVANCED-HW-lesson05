package service.impl;

import java.util.List;

import dao.DAOException;
import dao.UserDAO;
import dao.impl.UserDAOImpl;
import domain.User;
import service.UserService;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO = new UserDAOImpl();

	@Override
	public User insert(User t) throws DAOException {
		return userDAO.insert(t);
	}

	public List<User> readAll() throws DAOException {
		return userDAO.readAll();
	}

	@Override
	public User readByID(int id) throws DAOException {
		return userDAO.readByID(id);
	}

	@Override
	public User readByEmail(String email) throws DAOException {
		return userDAO.readByEmail(email);
	}

	@Override
	public boolean updateByID(User t) throws DAOException {
		return userDAO.updateByID(t);
	}

	@Override
	public boolean updateByEmail(User t) throws DAOException {
		return userDAO.updateByEmail(t);
	}

	@Override
	public boolean delete(int id) throws DAOException {
		return userDAO.delete(id);
	}

}
