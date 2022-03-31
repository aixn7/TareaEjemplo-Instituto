package es.iessanadres.prg.proyectoInst;

public class Departamento {
	private String nombre;
	private Profesor[] profesores;
	
	public Departamento(String nombre, Profesor[] profesores) {
		this.nombre = nombre;
		this.profesores = profesores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Profesor[] getProfesores() {
		return profesores;
	}

	public void setProfesores(Profesor[] profesores) {
		this.profesores = profesores;
	}
	
	
}
