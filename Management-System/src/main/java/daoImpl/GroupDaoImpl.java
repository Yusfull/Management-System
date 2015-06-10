package daoImpl;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.web.model.Groups;

import dao.GroupDao;

@Repository
public class GroupDaoImpl implements GroupDao {

	@Autowired
	private SessionFactory sessionFactory;

	public GroupDaoImpl() {

	}

	public GroupDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;

	}

	@Override
	@Transactional
	public void addGroup(Groups group) {
		sessionFactory.getCurrentSession().save(group);
	}

	@Override
	@Transactional
	public void updateGroup(Groups groups) {
		
		sessionFactory.getCurrentSession().update(groups);

	}

	@Override
	@Transactional
	public void removeGroup(int id) {
		
		Groups groupTodelete = new Groups();
		groupTodelete.setGroupId(id);
		sessionFactory.getCurrentSession().delete(groupTodelete);
	}

	@Override
	@Transactional
	public List<Groups> listGroups() {
		
		@SuppressWarnings("unchecked")
		List<Groups> groupList = sessionFactory
				.getCurrentSession().createCriteria(Groups.class)
				.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY).list();
		return groupList;
	}

	@Override
	@Transactional
	public Groups getGroupById(int id) {
		
		String hql = "from Groups where id=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<Groups> listGroups = query.list();
		if (listGroups != null && !listGroups.isEmpty()) {
			return listGroups.get(0);
		}

		return null;
	}

	@Override
	@Transactional
	public Groups grtGroupsByName(Groups name) {
		
		String hql = "from Groups where name=" + name;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<Groups> listGroups = query.list();
		if (listGroups != null && !listGroups.isEmpty()) {
			return listGroups.get(0);
		}
		return null;
	}

}
