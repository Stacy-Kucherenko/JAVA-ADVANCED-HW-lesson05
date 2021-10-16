package service.impl;



import java.util.List;

import dao.DAOException;
import dao.MagazineDAO;
import dao.impl.MagazineDAOImpl;
import domain.Magazine;
import service.MagazineService;

public class MagazineServiceImpl implements MagazineService {

	private MagazineDAO magazineDAO = new MagazineDAOImpl();

	@Override
	public Magazine insert(Magazine t) throws DAOException {
		return magazineDAO.insert(t);
	}

	@Override
	public List<Magazine> readAll() throws DAOException {
		return magazineDAO.readAll();
	}

	@Override
	public Magazine readByID(int id) throws DAOException {
		return magazineDAO.readByID(id);
	}

	@Override
	public boolean updateByID(Magazine t) throws DAOException {
		return magazineDAO.updateByID(t);
	}

	@Override
	public boolean delete(int id) throws DAOException {
		return magazineDAO.delete(id);
	}

}
