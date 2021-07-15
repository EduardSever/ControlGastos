package com.educarte.demo.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name ="categoria")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id_categoria")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotEmpty(message="se debe ingresar un id")
	@NotNull
	private int id;
	@NotNull
	private String name_categoria;
	
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<RelaGasto> relagastos;

	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categoria(int id, String name_categoria, List<RelaGasto> relagasto) {
		super();
		this.id = id;
		this.name_categoria = name_categoria;
		this.relagastos = relagasto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName_categoria() {
		return name_categoria;
	}

	public void setName_categoria(String name_categoria) {
		this.name_categoria = name_categoria;
	}

	public List<RelaGasto> getRelagasto() {
		return relagastos;
	}

	public void setRelagasto(List<RelaGasto> relagasto) {
		this.relagastos = relagasto;
	}
	
}	