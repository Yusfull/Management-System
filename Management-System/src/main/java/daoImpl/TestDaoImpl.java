package daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.web.model.Test;

import dao.TestDao;

@Repository
public class TestDaoImpl implements TestDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public TestDaoImpl() {
		
	}
	
	public TestDaoImpl(SessionFactory sessionFactory) {
	
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void addTest(Test test) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(test);
	}

	@Override
	public void updateTest(Test test) {
		sessionFactory.getCurrentSession().saveOrUpdate(test);
	}

	@Override
	public void removeTest(int id) {
		
		Test testTodelete = new Test();
		sessionFactory.getCurrentSession().delete(testTodelete);
	}

	@Override
	public List<Test> getAllTest() {
		
		String hql = "from test";
		@SuppressWarnings({ "unchecked" })
		List<Test> listTest = sessionFactory.getCurrentSession().createQuery(hql).list();
		return listTest;
	}

	@Override
	public Test getTestById(int id) {
		
		
		String hql = "from Test where id="+ id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Test> list = query.list();
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}
		
		return null;
	}
	

	@Override
	public Test getTestByName(Test name) {
				
		String hql = "from Test where ="+ name;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Test> list = query.list();
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}
		
		return null;
	}

}
