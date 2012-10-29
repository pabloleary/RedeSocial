package org.baseSocial.model.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Post {

	@Id
	private Long id;
	private String post;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

}
