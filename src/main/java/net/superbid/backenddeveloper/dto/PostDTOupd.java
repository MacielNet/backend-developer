package net.superbid.backenddeveloper.dto;

import java.io.Serializable;
import java.sql.Timestamp;

import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

public class PostDTOupd implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(position = 1, hidden = true, required = false)
	private Integer id;
	
	@Length(min=5, max=80, message="O campo deve possuir entre 5 e 80 caracteres!")
	@ApiModelProperty(position = 2, hidden = false, required = true)
	private String titulo;

	@Length(min=15, max=180, message="O campo deve possuir entre 15 e 180 caracteres!")
	@ApiModelProperty(position = 3, hidden = false, required = true)
	private String descricao;
	
	@ApiModelProperty(position = 4, hidden = true, required = false)
	private Timestamp created_at;
	@ApiModelProperty(position = 5, hidden = true, required = false)
	private Timestamp updated_at;
	
	public PostDTOupd() {
	}

	public PostDTOupd(Integer id, String titulo, String descricao, Timestamp created_at, Timestamp updated_at) {
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
