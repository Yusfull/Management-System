package daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.web.model.TechSubject;

import dao.TeachSubjectDao;

@Repository
public class TeachSubjectDaoImpl implements TeachSubjectDao {

	@Autowired
	private SessionFactory sessionFactory;

	public TeachSubjectDaoImpl() {

	}

	public TeachSubjectDaoImpl(SessionFactory sessionFactory) {
      this.sessionFactory = sessionFactory;
	}

	@Override
	public void addTeachSubject(TechSubject techSubject) {
		
      sessionFactory.getCurrentSession().saveOrUpdate(techSubject);
	}

	@Override
	public void updateTeachSubject(TechSubject techSubject) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(techSubject);
	}

	@Override
	public void removeSubject(int id) {
		
		TechSubject toDelete = new TechSubject();
		sessionFactory.getCurrentSession().delete(toDelete);
	}

	@Override
	public List<TechSubject> getAllTeachSubject() {
		
		String hql = "from Techsubject";
		@SuppressWarnings("unchecked")
		List<TechSubject> list = sessionFactory.getCurrentSession().createQuery(hql).list();
		return list;
	}

	@Override
	public TechSubject getTeachSubjectById(int id) {
		
		String hql = "from TechSubject where id=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<TechSubject> list = query.list();
		if(list !=null && !list.isEmpty()){
			return list.get(0);
		}
		return null;
	}

	@Override
	public TechSubject grtTeachSubjectByName(TechSubject name) {
		
		String hql = "from TechSubject where name=" + name;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<TechSubject> list = query.list();
		if(list !=null && !list.isEmpty()){
			return list.get(0);
		}
		return null;
	
	}

}
