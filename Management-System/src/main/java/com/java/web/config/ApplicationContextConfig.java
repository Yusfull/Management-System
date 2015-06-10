package com.java.web.config;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.java.web.model.Groups;
import com.java.web.model.Marks;
import com.java.web.model.Students;
import com.java.web.model.Subject;
import com.java.web.model.Teacher;
import com.java.web.model.TechSubject;
import com.java.web.model.Test;
import com.java.web.model.User;
import com.java.web.service.GroupService;
import com.java.web.service.MarksService;
import com.java.web.service.StudentService;
import com.java.web.service.SubjectService;
import com.java.web.service.TeachSubjectService;
import com.java.web.service.TeacherService;
import com.java.web.service.TestService;
import com.java.web.service.UserService;
import com.java.web.serviceImpl.GroupServiceImpl;
import com.java.web.serviceImpl.MarksServiceImpl;
import com.java.web.serviceImpl.StudentsServiceImpl;
import com.java.web.serviceImpl.SubjectServiceImpl;
import com.java.web.serviceImpl.TeachSubjectServiceImpl;
import com.java.web.serviceImpl.TeacherServiceImpl;
import com.java.web.serviceImpl.TestServiceImpl;
import com.java.web.serviceImpl.UserServiceImpl;

import dao.GroupDao;
import dao.MarksDao;
import dao.StudentDao;
import dao.SubjectDao;
import dao.TeachSubjectDao;
import dao.TeacherDao;
import dao.TestDao;
import dao.UserDAO;
import daoImpl.GroupDaoImpl;
import daoImpl.MarksDaoImpl;
import daoImpl.StudentsDaoImpl;
import daoImpl.SubjectDaoImpl;
import daoImpl.TeachSubjectDaoImpl;
import daoImpl.TeacherDaoImpl;
import daoImpl.TestDaoImpl;
import daoImpl.UserDAOImpl;

@Configuration
@ComponentScan(basePackages = "com.java.web")
@EnableTransactionManagement
public class ApplicationContextConfig {
	@Bean(name = "viewResolver")
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Bean
	public java.sql.Connection getConection() throws SQLException,
			InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		return DriverManager
				.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "yusuf",
						"Pa$$w0rd54321");
	}

	@Bean(name = "dataSource")
	public DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		// dataSource.setDriverClassName("OracleThin");
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		dataSource.setUsername("yusuf");
		dataSource.setPassword("Pa$$w0rd54321");
		dataSource.getDriverClassName();
		try {
			dataSource.getConnection();
			System.out.println("Connected !");
		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println("Cannot find connection !");
		}
		// dataSource.getConnection("yusuf", "Pa$$w0rd54321");
		return dataSource;
	}

	private Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect",
				"org.hibernate.dialect.Oracle10gDialect");
		properties.put("hibernate.default_schema", "Yusuf");
		return properties;
	}

	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(
				dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.scanPackages("com.java.web.model");
		sessionBuilder.addAnnotatedClasses(User.class, Students.class,
				Marks.class, Subject.class, Teacher.class, TechSubject.class,
				Test.class, Groups.class);
		return sessionBuilder.buildSessionFactory();
	}

	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(
			SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(
				sessionFactory);

		return transactionManager;
	}

	/*
	 * We register all data access objects(DAO)
	 */

	@Autowired
	@Bean(name = "groupDao")
	public GroupDao getGroupDao(SessionFactory sessionFactory) {
		return new GroupDaoImpl(sessionFactory);
	}

	@Autowired
	@Bean(name = "marksDao")
	public MarksDao getMarksDao(SessionFactory sessionFactory) {
		return new MarksDaoImpl(sessionFactory);
	}

	@Autowired
	@Bean(name = "studentDao")
	public StudentDao getStudentDao(SessionFactory sessionFactory) {
		return new StudentsDaoImpl(sessionFactory);
	}

	@Autowired
	@Bean(name = "subjectDao")
	public SubjectDao getSubjectDao(SessionFactory sessionFactory) {
		return new SubjectDaoImpl(sessionFactory);
	}

	@Autowired
	@Bean(name = "teacherDao")
	public TeacherDao getTeacherDao(SessionFactory sessionFactory) {
		return new TeacherDaoImpl(sessionFactory);
	}

	@Autowired
	@Bean(name = "teacherSubjectDao")
	public TeachSubjectDao getTeacherSubjectDao(SessionFactory sessionFactory) {
		return new TeachSubjectDaoImpl(sessionFactory);
	}

	@Autowired
	@Bean(name = "testDao")
	public TestDao getTestDao(SessionFactory sessionFactory) {
		return new TestDaoImpl(sessionFactory);
	}

	@Autowired
	@Bean(name = "userDao")
	public UserDAO getUserDao(SessionFactory sessionFactory) {
		return new UserDAOImpl(sessionFactory);
	}

	/*
	 * Here we register the service beans
	 */
	@Autowired
	@Bean(name = "groupService")
	public GroupService getGroupService() {
		return new GroupServiceImpl();
	}

	@Autowired
	@Bean(name = "markService")
	public MarksService getMarkService() {
		return new MarksServiceImpl();
	}

	@Autowired
	@Bean(name = "studentService")
	public StudentService getStudentService() {
		return new StudentsServiceImpl();
	}

	@Autowired
	@Bean(name = "subjectService")
	public SubjectService getSubjectkService() {
		return new SubjectServiceImpl();
	}

	@Autowired
	@Bean(name = "teacherService")
	public TeacherService getTeacherService() {
		return new TeacherServiceImpl();
	}

	@Autowired
	@Bean(name = "teachSubjectService")
	public TeachSubjectService getTeachSubjectService() {
		return new TeachSubjectServiceImpl();
	}

	@Autowired
	@Bean(name = "testService")
	public TestService getTestService() {
		return new TestServiceImpl();
	}

	@Autowired
	@Bean(name = "userService")
	public UserService getUserService() {
		return new UserServiceImpl();
	}
}
