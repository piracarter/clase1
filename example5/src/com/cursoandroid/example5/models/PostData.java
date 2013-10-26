package com.cursoandroid.example5.models;


public class PostData {

	private String fecha_publicacion;
	private String titulo;
	private boolean leido;

	public PostData(String fecha, String titulo, boolean checked) {
		this.fecha_publicacion = fecha;
		this.titulo = titulo;
		this.leido = checked;
	}

	public String getFecha_publicacion() {
		return fecha_publicacion;
	}

	public void setFecha_publicacion(String fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isLeido() {
		return leido;
	}

	public void setLeido(boolean leido) {
		this.leido = leido;
	}

}
