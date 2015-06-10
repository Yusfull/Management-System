package com.java.web.securityDaoImpl;

import java.util.List;

import com.java.web.model.Students;
import com.java.web.securityDAO.SecurityDao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SecurityDaoImpl implements SecurityDao{

	@Autowired
	SessionFactory sessionFactory;

	public SecurityDaoImpl() {

	}

	public SecurityDaoImpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Boolean isValidUser(String username, String surname) {
		final List<Students> data;
		String sql = "from students where username := first_name and surname := last_name";
		data = (List<Students>) sessionFactory.getCurrentSession().createQuery(
				sql);
		for (Students list : data) {
			if (list.getFirstname().equalsIgnoreCase(username)
					&& list.getLastname().equalsIgnoreCase(surname))
				;
			return true;
		}
		return false;

	}

}
