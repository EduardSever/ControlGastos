package com.educarte.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="relagastos")
public class RelaGasto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	
	private int id_gasto;
//	@JsonFormat(pattern="YYYY-MM-DD", shape = Shape.STRING)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	 /*@DateTimeFormat(pattern = "yyyy-MM-dd")*/
	private Date fecha;
	private double importe;
	private String concepto;
	@ManyToOne
	@JoinColumn(name="id_categoria")
	private Categoria categoria;
	public RelaGasto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RelaGasto(int id_gasto, Date fecha, double importe, String concepto, Categoria categoria) {
		super();
		this.id_gasto = id_gasto;
		this.fecha = fecha;
		this.importe = importe;
		this.concepto = concepto;
		this.categoria = categoria;
	}
	public int getId_gasto() {
		return id_gasto;
	}
	public void setId_gasto(int id_gasto) {
		this.id_gasto = id_gasto;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}