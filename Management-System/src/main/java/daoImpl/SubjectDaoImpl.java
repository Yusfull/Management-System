package daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.web.model.Subject;

import dao.SubjectDao;


@Repository
public class SubjectDaoImpl implements SubjectDao {

	@Autowired
	private SessionFactory sessionFactory;

	public SubjectDaoImpl() {

	}

	public SubjectDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;

	}

	@Override
	@Transactional
	public void addSubject(Subject Subject) {
		sessionFactory.getCurrentSession().saveOrUpdate(Subject);

	}

	@Override
	@Transactional
	public void updateSubject(Subject Subject) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(Subject);
	}

	@Override
	@Transactional
	public void removeSubject(int id) {
		
		Subject subjectTodelete = new Subject();
		sessionFactory.getCurrentSession().delete(subjectTodelete);

	}

	@Override
	@Transactional
	public List<Subject> getAllSubject() {
		
		String hql = "from Subject";
		@SuppressWarnings("unchecked")
		List<Subject> sublist = sessionFactory.getCurrentSession().createQuery(hql).list();
		return sublist;
	}

	@Override
	@Transactional
	public Subject getSubjectById(int id) {
		
		String hql = "from Subject where id =" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Subject> listSubject = query.list();	
		if (listSubject != null && !listSubject.isEmpty()) {
			return listSubject.get(0);
		}
		return null;
	}

	@Override
	@Transactional
	public Subject grtSubjectByName(Subject name) {
		
		String hql = "from Subject where id =" + name;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Subject> listSubject = query.list();	
		if (listSubject != null && !listSubject.isEmpty()) {
			return listSubject.get(0);
		}
		return null;
	}

}
