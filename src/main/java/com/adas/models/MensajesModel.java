package com.adas.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "mensajes")
public class MensajesModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_mensaje")
	private Integer id;
	
	@Column(name = "fecha")
	private Date fecha;

	@Column(name = "mensaje")
	private String mensaje;
	
	@ManyToOne
	@JoinColumn(name = "noticia_id")
	private NoticiasModel noticiaId;
	
	@ManyToOne
	@JoinColumn(name = "autor_id")
	private AutoresModel autorId;

	/******* GETTERS Y SETTERS *******/
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public NoticiasModel getNoticiaId() {
		return noticiaId;
	}

	public void setNoticiaId(NoticiasModel noticiaId) {
		this.noticiaId = noticiaId;
	}

	public AutoresModel getAutorId() {
		return autorId;
	}

	public void setAutorId(AutoresModel autorId) {
		this.autorId = autorId;
	}
}
