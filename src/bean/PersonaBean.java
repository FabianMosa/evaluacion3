package bean;

import java.util.Date;

public class PersonaBean {
	private String rut;
	private String nombre;
	private String apellido;
	private int telefono;
	private Date fechaIngreso;
	
	
	public PersonaBean(String rut, String nombre, String apellido, int telefono, Date fechaIngreso) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.fechaIngreso = fechaIngreso;
	}


	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public Date getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	@Override
	public String toString() {
		return "PersonaBean [rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	
	
	
}
