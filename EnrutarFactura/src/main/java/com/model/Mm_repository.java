package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mm_repository")
public class Mm_repository implements Serializable {
	public Mm_repository() {

	}

	@Id
	@Column(name = "id")
	private Integer id; 
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "mm_id")
	private String mmId;
	@Column(name = "endpoint")
	private String endPoint;
	@Column(name = "tipo")
	private String tipo;
	@Column(name = "metodo")

	private String metodo;
	@Column(name = "config")
	private String config;

	@Column(name = "accion")
	private String accion;
	@Column(name = "campoValor")
	private String campoValor;
	@Column(name = "campoMensaje")
	private String campoMensaje;

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public String getCampoValor() {
		return campoValor;
	}

	public void setCampoValor(String campoValor) {
		this.campoValor = campoValor;
	}

	public String getCampoMensaje() {
		return campoMensaje;
	}

	public void setCampoMensaje(String campoMensaje) {
		this.campoMensaje = campoMensaje;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	@Override
	public String toString() {
		return "Mm_repository [mmId=" + mmId + ", endPoint=" + endPoint + ", tipo=" + tipo + ", metodo=" + metodo
				+ ", config=" + config + ", accion=" + accion + ", campoValor=" + campoValor + ", campoMensaje="
				+ campoMensaje + "]";
	}

	public String getMmId() {
		return mmId;
	}

	public void setMmId(String mmId) {
		this.mmId = mmId;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

}
