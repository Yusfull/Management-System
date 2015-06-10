package daoImpl;

import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.web.model.Students;

import dao.StudentDao;

@Repository
public class StudentsDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;
    
	
	public StudentsDaoImpl() {
		
	}

	public StudentsDaoImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}


	@Override
	@Transactional
	public void addStudent(Students student) {
		try{
		sessionFactory.getCurrentSession().saveOrUpdate(student);
		}
		catch(HibernateException hx){
		JOptionPane.showMessageDialog(null, "Error in your query", "inner error", JOptionPane.ERROR_MESSAGE);
		}
	}
	

	@Override
	@Transactional
	public void updateStudents(Students students) {
      Students studentToUpdate = getStudentsById(students.getStudentId());
      studentToUpdate.setFirstname(students.getFirstname());
      studentToUpdate.setLastname(students.getLastname());
      sessionFactory.getCurrentSession().update(studentToUpdate);
	}

	@Override
	@Transactional
	public void removeStudents(int id) {
		
		Students studentsTodelete = new Students();
		studentsTodelete.setStudentId(id);
		sessionFactory.getCurrentSession().delete(studentsTodelete);

	}

	@Override
	@Transactional
	public List<Students> getAllStudents() {
		
		@SuppressWarnings("unchecked")
		List<Students> listStudents = sessionFactory.getCurrentSession()
				.createCriteria(Students.class)
				.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY).list();

		return listStudents;
	}

	@Override
	@Transactional
	public Students getStudentsById(int id) {
		
		String hql = "from Students where studentId=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Students> listStudents = query.list();
		if (listStudents != null && !listStudents.isEmpty()) {
			return listStudents.get(0);
		}
		
		return null;
	}

	@Override
	@Transactional
	public Students grtStudentsByName(Students name) {
		
		String hql = "from Students where firstname=" + name;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Students> listStudents = query.list();
		
		if (listStudents != null && !listStudents.isEmpty()) {
			return listStudents.get(0);
		}
		
		return null;
	}

}
