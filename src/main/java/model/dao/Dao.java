package main.java.model.dao;

import java.io.Serializable;
import java.util.List;



public interface Dao<T extends EntityObject,PK extends Serializable> {
	
	public void save();

	public void update(T entity);
	
	public void delete(T entity);

	public List<T> listAll();

}
