package net.superbid.backenddeveloper.dto;

import java.io.Serializable;
import java.sql.Timestamp;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("deprecation")
public class PostDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotEmpty(message="Preenchimento obrigatório!")
	@Length(min=5, max=80, message="O campo deve possuir entre 5 e 80 caracteres!")
	private String titulo;

	@NotEmpty(message="Preenchimento obrigatório!")
	@Length(min=15, max=180, message="O campo deve possuir entre 15 e 180 caracteres!")
	private String descricao;
	
	private Timestamp created_at;
	private Timestamp updated_at;
	
	public PostDTO() {
	}

	public PostDTO(Integer id, String titulo, String descricao, Timestamp created_at, Timestamp updated_at) {
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

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public Timestamp getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}

}
