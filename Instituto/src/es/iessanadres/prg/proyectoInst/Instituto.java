package es.iessanadres.prg.proyectoInst;

public class Instituto {
	private String nombre;
	private Departamento[] departamentos;
	
	public Instituto(String nombre, Departamento[] departamentos) {
		this.nombre = nombre;
		this.departamentos = departamentos;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private Departamento[] getDepartamentos() {
		return departamentos;
	}

	private void setDepartamentos(Departamento[] departamentos) {
		this.departamentos = departamentos;
	}
	
	
}
