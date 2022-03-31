package es.iessanadres.prg.proyectoInst;

public class Clase {
	private int numero;
	private String nombre;
	private String curso;
	private Asignatura[] asignaturas;
	
	public Clase(int numero, String nombre, String curso, Asignatura[] asignaturas) {
		this.numero = numero;
		this.nombre = nombre;
		this.curso = curso;
		this.asignaturas = asignaturas;
	}

	private int getNumero() {
		return numero;
	}

	private void setNumero(int numero) {
		this.numero = numero;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCurso() {
		return curso;
	}

	private void setCurso(String curso) {
		this.curso = curso;
	}

	private Asignatura[] getAsignaturas() {
		return asignaturas;
	}

	private void setAsignaturas(Asignatura[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	
}
