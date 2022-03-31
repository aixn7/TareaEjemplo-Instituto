package es.iessanadres.prg.proyectoInst;

public class Asignatura {
	private String nombre;
	private Alumno[] alumnos;
	private Profesor profesor;
	public Asignatura(String nombre, Alumno[] alumnos, Profesor profesor) {
		this.nombre = nombre;
		this.alumnos = alumnos;
		this.profesor = profesor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Alumno[] getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	
}
