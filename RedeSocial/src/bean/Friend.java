package org.baseSocial.model.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Friend {
	@OneToMany(fetch=FetchType.EAGER)
	private List<People> pessoas;
	@Id
	private Long idPesssoa;
	
	
	public List<People> getPessoas() {
		return pessoas;
	}
	public void setPessoas(List<People> pessoas) {
		this.pessoas = pessoas;
	}
	public Long getIdPesssoa() {
		return idPesssoa;
	}
	public void setIdPesssoa(Long idPesssoa) {
		this.idPesssoa = idPesssoa;
	}

}
