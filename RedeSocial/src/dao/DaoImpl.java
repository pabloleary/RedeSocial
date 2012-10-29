package org.baseSocial.model.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;


public class DaoImpl<T extends EntityObject, PK extends Serializable>
		implements Dao<EntityObject, Serializable> {

	private Session session;

	public DaoImpl() {
		session = HibernateUtil.getSession();
	}

	public void save(Object arg0) {
		session.beginTransaction();
		session.save(arg0);

	}

	public void update(EntityObject entity) {
		// TODO Auto-generated method stub

	}

	public void delete(EntityObject entity) {
		// TODO Auto-generated method stub

	}

	public List<EntityObject> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public void save() {
		// TODO Auto-generated method stub
		
	}

}
