package net.superbid.backenddeveloper.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post implements Serializable {
	/**
	 * Class Post 
	 * author: Wesley Maciel 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String descricao;
	private Timestamp created_at;
	private Timestamp updated_at;
	
	public Post() {
	}

	public Post(Integer id, String titulo, String descricao, Timestamp created_at, Timestamp updated_at) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Timestamp getCreate_at() {
		return created_at;
	}

	public void setCreate_at(Timestamp create_at) {
		this.created_at = create_at;
	}

	public Timestamp getUpdate_at() {
		return updated_at;
	}

	public void setUpdate_at(Timestamp update_at) {
		this.updated_at = update_at;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	
}
