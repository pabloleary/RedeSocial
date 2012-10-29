package org.baseSocial.model.dao;

import java.io.Serializable;

public abstract class EntityObject implements Serializable{	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5037708600568186230L;

	public abstract Serializable getId();
	
	public Boolean hasValidId(){
		return this.getId() != null;
	}
	
}
