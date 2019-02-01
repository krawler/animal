package visualmix.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import visualmix.util.HibernateUtil;

public abstract class DaoImplementacao<T> implements DaoInterface<T> {

	private Class<T> persistenceClass;

	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public DaoImplementacao(Class<T> persistenceClass) {
		super();
		this.persistenceClass = persistenceClass;
	}
		
	public List<T> findAll() throws Exception {
		List<T> retorno = null;
		sessionFactory.getCurrentSession().beginTransaction();
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(persistenceClass);
		criteria.addOrder(Order.asc("id"));
		retorno = criteria.list();
		sessionFactory.getCurrentSession().getTransaction().commit();
		return retorno;
	}
	
	public T find(Long codigo) throws Exception { 
		return (T) sessionFactory.getCurrentSession().get(persistenceClass, codigo);
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public Class<T> getPersistenceClass() {
		return persistenceClass;
	}
	
}
