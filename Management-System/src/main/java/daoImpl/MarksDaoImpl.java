package daoImpl;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.web.model.Marks;

import dao.MarksDao;

@Repository
public class MarksDaoImpl implements MarksDao {

	@Autowired
	private SessionFactory sessionFactory;

	public MarksDaoImpl() {

	}

	public MarksDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addMarks(Marks marks) {
		
        sessionFactory.getCurrentSession().saveOrUpdate(marks);
	}

	@Override
	public void updateMarks(Marks marks) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(marks);

	}

	@Override
	public void removeMarks(int id) {
	
		Marks marksTodelete = new Marks();
		marksTodelete.setMarkId(id);
        sessionFactory.getCurrentSession().delete(marksTodelete);
	}

	@Override
	public List<Marks> getAllMarks() {
	
		String hql = "from Marks";
		@SuppressWarnings("unchecked")
		List<Marks> listUser = sessionFactory.getCurrentSession().createQuery(hql).list();
		return listUser;
	}

}
