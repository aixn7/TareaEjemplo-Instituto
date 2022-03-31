package es.iessanadres.prg.proyectoInst;

public class Alumno {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int edad;
	
	public Alumno(String nombre, String apellido1, String apellido2, int edad) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getApellido1() {
		return apellido1;
	}

	private void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	private String getApellido2() {
		return apellido2;
	}

	private void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	private int getEdad() {
		return edad;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
