package es.iessanadres.prg.proyectoInst;

public class Nota {
	private float puntuacion;
	private Alumno alumno;
	private Asignatura asignatura;
	
	public Nota(float puntuacion, Alumno alumno, Asignatura asignatura) {
		this.puntuacion = puntuacion;
		this.alumno = alumno;
		this.asignatura = asignatura;
	}

	public float getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(float puntuacion) {
		this.puntuacion = puntuacion;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	
	
}