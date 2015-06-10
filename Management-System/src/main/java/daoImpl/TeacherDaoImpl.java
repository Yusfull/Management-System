package daoImpl;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.web.model.Teacher;

import dao.TeacherDao;

@Repository
public class TeacherDaoImpl implements TeacherDao {

	@Autowired
	private SessionFactory sessionFactory;

	public TeacherDaoImpl() {

	}

	public TeacherDaoImpl(SessionFactory sessionFactory) {
   this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public void addTeacher(Teacher teacher) {
		sessionFactory.getCurrentSession().saveOrUpdate(teacher);
		
	}

	@Override
	@Transactional
	public void updateTeacher(Teacher teacher) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(teacher);

	}

	@Override
	@Transactional
	public void removeTeacher(int id) {
		
		Teacher teachertodelete = new Teacher();
		sessionFactory.getCurrentSession().delete(teachertodelete);

	}

	@Override
	@Transactional
	public List<Teacher> getAllTeachers() {
		
		@SuppressWarnings("unchecked")
		List<Teacher> listTeacher = sessionFactory.getCurrentSession().createQuery("from teacher").list();
		return listTeacher;
	}

	@Override
	@Transactional
	public Teacher getTeacherByName(String name) {
		
		String hql = "from teacher where name=" + name ;
		@SuppressWarnings("unchecked")
		List<Teacher> listTeacher = sessionFactory.getCurrentSession().createQuery(hql).list();
		return (Teacher) listTeacher;
	}

	@Override
	@Transactional
	public Teacher getTeacherById(int id) {
		
		return null;
	}

}
